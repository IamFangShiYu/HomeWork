<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
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
    	<li><a href="#">系统管理</a></li>
        <li>职位管理</li>
    </ul>
</div>
<script type="text/javascript">
		function query(condition){
			$("#keyword").attr("name",condition.value);
		}
</script>


<form action="${pageContext.request.contextPath}/system/position/add.action" class="form-horizontal">
   	
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                	<input type="text" name="positionid" value="${attPosition.positionid}" readonly="readonly" class="form-control input-sm" placeholder="请输入编号"/>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">职位名</label>
                <div class="col-sm-9">
                	<input type="text" name="positionname" value="${attPosition.positionname}" class="form-control input-sm" placeholder="请输入部门名"/>
                </div>
            </div>
        </div>

    </div>
    
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>
            <input  type="reset" class="btn  btn-danger" value="取消"/>
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
   <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">职位列表</h5>
<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/system/position/list.action">
    	<display:column property="positionid" title="编号"></display:column>
    	<display:column property="positionname" title="职位名" ></display:column>
    
    	<display:column href="${pageContext.request.contextPath }/system/position/show.action" paramId="positionid" paramProperty="positionid" value="修改" title="修改"></display:column>
    	<display:column href="${pageContext.request.contextPath }/system/position/delete.action" paramId="positionid" paramProperty="positionid" value="删除" title="删除"></display:column>
    	
    </display:table>
    
    
</div>

</body>
</html>
