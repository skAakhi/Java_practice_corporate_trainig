<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url('https://img.freepik.com/premium-photo/delicious-italian-pizza-slice-pizza-with-cheese-vegetables-hot-cheese-drips-down-edges-slice-pizza-3d-illustration_86390-9521.jpg') no-repeat center center fixed; /* Pizza image as background */
            background-size: cover; /* Make sure the image covers the entire background */
            color: white;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h2 {
            font-size: 2rem;
            margin-top: 100px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);
        }

        form {
            background-color: rgba(44, 62, 80, 0.8); /* Slightly darker background for the form */
            padding: 30px;
            border-radius: 8px;
            display: inline-block;
            margin-top: 50px;
        }

        label {
            font-size: 1rem;
            margin-top: 10px;
            display: block;
            text-align: left;
            color: white;
        }

        input[type="text"], input[type="password"] {
            width: 250px;
            padding: 10px;
            margin: 10px 0;
            border: none;
            border-radius: 4px;
            font-size: 1rem;
        }

        button {
            background-color: #ff6347; /* Tomato red color for button */
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            font-size: 1.2rem;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #e5533c; /* Darker tomato red */
        }

        p {
            font-size: 1rem;
            margin-top: 20px;
        }

        a {
            color: #ff6347;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            color: #e5533c; /* Darker color when hovered */
        }

        .home-link {
            display: block;
            margin-top: 30px;
            font-size: 1.2rem;
            color: #ff6347;
        }

        .home-link:hover {
            color: #e5533c; /* Darker color when hovered */
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
    
    <h2>Login to Your Pizza Order Account</h2>
    <form action="customer" method="post">
        <input type="hidden" name="action" value="login" />
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        <input type="checkbox" id="showPassword" onclick="togglePassword()"> Show Password  
        <br>
        <button type="submit">Login</button>
    </form>
    <p>Don't have an account? <a href="PizzaRegister.jsp">Register here</a></p>

    <a href="PizzaWelcome.html" class="home-link">🏠 Go to Home Page</a>
    
    <script>
        function togglePassword() {
            var passwordField = document.getElementById("password");
            passwordField.type = (passwordField.type === "password") ? "text" : "password";
        }
    </script>
</body>
</html>
