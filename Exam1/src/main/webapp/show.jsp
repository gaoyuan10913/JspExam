<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.hand.entity.Film"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电影信息</title>
</head>
<body>
	<center>
		<h1>电影列表</h1>
		<a href="index.jsp">返回</a>
	</center>
	
	<table align="center" width="666" border="1" height="180"
		bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
		<tr align="center" bgcolor="#e1ffc1">
			<td><b>ID</b></td>
			<td><b>标题</b></td>
			<td><b>描述</b></td>
			<td><b>语言</b></td>
			<td width="50"><b>操作</b></td>
		</tr>
		<% 
			// 获取电影信息集合 
			ArrayList<Film> list = (ArrayList<Film>) request.getAttribute("list");
			// 判断集合是否有效  
			if (list == null || list.size() < 1) {
				out.print("没有数据！");
			} else {
				for (Film film : list) {
		%>
		<tr align="center" bgcolor="white">
			<td><%=film.getFilm_id()%></td>
			<td><%=film.getTitle()%></td>
			<td><%=film.getDescription()%></td>
			<td><%=film.getLanguage_name()%></td>
			<td>
				<a href="#">删除&nbsp;</a>
				<a href="/EditServlet?film_id=<%= film.getFilm_id()%>&title=<%= film.getTitle()%>&description=<%=film.getDescription()%>">编辑&nbsp;</a>
			</td>
		</tr>
		<%
			}
			}
		%>
	</table>
</body>
</html>