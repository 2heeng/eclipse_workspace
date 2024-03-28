<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sec02.ex01.*"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="m" class="sec02.ex01.MemberBean"></jsp:useBean>
<jsp:setProperty property="*" name="m"/>
<%
MemberDAO memDAO = new MemberDAO(); 
memDAO.addMember(m);
List membersList = memDAO.listMembers();
request.setAttribute("membersList", membersList);
%>
<jsp:forward page="membersList.jsp"></jsp:forward>
</body>
</html>