<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
String str=request.getParameter("num1");
Cookie ck = new Cookie("abc",str);
response.addCookie(ck);
%>

<form action="servlet2" method="get" >
<input type="submit" name="click"/>
</form>



</body>
</html>