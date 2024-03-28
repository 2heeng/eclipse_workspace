<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="${contextPath}/upload.do"  method="post" enctype="multipart/form-data" >
      파일1: <input type="file" name="file1" ><br>
      파일2: <input type="file" name="file2" ><br>
      <input type="text" name="filewithcontents">
 <input type="submit" value="파일 업로드">
</form>
</body>
</html>