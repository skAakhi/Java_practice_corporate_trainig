package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	// It is just combination of Post and Get methods
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int sum = i +j;
		
//	   	System.out.println("Result is "+sum);
		
		
		   PrintWriter out=res.getWriter();
		   
//		   out.println("<html><body bgcolor='cyan'>");
//		   out.println("Result is "+ sum);
//		   out.println("</body></html>");
		
}
	
	//If you want to post the data to server then use doPost() method 
	//This will help you to send your data without through URL , in browser it will just shows the method of /add instead of num1 , num2 values
	
//	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
//	{
//		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int sum = i+j;
		
	//	System.out.println("Result is "+sum);
		
		
//           req.setAttribute("K", sum);
		
//		   PrintWriter out=res.getWriter();
//		   
//		   out.println("Result is "+ sum);
           
           //To call other servlet we have two methods 1->req Dispatcher  2->ReDirect
		       
            //1. 
//           RequestDispatcher rd = req.getRequestDispatcher("sq");
//           
//           rd.forward(req, res);
		
		
		//2.
		
//		res.sendRedirect("sq?k="+sum);  // URL Writing
		
		
		//Session management
//		HttpSession session = req.getSession();
//		session.setAttribute("k", sum);
//		res.sendRedirect("sq");
		
		//Instead of having session management can also create cookie which will send cookie object by client
//		
//		Cookie cok = new Cookie("k",sum+"");
//		res.addCookie(cok);
//		res.sendRedirect("sq");
//		
		
		
		//ServletConfig and ServletContext
		
		//ServletContext
//		ServletContext ctx=req.getServletContext();
//		String str=ctx.getInitParameter("phone");//name  that particular value will be displayed over browser
//		PrintWriter out=res.getWriter();
//		out.print("Hai "+str);
		
		
		//ServeltConfig
//		ServletConfig ctx=getServletConfig();
//		String str=ctx.getInitParameter("name");//name  that particular value will be displayed over browser
//		PrintWriter out=res.getWriter();
//		out.print("Hai "+str);
		
		
		
//	}
	
	
	
	// If you want fetch the data from server then use doGet() method , which will show your values on URL 
	
//	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException
//	{
//		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int sum = i +j;
//		
//	//	System.out.println("Result is "+sum);
////		
//		   PrintWriter out=res.getWriter();
//		   
//		   out.println("Result is "+ sum);
//		
//	}

}
