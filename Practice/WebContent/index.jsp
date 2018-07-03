<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Practice</title>
</head>
<body>
<p>Sending a request to servlet Post method</p>
<form action="one" method="post">
USERNAME:<input type="text" name="username"/>
PASSWORD:<input type="text" name="password"/>
<button type="submit">Submit the data with servlet post</button>
</form>

<p>Sending data directly to test.jsp</p>
<form action="test.jsp" method="post">
USERNAME:<input type="text" name="username"/>
PASSWORD:<input type="text" name="password"/>
<button type="submit">Submit the data to JSP</button>

</form>
<p>sending data get method to servlet</p>
<form action="one" method="get">
NAME:<input type="text" name="name"/>
ID:<input type="text" name="id"/>
<button type="submit">Submit person id</button>

</form>
</body>
</html>