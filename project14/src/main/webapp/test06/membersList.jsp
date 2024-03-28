<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
 <table align="center" border="1" width="100%">
	 <tr align="center" bgcolor="#99ccff">
	      <td width="7%" >아이디</td>
	      <td width="7%">비밀번호</td>
	      <td width="5%" >이름</td>
	      <td width="11%" >이메일</td>
	      <td width="5%" >가입일</td>
	      <td width="5%">삭제</td>
	   </tr>
	<c:choose>
	<c:when test="${membersList==null}">
	<tr>
	<td colspan="5">등록된 회원이 없습니다.</td>
	</tr>
	</c:when>
	<c:when test="${membersList!=null }">
	<c:forEach var="mem" items="${membersList }">
	<tr align="center">
	<td>${mem.id}</td>
	<td>${mem.pwd}</td>
	<td>${mem.name}</td>
	<td>${mem.email}</td>
	<td>${mem.joinDate}</td>
	<td><a href="#">삭제</a></td>
	</tr>
	</c:forEach>
	

	</c:when>
	</c:choose>
	
	
	</table>
</body>
</body>
</html>