<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.hand.entity.Language" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加电影</title>

<script type="text/javascript">
	function check(form) {
		if (document.forms.addFilm.title.value == "") {
			alert("请输入标题");
			document.forms.addFilm.title.focus();
			return false;
		}
		if (document.forms.addFilm.description.value == "") {
			alert("请输入描述");
			document.forms.addFilm.description.focus();
			return false;
		}
	}
</script>

</head>
<body>

	<center>
		<h1>添加电影</h1>
		<a href="index.jsp">返回</a>
	</center>

	<form action="/AddServlet" method="post" name="addFilm">
		<table align="center" width="450">
			<tr>
				<td align="right">Title：</td>
				<td><input type="text" name="title"></td>
			</tr>

			<tr>
				<td align="right">Description：</td>
				<td><input type="text" name="description"></td>
			</tr>

			<tr>
				<td align="right">Language：</td>
				<td><select name="language">
						<%
							ArrayList<Language> list = (ArrayList<Language>) request.getAttribute("list");

							for (Language language : list) {
						%>
							<option value=<%=language.getLanguageID() %>><%=language.getName() %></option>

						<%
							}
						%>
				</select></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="添　加" onclick="return check(this);">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>