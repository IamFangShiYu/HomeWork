<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<%@ include file="/view/public/common.jspf" %>

</head>
<body class="login-layout">
	<div class="main-container">
		<div class="main-content">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1">
					<div class="login-container">
						<div class="center">
							<h1>
								<i class="icon-leaf green"></i> <span class="red">咕噜噜</span> <span
									class="white">考勤管理</span>
							</h1>
							<h4 class="blue">方世玉</h4>
						</div>
						<div class="space-6"></div>
						<div class="position-relative">
							<div id="login-box"
								class="login-box visible widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header blue lighter bigger">
											<i class="icon-coffee green"></i> 登陆
										</h4>

										<div class="space-6"></div>
										<form action="${pageContext.request.contextPath}/admin/list.action" method="post" onsubmit="return check()">
											<fieldset>
												<label class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input id="adminaccount"
														name="adminaccount" type="text" class="form-control"
														placeholder="请输入账号" /> <i class="icon-user"></i>
												</span>
												</label> <label class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input id="adminpwd"
														name="adminpwd" type="text" class="form-control"
														placeholder="请输入密码" /> <i class="icon-lock"></i>
												</span>
												</label>
												 <h5>${name}</h5>
												<div class="clearfix">

													<button type="submit"
														class="width-35 pull-right btn btn-sm btn-primary">
														<i class="icon-key"></i> 登陆
													</button>
												</div>

												<div class="space-4"></div>
											</fieldset>
										</form>

									</div>

								</div>

							</div>


					</div>

				</div>
			</div>

		</div>
</div>
	</div>
</body>
</html>
