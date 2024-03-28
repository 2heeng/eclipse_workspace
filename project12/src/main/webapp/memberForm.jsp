<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1 {text-align: center;}
.category {width: 200}
.inputBox {width: 400}
</style>
</head>
<body>
<h1>회원 가입창</h1><br>
<table align="center">
<tr><td class="category">아이디</td><td class="inputBox"><input type="text" name="id"></td></tr>
<tr><td class="category">비밀번호</td><td class="inputBox"><input type="password" name="password"></td></tr>
<tr><td class="category">이름</td><td class="inputBox"><input type="text" name="userName"></td></tr>
<tr><td class="category">이메일</td><td class="inputBox"><input type="email" name="userEmail"></td></tr>
<tr><td class="category"><p>&nbsp;</p></td><td class="inputBox"><input type="submit" value="가입하기"> <input type="reset" value="다시입력"></td></tr>
</table>
</form>
</body>
</html>