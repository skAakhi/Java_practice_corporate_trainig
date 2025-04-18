<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <style>
        body {
            background-color: #1e1e1e;
            color: #fff;
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 50px;
        }

        h2 {
            color: #ffcc00; /* Pizza-themed yellow */
        }

        form {
            background-color: #2a2a2a;
            padding: 20px;
            border-radius: 10px;
            width: 300px;
            margin: auto;
            box-shadow: 0px 0px 10px rgba(255, 165, 0, 0.5);
        }

        input {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: none;
            border-radius: 5px;
        }

        input[type="text"], input[type="password"], input[type="email"] {
            background: #333;
            color: #fff;
        }

        button {
            background-color: #ff4500; /* Pizza sauce red */
            color: white;
            padding: 10px;
            width: 100%;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background-color: #e63900;
        }

        p {
            margin-top: 15px;
        }

        a {
            color: #ffcc00;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    
    <% 
        String errorMessage = request.getParameter("error");
        if (errorMessage != null) { 
    %>
        <p class="error"><%= errorMessage %></p>
    <% } %>


    <h2>Register</h2>
    <form action="customer" method="post">
        <input type="hidden" name="action" value="register">
        <label>Username:</label>
        <input type="text" name="username" required><br>
        
        <label>Password:</label>
        <input type="password" name="password" required><br>
        
        <label>Email:</label>
        <input type="email" name="email" required><br>
        
        <button type="submit">Register</button>
    </form>
    <p>Already have an account? <a href="PizzaCustomerLogin.jsp">Login</a></p>
    
    <a href="PizzaWelcome.html" class="home-link">🏠 Go to Home Page</a>
    
  
</body>
</html>
