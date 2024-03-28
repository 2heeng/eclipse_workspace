<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="${contextPath}/test/login.do">
<h3>아이디: <input type="text" name="ID"></h3>
<h3>비밀번호: <input type="password" name="password"></h3>
<input type="submit" value="로그인">
</form>
</body>
</html>