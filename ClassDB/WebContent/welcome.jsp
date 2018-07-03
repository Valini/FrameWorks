<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<p>Register</p><br>
<form action="register" method="post">
Student Name:<input type="text" name="studentName"/><br>
Student ID:<input type="text" name="id"/><br>
Student Username:<input type="text" name="userName"/><br>
Password:<input type="text" name="password"/><br>
Email :<input type="text" name="email"/><br>
City:<input type="text" name="city"/><br>
<button type="submit">Register student</button><br>
</form>
<p>Login</p><br>
<form action="login" method="post">
Student Username:<input type="text" name="userName"/><br>
Password:<input type="text" name="password"/><br>
<button type="submit">Login student</button><br>
</form>
</body>
</html>