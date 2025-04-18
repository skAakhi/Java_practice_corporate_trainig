<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url('https://wallpaperboat.com/wp-content/uploads/2019/10/best-background-for-website-14.jpg') no-repeat center center fixed;
            background-size: cover;
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
            background-color: rgba(0, 0, 0, 0.7); /* Darker background for form */
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

        input[type="text"], input[type="password"], input[type="number"] {
            width: 250px;
            padding: 10px;
            margin: 10px 0;
            border: none;
            border-radius: 4px;
            font-size: 1rem;
        }

        button {
            background-color: #ff6347;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            font-size: 1.2rem;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #e5533c;
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
            color: #e5533c;
        }

        .home-link {
            display: block;
            margin-top: 30px;
            font-size: 1.2rem;
            color: #ff6347;
        }

        .home-link:hover {
            color: #e5533c;
        }
    </style>
</head>
<body>
    <h2>Admin Login</h2>
    <form action="adminBoard.jsp" method="post">
        <label for="adminId">Admin ID:</label>
        <input type="number" id="adminId" name="adminId" required><br>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <button type="submit">Login</button>
    </form>
    <p>Go back to <a href="PizzaWelcome.html">Home Page</a></p>
</body>
</html>
