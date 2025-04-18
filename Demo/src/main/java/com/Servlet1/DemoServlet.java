package com.Servlet1;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet
{
	// It is just combination of Post and Get methods
     public void  service(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
	{
		//String name="Aakhib";
    	 
    	 List<Student> stu=Arrays.asList(
    			 new Student(1,"Aakhib"),
    			 new Student(2,"Afzal"),
    			 new Student(3,"Parveen"));
		
		req.setAttribute("label", stu);
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}

}
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

//display.jsp
//<!--  <%
//String name = request.getAttribute("label").toString();
//out.println(name);
//%>-->
