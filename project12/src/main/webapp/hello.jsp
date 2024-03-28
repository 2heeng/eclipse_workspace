<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
    String name = "듀크";
    
    public String getName(){
    	return name;
    }
    %>
<%
    String blabla = request.getParameter("blabla"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%=name %>
	<hr>
	<%= getName()%>
	<hr>
	<%=blabla %>
</body>
</html>