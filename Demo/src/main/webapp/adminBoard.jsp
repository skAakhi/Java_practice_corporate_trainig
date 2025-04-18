<%@ page import="java.sql.*" %>
<%@ page import="com.JDBC.DBConnection" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url('https://wallpaperboat.com/wp-content/uploads/2019/10/best-background-for-website-14.jpg') no-repeat center center fixed;
            background-size: cover;
            color: white;
            text-align: center;
        }

        h2 {
            margin-top: 20px;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: rgba(0, 0, 0, 0.8);
            color: white;
        }

        table, th, td {
            border: 1px solid white;
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #ff6347;
        }

        form {
            background-color: rgba(0, 0, 0, 0.8);
            padding: 20px;
            border-radius: 8px;
            width: 300px;
            margin: 20px auto;
        }

        input, button {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: none;
            border-radius: 4px;
        }

        button {
            background-color: #ff6347;
            color: white;
            cursor: pointer;
            font-size: 1rem;
        }

        button:hover {
            background-color: #e5533c;
        }

        .logout-btn {
            margin-top: 20px;
        }

        a {
            color: white;
            text-decoration: none;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <h2>Admin Dashboard - Pizza Management</h2>

    <!-- View Pizza Menu -->
    <h3>Pizza Menu</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Stock</th>
            <th>Actions</th>
        </tr>

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
            <td><%= rs.getInt("stock_quantity") %></td>
            <td>
            
            
                <form action="admin" method="post" style="display:inline;">
                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" name="id" value="<%= rs.getInt("id") %>">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </table>

   <button type="button"><a href="addPizzaAction.jsp" > Add pizza </a></button>
   <button type="button"><a href="editPizzaAction.jsp" > Edit pizza </a></button>

    
    <button class="logout-btn"><a href="PizzaWelcome.html">Logout</a></button>

</body>
</html>
