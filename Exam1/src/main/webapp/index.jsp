<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<body>

<%
	String flag ="";
	Object obj = session.getAttribute("flag");
	if(obj != null){
		flag = obj.toString();
	}
	
	if(flag.equals("login_success")){
%>

		<center><a href="/LogoutServlet">退出</a><br /></center>
<% }else{ %>
		<center><a href="login.jsp">登录</a><br /></center>
<% } %>
	<center>
		<br> <a href="/ShowServlet">列表显示界面</a><br /> 
		<a href="/LanguageServlet">新增电影</a>
	</center>
</body>
</html>
