<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    <%@ include file="header.jsp"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
     <% 
        int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int sum = i +j/1;// 0 --If you divide with 1 then will display blue color along with answer , in case 0 will display red  
	    
		out.println("Output : "+sum);
		
		%>

</body>
</html>