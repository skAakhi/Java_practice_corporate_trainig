package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet4")
public class comFour  extends HttpServlet {
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		
		String str = req.getParameter("B");
		
		PrintWriter out = res.getWriter();
		out.println("ComFOur "+str);
		out.println("<html><body>");
        out.println("<h2>ComFour: " + (str != null ? str : "No Value Found") + "</h2>");
        out.println("<br><a href='servlet5?C=" + (str != null ? str : "") + "'>Click</a>");
        out.println("</body></html>");
		
		
	}

}
