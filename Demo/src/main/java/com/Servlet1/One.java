package com.Servlet1;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/One")
public class One implements Servlet{
	
	@Override
	public void destroy() {
		System.out.println("This is destroy method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("This is config method");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("This is sInfo method");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("This is init method");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This is Service method");
		
	}

}
