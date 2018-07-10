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
<h1>Welcome</h1>


<h5>Please fill out the form to register</h5>
<form action=" RegisterController" method="post">
					<div class="form-group">
						<label for="username">Username</label>
						<input
							class="form-control item" type="text" id="username"
							name="username" required="true" pattern="^([A-Za-z])([0-9A-Za-z]{4})$" title="Only 5 characters and should not start with a number">
					</div>
					<div class="form-group">
						<label for="password">Password</label><input class="form-control"
							type="text" id="password" name="password" pattern="^[0-9a-zA-Z!@$#]{4,}$" title="at least 4 characters and should contain at leat one of the 4 symbols !, @, ~ and $"required="true">
					</div>
					<div class="form-group">
						<label for="aptno">Apt Number</label><input class="form-control"
							type="number" id="aptno" name="aptno"  title="Should be a number">
					</div>
					<button class="btn btn-primary btn-primary" type="submit">Add</button>
				</form>
</div>
</div>
</div>
</main>
</body>
</html>