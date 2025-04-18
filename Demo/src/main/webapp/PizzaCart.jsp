<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, java.sql.*,com.Servlet3.*,com.JDBC.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pizza Menu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #2c3e50; /* Dark background color */
            color: #ecf0f1; /* Light text color for readability */
        }
        h1 {
            color: #ecf0f1;
        }
        table {
            width: 100%;
            margin-bottom: 20px;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            border: 1px solid #34495e; /* Darker border for better visibility */
            text-align: center;
        }
        th {
            background-color: #34495e; /* Darker background for table headers */
            color: #ecf0f1; /* Light text color for headers */
        }
        td input[type="number"], td input[type="submit"] {
            padding: 5px;
            background-color: #34495e; /* Dark button background */
            color: #ecf0f1; /* Light text for buttons */
            border: 1px solid #ecf0f1; /* Light border for inputs */
            border-radius: 5px;
        }
        td input[type="submit"]:hover {
            background-color: #1abc9c; /* Lighter green for hover effect */
            cursor: pointer;
        }
        form {
            margin-top: 20px;
        }
        .cart-summary {
            font-size: 18px;
            margin-top: 20px;
        }
        .logout-btn {
            background-color: #e74c3c; /* Red for logout button */
            color: white;
            border: none;
            padding: 10px;
            cursor: pointer;
            text-align: center;
            border-radius: 5px;
        }
        .logout-btn:hover {
            background-color: #c0392b; /* Darker red for hover */
        }
    </style>
</head>
<body>

<%
if (request.getParameter("logout") != null) {
session.invalidate(); 
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
}

if(session.getAttribute("customer")==null)
{
	   response.sendRedirect("PizzaCustomerLogin.jsp"); 
}

%>

<h1>Pizza Menu</h1>

    <form action="CartServlet" method="post">
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <%
                try (Connection conn = DBConnection.getConnection();
                     Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT * FROM PizzaMenu")) {
                    
                    while (rs.next()) {
            %>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("name") %></td>
                <td><%= rs.getString("description") %></td>
                <td><%= rs.getDouble("price") %></td>
                <td>
                    <input type="number" name="quantity_<%= rs.getInt("id") %>" min="0" value="0">
                </td>
                <td>
                    <input type="submit" name="action" value="Add to Cart">
                </td>
            </tr>
            <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </tbody>
    </table>
</form>


    <h2>Your Cart</h2>
    <form action="CartServlet" method="post">
        <table>
            <thead>
                <tr>
                    <th>Pizza Name</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    // Assuming cartItems is a list of PizzaItem objects stored in session
                    List<PizzaItem> cartItems = (List<PizzaItem>) session.getAttribute("cartItems");
                    if (cartItems != null) {
                        for (PizzaItem cartItem : cartItems) {
                %>
                <tr>
                    <td><%= cartItem.getName() %></td>
                    <td>
                        <form action="CartServlet" method="post">
                            <input type="number" name="updateQuantity" value="<%= cartItem.getQuantity() %>" min="0">
                           <input type="hidden" name="pizzaId" value="<%= cartItem.getId() %>"> 
                            
                        </form>
                    </td>
                    <td><%= cartItem.getPrice() %></td>
                    <td>
                        <input type="submit" name="action" value="Remove">
                    </td>
                </tr>
                <%
                        }
                    }
                %>
            </tbody>
        </table>
        <input type="submit" name="action" value="Checkout">
        <input type="submit" name="action" value="Clear Cart">
    </form>

    <form action="PizzaWelcome.html" method="post">
        <input class="logout-btn" type="submit" name="logout" value="Logout">
    </form>
    
    
    
<h2>Checkout Summary</h2>


</body>
</html>
