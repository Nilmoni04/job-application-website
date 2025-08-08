<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #eef2f3;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            width: 350px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        label {
            font-weight: bold;
            margin-top: 10px;
            display: block;
        }
        input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        button {
            margin-top: 15px;
            width: 100%;
            background: #2196F3;
            border: none;
            padding: 10px;
            color: white;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background: #1976D2;
        }
        .message {
            margin-top: 10px;
            text-align: center;
        }
        .error {
            color: red;
            font-size: 14px;
        }
        .success {
            color: green;
            font-size: 14px;
        }
        .link {
            text-align: center;
            margin-top: 10px;
        }
        .link a {
            color: #2196F3;
            text-decoration: none;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Login</h2>
    <form action="${pageContext.request.contextPath}/doLogin" method="post">
        <label>Username</label>
        <input type="text" name="username" required>

        <label>Password</label>
        <input type="password" name="password" required>

        <button type="submit">Login</button>

        <div class="message">
            <c:if test="${param.error != null}">
                <p class="error">Invalid username or password</p>
            </c:if>
            <c:if test="${param.logout != null}">
                <p class="success">You have been logged out</p>
            </c:if>
        </div>
    </form>
</div>

</body>
</html>
