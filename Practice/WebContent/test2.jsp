<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Practice Test2 With no Servlet</title>
</head>
<body>
<p>Student Name:<%= request.getParameter("username") %></p>
<p>Student ID:<%= request.getParameter("password") %></p>
</body>
</html>