<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
}
#message{
	text-align: center;
}
</style>

</head>
<body>
<div id="message">
	登录成功<br/>
	登录的用户名是：<%= request.getParameter("name") %><br/>
	<a href="/ShowServlet">列表显示界面</a><br /> 
	<a href="/LanguageServlet">新增电影</a>
</div>
</body>
</html>