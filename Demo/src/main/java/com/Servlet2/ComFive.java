package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet5")
public class ComFive extends HttpServlet {
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		
		
		
		String str=req.getParameter("C");
		
		PrintWriter out = res.getWriter();
		out.println("ComFive "+str);
		
		out.println("<html><body>");
        out.println("<h2>ComFive: " + (str != null ? str : "No Value Found") + "</h2>");
        out.println("</body></html>");
		
	}

}
