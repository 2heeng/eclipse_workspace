<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.class2{
text-align: center;}
</style>
</head>
<body>
	<%-- ${articlesList } --%>
	<br>

	<table align="center" border="1" width="80%">
		<tr height="10" align="center" bgcolor="lightgreen">
			<td>글번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>작성일</td>
		</tr>

		<c:choose>
			<c:when test="${empty articlesList}">
				<tr height="10">
					<td colspan="4">
						<p align="center">
							<b><span style="font-size: 9pt;">등록된 글이 없습니다.</span></b>
						</p>
					</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="article" items="${articlesList}" varStatus="articleNum">
				<%-- ${articleNum.count } 몇번째 반복인지 나타냅니다. 1부터 시작합니다.--%>
					<tr align="center">
					<td width="5%">${articleNum.count}</td>
					<td width="10%">${article.id}</td>
					<td align="left" width="35%">
					<span style="padding-right:30px"></span>
					<!-- <!--레벨이 1보다 큰경우  -->
					<c:choose> 
					<c:when test="${article.level > 1}">
					<c:forEach begin="1" end="${article.level}" step="1">
					<span style="padding-left:20px"></span>
					</c:forEach>
					<span style="font-size:12px;">[답변]</span>
					<a class='class1' href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title}</a>
					</c:when>
					
					<c:otherwise>
					<a class='class1' href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title }</a>
					</c:otherwise>
					</c:choose></td>
					<td>
					<a class='class1' href="#">${article.writeDate }</a>
					</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>

	</table>
	<a class='class1' href="${contextPath}/board/articleForm.do"><p class='class2'>글쓰기</p></a>
</body>
</html>