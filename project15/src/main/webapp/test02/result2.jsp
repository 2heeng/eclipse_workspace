<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<img src="${contextPath}/download.do?fileName=ar.jpg" width="300" height="300">
<a href="${contextPath}/download.do?fileName=ar.jpg">이미지 다운로드</a>
</body>
</html>