<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
여기는 첫번째 페이지입니다. 
<!-- <a href="second.jsp?name=홍길동">second page</a> -->
<jsp:forward page="second.jsp?name=홍길동"></jsp:forward>
</body>
</html>