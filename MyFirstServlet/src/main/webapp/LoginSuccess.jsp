<%--
  Created by IntelliJ IDEA.
  User: Googly
  Date: 22-05-2020
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Success</title>
</head>
<body>
    <h3>Hi.. <%= request.getAttribute("user") %>, Login Successful</h3>
    <a href="login.html">Login Page</a>
</body>
</html>
