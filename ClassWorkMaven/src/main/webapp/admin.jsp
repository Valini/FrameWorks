<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jac.web.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h1>This is Admin Page</h1>
<% User user = (User)request.getAttribute("user"); %>
	
	User details are:<b> <%=user %></b>
<form action="product" method="post">
	<label>Product Name:</label> 
	<input type="text" name="productName" /><br>
	<label>Product Price: </label>
	<input type="text" name="productPrice" /><br>
	<button type="submit">Add</button>
</form>
<a href="list.jsp" method="get" action="list">To List</a>
</body>
</html>