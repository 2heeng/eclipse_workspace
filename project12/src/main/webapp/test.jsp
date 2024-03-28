<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String id = request.getParameter("id");
String pwd = request.getParameter("password");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
---------------표현식-----------------<br>
<%= id %>
<hr>
---------------out.print-----------------<br>
<% /* out: JspWriter ---> System.out과 비슷한 기능 */
out.print("blabla"); %><hr>
---------------자료형과 연산자-----------------<br>
${1} <br>
${3.4} <br>
${true} <br>
${false}++${null}
<!-- ${hello}  이건 안나옴 -->
${"hello"} <hr>
--------------empty 연산자-----------------<br>
${empty ""} <br> <!-- <값>이  null 이거나 빈 문자열이면 true를 반환합니다. -->
${empty null} <hr>
--------------논리 연산자-----------------<br>
\${true and true} : ${true and true} <br>
\${true && true} : ${true && true} <br>
\${true or false} : ${true or false} <br>
\${true || false} : ${true || false} <br>
\${(10==10)&&(20==20)} : ${(10==10)&&(20==20)} <br>
\${(10==10)||(20!=30)} : ${(10==10)||(20!=30)} <hr>
--------------산술 연산자-----------------<br>
\${10+10 } : ${10+10 } <br>
\${100/9} : ${100/9} <hr>
--------------비교 연산자-----------------<br>
\${10 == 10 } : ${10 == 10 }<br>
\${10 eq 10 } : ${10 eq 10 }<br>
\${"hi"=="hi"} : ${"hi"=="hi"}<br>
\${"hi"eq"hi"} : ${"hi"eq"hi"}<br>
\${20!=10} : ${20!=10}<br>
<%-- \${20 ne 10} : ${20 ne 10}<br>
\${"hi"ne"bye"} : ${"hi"ne"bye"}<br> --%>
\${10 < 20 } : ${10 < 20 }<br>
\${10 lt 20 } : ${10 lt 20 }<br>
\${20 > 10}: ${20 > 10}<br>
\${20 gt 10}: ${20 gt 10}<br>
\${10 <= 20 } : ${10 <= 20 }<br>
\${10 le 20 } : ${10 le 20 }<br>
\${20 >= 10}: ${20 >= 10}<br>
\${20 ge 10}: ${20 ge 10}<br>


 
</body>
</html>