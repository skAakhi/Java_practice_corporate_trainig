package com.Servlet3;


import com.JDBC.DBConnection;
import com.JDBC.UserDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {
	
	UserDAO userDAO=null;
	
	public void init()
	{
		userDAO = new UserDAO();
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
         
        if ("register".equals(action)) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            	
               try {
				try (Connection conn = DBConnection.getConnection())
				{
				    String sql = "INSERT INTO PizzaCustomer1 (username, password, email) VALUES (?, ?, ?)";
				    try {
						if(!userDAO.validatePizzaUser(username,password,email))
						{
					   response.sendRedirect("PizzaRegister.jsp?error=Username/mail already exist please try again");
						}
							
					} catch (ClassNotFoundException | SQLException e) {

				       e.printStackTrace();
					}
				    try (PreparedStatement ps = conn.prepareStatement(sql)) {
				        ps.setString(1, username);
				        ps.setString(2, password);
				        ps.setString(3, email);
				        ps.executeUpdate();
				    }
				    response.sendRedirect("PizzaCustomerLogin.jsp");
					}
				
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
    
    }
            else if ("login".equals(action)) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            try (Connection conn = DBConnection.getConnection()) {
                String sql = "SELECT * FROM PizzaCustomer1 WHERE username = ? AND password = ?";
                try (PreparedStatement ps = conn.prepareStatement(sql))
                {
                	if(userDAO.validatePizzaUser(username,password)) {
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        request.getSession().setAttribute("customer", username);
                        response.sendRedirect("PizzaCart.jsp");
                    }
                	}
                	else {
                        response.sendRedirect("PizzaCustomerLogin.jsp?error=Invalid credentials");
                    }
                	
                }

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
            }
        }
    }
}
