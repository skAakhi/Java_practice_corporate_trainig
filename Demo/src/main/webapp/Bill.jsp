<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.Servlet3.*, java.util.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        .invoice, .total, .insufficient-stock {
            margin: 20px 0;
        }
        .invoice p, .total p, .insufficient-stock p {
            font-size: 18px;
            color: #555;
        }
        .insufficient-stock ul {
            list-style-type: none;
            padding-left: 0;
        }
        .insufficient-stock li {
            background-color: #f8d7da;
            padding: 10px;
            margin: 5px 0;
            border-radius: 5px;
        }
        .insufficient-stock strong {
            color: #721c24;
        }
        .button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            text-align: center;
            border-radius: 5px;
            text-decoration: none;
            font-size: 16px;
            margin-top: 20px;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Checkout Summary</h2>

    <div class="invoice">
        <% 
        String invoiceId = (String) request.getAttribute("invoiceId");
        if (invoiceId != null) {
            out.println("<p><strong>Invoice ID: </strong>" + invoiceId + "</p>");
        }
        %>
    </div>

    <div class="total">
        <%
        Double totalAmount = (Double) request.getAttribute("totalAmount");
        if (totalAmount != null) {
            out.println("<p><strong>Total Price: </strong>₹" + totalAmount + "</p>");
        }
        %>
    </div>

    <div class="insufficient-stock">
        <% 
        List<PizzaItem> insufficientStockItems = (List<PizzaItem>) request.getAttribute("insufficientStockItems");
        if (insufficientStockItems != null && !insufficientStockItems.isEmpty()) {
            out.println("<p><strong>Insufficient Stock for the following items:</strong></p>");
            out.println("<ul>");
            for (PizzaItem item : insufficientStockItems) {
                out.println("<li>" + item.getName() + " - Requested Quantity: " + item.getQuantity() + " - Available Stock: " + item.getQuantity() + "</li>");
            }
            out.println("</ul>");
            out.println("<p>Please reduce the quantity of the items to proceed with your order.</p>");
        }
        %>
    </div>

    <a href="PizzaCart.jsp" class="button">Back to Cart</a>
</div>

</body>
</html>
