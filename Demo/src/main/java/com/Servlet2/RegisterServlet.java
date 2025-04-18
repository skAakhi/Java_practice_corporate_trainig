package com.Servlet2;


import com.JDBC.DBConnection;
import com.JDBC.UserDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	UserDAO userDAO=null;
	
	public void init()
	{
	 userDAO= new UserDAO();
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        
        Connection conn = null;
        PreparedStatement ps = null;
        PrintWriter out = response.getWriter();
        
        try {
            conn = DBConnection.getConnection();
            
            
            if (userDAO.validateUser(username, password)) {
                request.setAttribute("error", "Username already taken.");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            } else {
                String insertUserQuery = "INSERT INTO NewUsers1 (username, email, password) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(insertUserQuery);
                ps.setString(1, username);
                ps.setString(2, email);
                ps.setString(3, password); 
                int rowsAffected = ps.executeUpdate();
                
                if(rowsAffected>0)
                {
                	System.out.println("New user inserted");
                }
                
                String AdminQuery = "INSERT INTO Users (username,password) VALUES (?, ?)";
                ps = conn.prepareStatement(AdminQuery);
                ps.setString(1, username);
                ps.setString(2, password); 
                int Affected = ps.executeUpdate();
                
                if (Affected > 0) {
                    response.sendRedirect("Login.jsp");
                } else {
                    request.setAttribute("error", "Registration failed, please try again.");
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("error", "Database connection error. Please try again later.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
