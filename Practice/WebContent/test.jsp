<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sending data from index jsp tp test.jsp</title>
</head>
<body>
<p><%= request.getParameter("username") %><p>
<% String pass=request.getParameter("password");
if (pass.equals("password")) {%>
<p>password is correct</p><%} else { %>
<p>password is nor correct</p><%} %>

</body>
</html>