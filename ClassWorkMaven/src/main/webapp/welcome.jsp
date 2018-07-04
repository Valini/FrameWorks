<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jac.web.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>

</head>
<body>
Welcome.jsp page.
	<% User user = (User)request.getAttribute("user"); %>
	
	User details are:<b> <%=user %></b>

</body>
</html>