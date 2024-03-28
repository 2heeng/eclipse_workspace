<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorpage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아래는 강아지
<hr>
<%@ include file="dog.jsp" %>
<% 

String test = "test";
int num = Integer.parseInt(test);




%>
<hr>
위에는 멍멍이 사진
</body>
</html>