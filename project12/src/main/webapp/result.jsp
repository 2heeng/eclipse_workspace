<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("password");

%>
<body>
<h1>결과출력</h1><br>
<h1>아이디 : 
<%= id %><br>
비밀번호 : 
<%= pwd %>
</h1>
</body>
</html>