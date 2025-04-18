package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/xyz")
public class ComOne extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		
		res.setContentType("text/html");
		String name=req.getParameter("name");
		int i=Integer.parseInt(req.getParameter("age"));
		String DOB=req.getParameter("date");
		
		System.out.println("Name : "+name+" Age : "+i+"DOB :"+DOB);
		
		PrintWriter out = res.getWriter();
		
		out.println("<h2>Hai "+name+" mawa your DOB</h2>");
		
		out.println("Name : "+name+"<br>");
		out.println("\nAge : "+i+"<br>");
		out.println("\nDD/MM/YY  : "+DOB+"<br>");
		
		RequestDispatcher rd=req.getRequestDispatcher("");
		rd.forward(req, res);
		rd.include(req, res);
		
	
		
	}

	
}
