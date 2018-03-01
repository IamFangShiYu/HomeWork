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

<c:if test="${allErrors!=null }">
<br/>
			 <c:forEach items="${allErrors}" var="error">
			 	${error.defaultMessage }<br/>
			 </c:forEach>
		</c:if>

<form action="${pageContext.request.contextPath}/Overtimerecord/update.action" class="form-horizontal">
   	
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">加班单号</label>
                <div class="col-sm-9">
                	<input type="text" value="${attOvertimerecord.overtimeid }" name="overtimeid" readonly="readonly" class="form-control input-sm" placeholder="请输入加班单号"/>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">加班日期</label>
                <div class="col-sm-9">
                	   <input type="text" value="${attOvertimerecord.overtimedate }"  name="overtimedate" onclick="WdatePicker()" readonly="readonly" class="form-control input-sm" placeholder="加班日期"/>
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
							<option value="">请选择</option>
							<c:forEach items="${employeeslist}" var="emplo">
								<option value="${emplo.employeeid}" 
								${emplo.employeeid==attOvertimerecord.employeeid?'selected':''}
								>${emplo.employeename}</option>
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
							<option value="">请选择</option>
							<c:forEach items="${employeeslist}" var="emplo">
								<option value="${emplo.employeeid}" 
								${emplo.employeeid==attOvertimerecord.operatorid?'selected':''}
								>${emplo.employeename}</option>
							</c:forEach>
						</select>
					</div>
				</div>
            </div>
        
        </div>
        
        
    </div>
    <!-- 结束2 -->
  <!-- 3 -->
  <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">加班时段</label>
                 <div class="form-group">
					<div class="col-sm-5">
						<select class="form-control input-sm" name="overtimeflag">
							<option value="">请选择</option>
							
								<option value="${1}"  ${1==attOvertimerecord.overtimeflag?'selected':''}>上午</option>
								<option value="${2}" ${2==attOvertimerecord.overtimeflag?'selected':''}>下午</option>
								<option value="${3}" ${3==attOvertimerecord.overtimeflag?'selected':''}>晚上两小时</option>
							
						</select>
					</div>
				</div>
            </div>
        
        </div>
        
        <div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">是否调休</label>
                <div class="form-group">
					<div class="col-sm-5">
						<select class="form-control input-sm" name="overtimestate">
							<option value="">请选择</option>
							    <option value="${1} ${1==attOvertimerecord.overtimestate?'selected':''}" >需要调休</option>
								<option value="${2}" ${2==attOvertimerecord.overtimestate?'selected':''}>无需调休</option>
						</select>
					</div>
				</div>
            </div>
        
        </div>
        
        
    </div>
  
  <!-- 3 -->
<!-- 4 -->
   <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">是否审核</label>
                 <div class="form-group">
					<div class="col-sm-5">
						<select class="form-control input-sm" name="isverify">
							<option value="">请选择</option>
							
								<option value="${1}" ${1==attOvertimerecord.isverify?'selected':''} >已审核</option>
								<option value="${2}" ${2==attOvertimerecord.isverify?'selected':''} >未审核</option>
								
							
						</select>
					</div>
				</div>
            </div>
        
        </div>
        
        <div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">单据编号</label>
                <div class="form-group">
					<div class="col-sm-5">
						<select class="form-control input-sm" name="noteid">
							<option value="">请选择</option>
							<c:forEach items="${attNoteslist}" var="attNotes">
								<option value="${attNotes.noteid}" ${attNotes.noteid==attOvertimerecord.noteid?'selected':''} >${attNotes.noteid}</option>
							</c:forEach>
						</select>
					</div>
				</div>
            </div>
        
        </div>
        
        
    </div>
  
   
<!-- 4 -->
   


		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">备注</h5>
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="overtimememo">${attOvertimerecord.overtimememo}</textarea>
					</div>
				</div>

			</div>

		</div>
   
   
   
   
   
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>
        	 <input  type="reset" class="btn btn-success" value="取消"/>         
        </div>
    </div>
</form>





</body>
</html>
