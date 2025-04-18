<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource  var="db" driver="oracle.jdbc.driver.OracleDriver"  url="jdbc:oracle:thin:@localhost:1521/orcl"  user="sys as sysdba" password="6541"/>

<sql:query var="rs"  dataSource="${db}">select * from student1</sql:query>

<c:forEach items="${rs.rows}" var="student">
<br> <c:out value="${student.id}"></c:out> :  <c:out value="${student.name}"></c:out> :  <c:out value="${student.branch}"></c:out>
</c:forEach>



</body>
</html>