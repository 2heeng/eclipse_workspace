<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% int score = Integer.parseInt(request.getParameter("score")); %>
</head>
<body>
<h1>시험점수 <%=score %>점</h1>
<br>
<%
if(score>=90){
	%> <h1>A학점입니다.</h1><% 
} else if(score>=80 && score < 90){
	%> <h1>B학점입니다.</h1><%
} else if(score>=70 && score < 80){
	%> <h1>C학점입니다.</h1><%
} else if(score>=60 && score < 70){
	%> <h1>D학점입니다.</h1><%
} else {
	%> <h1>F학점입니다.</h1><%
}%>
</body>
</html>