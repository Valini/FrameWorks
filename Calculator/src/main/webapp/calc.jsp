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
</div>
<%if (request.getAttribute("result") != null) {
	out.println("<div class='alert alert-primary'>"+request.getAttribute("result")+"</div>");} %>	
	<br>
  <div>  
<h1>Please enter 2 numbers</h1>
<form action="calculator" method="post">
		<div class="form-group">
			<label for="numberone">Number 1</label><input
				class="form-control item" type="number" id="numberone"
				name="numberone" required="true">
		</div>
		<div class="form-group">
			<label for="numbertwo">Number 2</label><input class="form-control"
				type="number" id="numbertwo" name="numbertwo" required="true">
		</div>
		
			<div class="form-group">
			<label for="operation">Please enter add, subtract, multiply or divide</label>
			<input class="form-control"
				type="text" id="operation" name="operation" required="true">
		</div>
		<button class="btn btn-primary btn-primary" type="submit">Calculate</button>
		
</form>



</body>
</html>