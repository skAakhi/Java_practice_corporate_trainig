package com.Servlet3;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import com.JDBC.DBConnection;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        HttpSession session = request.getSession();
        List<PizzaItem> cartItems = (List<PizzaItem>) session.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }

        if ("Add to Cart".equals(action)) {
           
            for (String paramName : request.getParameterMap().keySet()) {
                if (paramName.startsWith("quantity_")) {
                    int pizzaId = Integer.parseInt(paramName.substring(9)); 
                    int quantity = Integer.parseInt(request.getParameter(paramName));

                    if (quantity > 0) {
                        PizzaItem pizza = findPizzaById(pizzaId);
                        PizzaItem cartItem = findCartItem(cartItems, pizzaId);

                        if (cartItem != null) {
                            cartItem.setQuantity(cartItem.getQuantity() + quantity);
                        } else {
                            pizza.setQuantity(quantity);
                            cartItems.add(pizza);
                        }
                    }
                }
            }
        } 
        else if ("Update".equals(action)) {
            int pizzaId = Integer.parseInt(request.getParameter("pizzaId"));
            int updatedQuantity = Integer.parseInt(request.getParameter("updateQuantity"));
            PizzaItem cartItem = findCartItem(cartItems, pizzaId);
            if (cartItem != null) {
                cartItem.setQuantity(updatedQuantity);
            }
        } 
        else if ("Remove".equals(action)) {
           
            int pizzaId = Integer.parseInt(request.getParameter("pizzaId"));
            cartItems.removeIf(item -> item.getId() == pizzaId);
        } 
        else if ("Clear Cart".equals(action)) {
            cartItems.clear();
        }
        else if ("Checkout".equals(action)) {
        	
            boolean stockInsufficient = false;
            List<PizzaItem> insufficientStockItems = new ArrayList<>();

            String invoiceId = UUID.randomUUID().toString();
            
            request.setAttribute("invoiceId", invoiceId);
            
             double total = 0;
			for(PizzaItem cartItem : cartItems) {
                PizzaItem pizza = findPizzaById(cartItem.getId());
                if (pizza.getQuantity() >= cartItem.getQuantity()) {
                    total += cartItem.getPrice() * cartItem.getQuantity();
                 
                    updatePizzaStock(cartItem.getId(), cartItem.getQuantity());
                } else {
        
                    stockInsufficient = true;
                    insufficientStockItems.add(cartItem);
                }
           }
             
             if (stockInsufficient) {
                 request.setAttribute("insufficientStockItems", insufficientStockItems);
             }

             request.setAttribute("totalAmount", total);
            
            cartItems.clear(); 
            request.getRequestDispatcher("Bill.jsp").forward(request, response);
            return;         }

        session.setAttribute("cartItems", cartItems);
        response.sendRedirect("PizzaCart.jsp");
        
       
    }

    public PizzaItem findPizzaById(int pizzaId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PizzaItem pizza = null;

        try {
            conn = DBConnection.getConnection();
            String sql = "SELECT * FROM PizzaMenu WHERE id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pizzaId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                pizza = new PizzaItem(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getInt("stock_quantity") 
                );
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return pizza;
    }

    public PizzaItem findCartItem(List<PizzaItem> cartItems, int pizzaId) {
        return cartItems.stream().filter(item -> item.getId() == pizzaId).findFirst().orElse(null);
    }
    
    
    

    private void updatePizzaStock(int pizzaId, int quantityPurchased) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();

//            String selectSql = "SELECT stock_quantity FROM PizzaMenu WHERE id = ?";
//            stmt = conn.prepareStatement(selectSql);
//            stmt.setInt(1, pizzaId);
//            rs = stmt.executeQuery();
//
//            if (rs.next()) {
//                int currentStock = rs.getInt("stock_quantity");
//
//          
//                if (currentStock >= quantityPurchased) {
//          
                    String updateSql = "UPDATE PizzaMenu SET stock_quantity = stock_quantity - ? WHERE id = ?";
                    stmt = conn.prepareStatement(updateSql);
                    stmt.setInt(1, quantityPurchased);
                    stmt.setInt(2, pizzaId);
                    stmt.executeUpdate();
//                } else {
//                   // System.out.println("Not enough stock available for pizza ID " + pizzaId);
//                	//Response
//                   
//                }
           // }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
