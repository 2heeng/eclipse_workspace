<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int num = 104;
String str = "zerofour";
%>
<%!
String hi(){
	return "안녕!";
}

int hi2(){
	return 9256;
}

String hi3(){
	return "9256";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");



%>
여기는 loginResult.jsp <br>
<%= id %>님 반갑습니다.
<%= str+num %>
<hr>
<%= hi() %>
<%= hi2()+3 %>
<%=19+hi3() %>
<%= Integer.parseInt(hi3()) - 9200 %>

</body>
</html>