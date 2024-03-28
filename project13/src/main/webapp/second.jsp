<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
여기는 두번째 페이지 입니다. 
<% String name = request.getParameter("name"); %>
<%=name %>님

</body>
</html>