<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
<h1>This is from index.jsp</h1>
<a href="one">This is one</a><br>
<a href="two">This is two</a>
<br>

<form action="one" method="post">
USERNAME:<input type="text" name="username"/>
PASSWORD:<input type="text" name="password"/>
<button type="submit">Submit the data with servlet post</button>
</form>

<form action="test.jsp" method="post">
USERNAME:<input type="text" name="username"/>
PASSWORD:<input type="text" name="password"/>
<button type="submit">Submit the data to JSP</button>

</form>

<form action="one" method="get">
USERNAME:<input type="text" name="name"/>
ID:<input type="text" name="id"/>
<button type="submit">Submit student id</button>

</form>

<% out.println("Hello World"); %>

<%! int val=150; %><br>
<%="Value of the variable is:"+val %>

<p><%= java.util.Calendar.getInstance().getTime() %></p>

</body>
</html>