<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jac.web.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User page</title>
</head>
<body>
<h1>This is User Page</h1>
<% User user = (User)request.getAttribute("user"); %>
	
	User details are:<b> <%=user %></b>

</body>
</html>