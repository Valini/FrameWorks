<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</head>
<body>
<!-- Navbar -->
<%@ include file="navbar.jsp" %>
<main class="page container" style="margin-top:100px;">
	<div class="container">
		<section class="clean-block clean-form dark">
		<div class="container">
			<div class="block-heading">
<h2>JPA Class Work</h2>

<%
if (request.getAttribute("error") != null) {
								out.println("<div class='alert alert-danger'>"+request.getAttribute("error")+"</div>");
							}
						%>	
<form action="login" method="post">
		<div class="form-group">
			<label for="username">Username</label><input
				class="form-control item" type="text" id="userName"
				name="userName" required="true">
		</div>
		<div class="form-group">
			<label for="password">Password</label><input class="form-control"
				type="password" id="password" name="password" required="true">
		</div>
		<button class="btn btn-primary btn-primary" type="submit">Log In</button>
</form>

</div>
</div><div>
</main>
</body>
</html>
