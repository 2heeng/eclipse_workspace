<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원검색</h1>

<!-- 
검색하는 경우의 수
1. 이름 입력X , 이메일 입력X, 검색

select * from t_member

2. 이름 입력O , 이메일 입력X, 검색

select * from t_member where name like '이름'

3. 이름 입력X , 이메일 입력O, 검색

select * from t_member where email like 'email'

4. 이름 입력O , 이메일 입력O, 검색

select * from t_member where email like 'email' and name like '이름'
 -->

<form action="${contextPath}/mem4.do">
<input type="hidden" name="action" value="searchMember">
	이름 : <input  type="text" name="name" /><br>
   이메일 : <input  type="text" name="email" /><br>
   <input type="submit" value="검색"  />
</form>
</body>
</html>