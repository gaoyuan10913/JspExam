<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>错误页面</title>
<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
}

#message {
	text-align: center;
}
</style>
</head>
<body>
	<div id="message">
		登录失败<br />
		<%
			Object obj = request.getAttribute("msg");
			if (obj != null) {
				out.println(obj.toString());
			} else {
				out.println("无");
			}
		%>
		登录的用户名是：<%=request.getParameter("name")%><br /> 
		<a href="login.jsp">返回登录页面</a>
	</div>
</body>
</html>