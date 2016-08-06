<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<body>
<%
	String func1 = "1、添加/index.jsp,将本次实现在的功能链接全部显示,如点击登录的链接后,跳转到登录页面<br/>";
	String func2 = "2、用户登录,用户通过login界面输入name,只要name与customer表的first_name相同,则表示登录成功,否则失败<br/>";
	String func3 = "3、实现对film表的列表显示,新增,删除界面,应用jsp<br/>"+
			        "3.1、列表显示界面:显示所有的film,显示的字段有film_id,title,description,language(需要关联language表)<br/>"+
					"3.2、新增界面:需要有title,description,language字段,language需要从选择框中选取,选择项来源于language表<br/>"+
					"3.3、删除功能:在列表显示界面中,每条记录行添加一个删除链接,用来删除记录";
%>

<a href="login.jsp">登录</a><br/>
<a href="func1"></a>
<a href="func2"></a>
<a href="func3"></a>
<a href="func4"></a>

</body>
</html>
