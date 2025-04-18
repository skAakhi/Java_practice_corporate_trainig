<%@ page import="java.util.List" %>
<%@ page import="com.Servlet3.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pizza Delight - Menu</title>
    <style>
        /* Reset some default styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #1a1a1a;
            color: white;
            text-align: center;
        }

        /* Header */
        .header {
            background-color: #ff4500;
            padding: 20px;
            font-size: 32px;
            font-weight: bold;
            letter-spacing: 2px;
        }

        /* Navigation Bar */
        .navbar {
            background-color: #333;
            padding: 10px 0;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-size: 18px;
        }

        .navbar a:hover {
            text-decoration: underline;
        }

        /* Main Content Section */
        h2 {
            color: #ff4500;
            margin: 30px 0;
            font-size: 28px;
        }

        /* Pizza Cards Layout */
        .pizzas {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 20px;
            padding: 20px;
            justify-items: center;
        }

        .pizza-card {
            background-color: #333;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 100%;
            text-align: center;
            transition: transform 0.3s ease;
        }

        .pizza-card:hover {
            transform: scale(1.05);
        }

        .pizza-card img {
            width: 100%;
            height: 200px;
            object-fit: cover;
        }

        .pizza-card h3 {
            font-size: 22px;
            color: #ff4500;
            margin: 15px 0;
        }

        .pizza-card p {
            color: #ddd;
            margin-bottom: 15px;
            font-size: 16px;
        }

        .pizza-card button {
            background-color: #ff4500;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 18px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .pizza-card button:hover {
            background-color: #e63946;
        }

        /* About Section */
        #about {
            margin: 40px 0;
            font-size: 18px;
            padding: 20px;
            background-color: #333;
            border-radius: 8px;
        }

        /* Footer */
        .footer {
            background-color: #222;
            padding: 10px;
            color: #ddd;
            position: fixed;
            bottom: 0;
            width: 100%;
            font-size: 14px;
        }

        /* Contact Section */
        #contact {
            margin: 40px 0;
            font-size: 18px;
            padding: 20px;
            background-color: #333;
            border-radius: 8px;
        }

        /* Media Queries for Responsiveness */
        @media (max-width: 768px) {
            .pizza-card img {
                height: 150px;
            }

            .pizza-card h3 {
                font-size: 20px;
            }

            .pizza-card p {
                font-size: 14px;
            }

            .pizza-card button {
                font-size: 16px;
                padding: 8px 16px;
            }
        }

        @media (max-width: 480px) {
            .navbar a {
                font-size: 16px;
                margin: 0 10px;
            }

            .pizza-card img {
                height: 120px;
            }

            .pizza-card h3 {
                font-size: 18px;
            }

            .pizza-card p {
                font-size: 14px;
            }

            .pizza-card button {
                font-size: 14px;
                padding: 8px 16px;
            }
        }
    </style>
</head>
<body>

    <div class="header">Welcome to Pizza Delight</div>

    <div class="navbar">
        <a href="#about">About Us</a>
        <a href="#all-pizzas">All Pizzas</a>
        <a href="#contact">Contact Us</a>
    </div>

    <h2 id="all-pizzas">All Pizzas</h2>

    <div class="pizzas">
        <%
            // Retrieve the pizza list from request
            List<PizzaModel> pizzaList = (List<PizzaModel>) request.getAttribute("label");

            if (pizzaList != null && !pizzaList.isEmpty()) {
                for (PizzaModel pizza : pizzaList) {
        %>
        <div class="pizza-card">
            <img src="<%= pizza.getStock()%>" alt="<%= pizza.getName() %>">
            <h3><%= pizza.getName() %></h3>
            <p><%= pizza.getDescription() %></p>
            <p>Price: $<%= pizza.getPrice() %></p>
            <button>Add to Cart</button>
        </div>
        <%
                }
            } else {
        %>
        <p>No pizzas available.</p>
        <%
            }
        %>
    </div>

    <h2 id="about">About Us</h2>
    <p>We serve the best pizzas with high-quality ingredients. Our mission is to bring smiles through delicious pizzas!</p>

    <h2 id="contact">Contact Us</h2>
    <p>Email: skaakhib29@gmail.com | Phone: +91 7207182919</p>

    <div class="footer">
        <p>© 2025 Pizza Delight | Made with ❤️ for pizza lovers.</p>
    </div>

</body>
</html>
