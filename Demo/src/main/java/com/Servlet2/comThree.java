package com.Servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet3")
public class comThree  extends HttpServlet {
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		
		 res.setContentType("text/html"); 
		HttpSession s=req.getSession();
		String str=(String) s.getAttribute("A");
		
		PrintWriter out = res.getWriter();
		out.println("ComThree :"+str);
		
		out.println("<html><body>");
      //  out.println("<h2>ComThree: " + (str != null ? str : "No Value Found") + "</h2>"); 
        
        out.println("<form action='servlet4' method='get'>");
        out.println("<input type='hidden' name='B' value='" + str + "'>");
        out.println("<input type='submit' name='click'/>");
        out.println("</form>");

        out.println("</body></html>");
	}

}
