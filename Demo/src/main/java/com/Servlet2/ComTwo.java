package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class ComTwo extends HttpServlet {
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
	Cookie[] ck=req.getCookies();
	String x=null;
	for(Cookie c:ck)
	{
		if(c.getName().equals("abc"));
		x=c.getValue();
	}
	PrintWriter out = res.getWriter();
	out.println("ComTwo Servlet "+x);
	HttpSession s=req.getSession();
	s.setAttribute("A",x);
	res.sendRedirect("servlet3");
		
	}

}
//One.html-->One.jsp---->ComTwo[com.Servlet2]