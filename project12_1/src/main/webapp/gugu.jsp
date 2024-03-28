<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
int dan = Integer.parseInt(request.getParameter("dan"));
%>
<style>
	table,tr,td { border: 1px black solid; width: 700px; text-align:center}
	
	#headline { background-color: yellow;}
</style>
</head>
<body>
	<table>
		<tr>
			<td id="headline" colspan="2"><%=dan%>단 출력</td>
		</tr>
		<%
		for(int i=0;i<9;i++){
%>
		<tr>
			<td><%=dan%>*<%=i%></td>
			<td><%= dan *i %></td>
		</tr>
		<% }%>
	</table>
</body>
</html>