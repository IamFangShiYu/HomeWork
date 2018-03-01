<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>

<%@ include file="/view/public/common.jspf" %>

</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">考勤管理管理</a></li>
        <li>加班管理</li>
    </ul>
</div>
<script type="text/javascript">
		function query(condition){
			$("#keyword").attr("name",condition.value);
		}
</script>


<form action="${pageContext.request.contextPath}/Overtimerecord/list.action" class="form-horizontal">
   	
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">加班单号</label>
                <div class="col-sm-9">
                	<input type="text" name="overtimeid"  class="form-control input-sm" placeholder="加班单号"/>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">加班日期</label>
                <div class="col-sm-9">
                	   <input type="text" name="overtimedate" value=""  onclick="WdatePicker()" readonly="readonly" class="form-control input-sm" placeholder="加班日期"/>
               </div>
            </div>
        </div>

    </div>
    <!-- 开始2 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">申请人</label>
                 <div class="form-group">
					<div class="col-sm-5">
						<select class="form-control input-sm" name="operatorid">
						
							<option value="" >请选择</option>
							<c:forEach items="${employeeslist}" var="emplo">
								<option value="${emplo.employeeid}" >${emplo.employeename}</option>
							</c:forEach>
						</select>
					</div>
				</div>
            </div>
        
        </div>
        
        <div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">代理人</label>
                <div class="form-group">
					<div class="col-sm-5">
						<select class="form-control input-sm" name="employeeid">
							<option value="" >请选择</option>
							<c:forEach items="${employeeslist}" var="emplo">
								<option value="${emplo.employeeid}" >${emplo.employeename}</option>
							</c:forEach>
						</select>
					</div>
				</div>
            </div>
        
        </div>
        
        
    </div>
    <!-- 结束2 -->
  
   
   
   
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="查询"/>
        	 <a href="${pageContext.request.contextPath }/Overtimerecord/addload.action"  > 
   			 <input type="button"   class="btn btn-success"   value="添加" />
   			 </a>            
        </div>
    </div>
</form>




<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">${info}</p>
	</div>	
</div>

<br>
<br>
   <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">部门列表</h5>
<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/Overtimerecord/list.action">

    	<display:column property="overtimeid" title="编号"></display:column>
    	<display:column property="employeeid" title="员工编号" ></display:column>
    	<display:column property="operatorid" title="负责人编号"></display:column>
    	<display:column property="noteid" title="单据号"></display:column>
    	<display:column property="overtimedate" title="加班日期" format="{0,date,yyyy年MM月dd日}" ></display:column>
    	<display:column property="overtimeflag" title="加班时段"></display:column>
    	<display:column property="overtimestate" title="是否调休"></display:column>
    	<display:column property="isverify" title="是否审核"></display:column>
    	<display:column href="${pageContext.request.contextPath }/Overtimerecord/show.action" paramId="overtimeid" paramProperty="overtimeid" value="修改" title="修改"></display:column>
    	<display:column href="${pageContext.request.contextPath }/Overtimerecord/delete.action" paramId="overtimeid" paramProperty="overtimeid" value="删除" title="删除"></display:column>
    	
    </display:table>
    
    
</div>

</body>
</html>
