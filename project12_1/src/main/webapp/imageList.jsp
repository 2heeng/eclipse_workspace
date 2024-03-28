<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.list-type{width: 80%; padding: 0 10px 10px; margin: 0 auto;}
	.list-type li{clear:both; margin:10px 0 0; color: blue; list-style: none; border-bottom: 2px solid lightgray;position: relative;line-height: 100px;}
	.list-type li img{display: inline; float: left; position: absolute;}
	/* ul{align-content: center;}
	li{list-style: none; border-bottom: 2px solid gray; padding-bottom: 50px; }
	#header{color: blue;}
	li span{margin-right: 200px; align-content: center;} */
	
</style>
</head>
<body>
	<ul class="list-type">
		
		<li id="header"><span>이미지 </span><span>이미지 이름 </span><span>선택하기</span></li>
		<%for(int i=0; i<5;i++){%>
		<li><a href="#"><img alt="" src="dog1.jpg" width="90px" height="90"></a><a href="#">이미지 이름: 듀크<%=i%></a>
		<a href="#"><input type="checkbox"></a></li>
<%} %>
		
	</ul>
</body>
</html>