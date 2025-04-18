package com.Servlet3;


import com.JDBC.DBConnection;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            try (Connection conn = DBConnection.getConnection()) {
                Statement stmt = conn.createStatement();

                if ("add".equals(action)) {
                    String name = request.getParameter("name");
                    String description = request.getParameter("description");
                    double price = Double.parseDouble(request.getParameter("price"));
                    String stock = request.getParameter("stock");
                    
                    String sql = "INSERT INTO PizzaMenu (id,name, description, price, stock_quantity) VALUES (ROUND(DBMS_RANDOM.VALUE(1000, 9999)),?, ?, ?, ?)";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, name);
                        ps.setString(2, description);
                        ps.setDouble(3, price);
                        ps.setString(4, stock);
                        ps.executeUpdate();
                    }
                    response.sendRedirect("adminBoard.jsp"); 

                } else if ("edit".equals(action)) {
                    String id = request.getParameter("id");
                    String name = request.getParameter("name");
                    String description = request.getParameter("description");
                    double price = Double.parseDouble(request.getParameter("price"));
                    String stock = request.getParameter("stock");
                    
                    String sql = "UPDATE PizzaMenu SET name = ?, description = ?, price = ?, stock_quantity = ? WHERE id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, name);
                        ps.setString(2, description);
                        ps.setDouble(3, price);
                        ps.setString(4, stock);
                        ps.setString(5, id);
                        ps.executeUpdate();
                    }
                    response.sendRedirect("admin-dashboard.jsp"); 

                } else if ("delete".equals(action)) {
                    String id = request.getParameter("id");
                    String sql = "DELETE FROM PizzaMenu WHERE id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, id);
                        ps.executeUpdate();
                    }
                    response.sendRedirect("adminBoard.jsp"); 
                }

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
            }
        }
    }
}
