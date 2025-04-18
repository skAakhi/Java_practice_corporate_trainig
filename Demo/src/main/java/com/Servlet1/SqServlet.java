package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		
		
		  //int sum = (int)req.getAttribute("K");
//		  int sum= Integer.parseInt(req.getParameter("k"));
		
//		HttpSession session = req.getSession();
//		//session.removeAttribute("k");//Again cannot access k value received by AddServlets class 
//		 int sum=(int)session.getAttribute("k");
		
		
		//To accept cookie object from other servlet(AddServlet) or from client
		
		   Cookie cok[]=req.getCookies();
		   int sum=0;
		   for(Cookie c : cok)
		   {
			   if(c.getName().equals("k"))
			   {
				   sum= Integer.parseInt(c.getValue());
			   }
		   }
	      
		    sum*=sum;
	
		   PrintWriter out=res.getWriter();
		   
		   out.println("Result is "+ sum);
		
	}

}
