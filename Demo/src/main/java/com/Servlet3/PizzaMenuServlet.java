package com.Servlet3;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import com.JDBC.DBConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PizzaMenuServlet")
public class PizzaMenuServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<PizzaModel> pizzas = new ArrayList<>();

        try {
            Connection con=DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PizzaMenu");

            while (rs.next()) {
            	
//            	System.out.println(rs.getInt(1)+"---->"+rs.getString(2)+"---->"+rs.getString(3)+"-------->"+rs.getDouble(4)+"----"+rs.getString(5));
                pizzas.add(new PizzaModel(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description"),
                    rs.getDouble("price"),
                    rs.getInt("Stock_quantity")
                ));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("label", pizzas);
        RequestDispatcher dispatcher = request.getRequestDispatcher("PizzaHome.jsp");
        dispatcher.forward(request, response);
    }
}
