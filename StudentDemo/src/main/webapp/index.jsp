<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>

<body>

<%-- <jsp:include page="header.jsp"></jsp:include>
<jsp:forward page="header.jsp"></jsp:forward>--%>
<h2>Hello World!</h2>
<a href="getStudent">Get student</a>
</body>
<form action="loginStudent" method="post">
<label>USERNAME:</label><input type="text" name="username"/><br>
<label>PASSWORD:</label><input type="text" name="password"/><br>
<button type="submit">Login</button>
</form>
</html>
