<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<html>
<head>
    <title>Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #2E1A47;
            color: white;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            text-align: center;
            background: rgba(255, 255, 255, 0.1);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        h2 {
            margin-bottom: 20px;
        }

        .btn-container {
            margin-top: 20px;
        }

        .btn {
            display: inline-block;
            background: #4CAF50;
            color: white;
            padding: 12px 20px;
            text-decoration: none;
            font-size: 16px;
            margin: 5px;
            border-radius: 5px;
            transition: 0.3s;
            border: none;
            cursor: pointer;
        }

        .btn:hover {
            background: #45a049;
        }

        .logout-btn {
            background: #ff4d4d;
        }

        .logout-btn:hover {
            background: #cc0000;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Welcome to Dashboard</h2>
        <%
            String user = (String) session.getAttribute("user");
            if (user == null) {
                response.sendRedirect("login.jsp");
            }
        %>
        <p>Hello, <%= user %>!</p>

        <div class="btn-container">
            <a href="dashboard.jsp" class="btn">🏠 Welcome Dashboard</a>
            <a href="MainOne.html" class="btn">📝 Perform CRUD Operations</a>
            <a href="aboutUs.html" class="btn">ℹ About Us</a>
            <a href="Login.jsp" class="btn logout-btn">🚪 Logout</a>
        </div>
    </div>

</body>
</html>
