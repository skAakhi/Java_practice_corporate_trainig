<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Pizza</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url('https://wallpaperaccess.com/full/2041923.jpg') no-repeat center center fixed;
            background-size: cover;
            color: white;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 40%;
            margin: 50px auto;
            background-color: rgba(0, 0, 0, 0.8);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(255, 255, 255, 0.2);
        }

        h3 {
            margin-bottom: 20px;
            color: #ff6347;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        input {
            padding: 10px;
            margin: 8px 0;
            border: none;
            border-radius: 5px;
            width: 90%;
            font-size: 1rem;
        }

        button {
            padding: 12px;
            background-color: #ff6347;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 1.1rem;
            margin-top: 10px;
            transition: 0.3s;
        }

        button:hover {
            background-color: #e5533c;
        }

        a {
            color: white;
            text-decoration: none;
            font-weight: bold;
        }

        .back-btn {
            display: inline-block;
            margin-top: 20px;
            color: #ff6347;
            font-size: 1.1rem;
        }

        .back-btn:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="container">
        <h3>Edit Pizza</h3>
        <form action="admin" method="post">
            <input type="hidden" name="action" value="edit">
            <input type="number" name="id" placeholder="Pizza ID" required>
            <input type="text" name="name" placeholder="New Name">
            <input type="text" name="description" placeholder="New Description">
            <input type="number" name="price" placeholder="New Price" step="0.01">
            <input type="number" name="stock" placeholder="New Stock">
            <button type="submit">Update Pizza</button>
        </form>

        <a href="adminBoard.jsp" class="back-btn">← Back to Dashboard</a>
    </div>

</body>
</html>
