<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.jac.web.model.Product"%>
<!DOCTYPE html>
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
<p>Edit Form<p>
 <% Product productInDb =  (Product)request.getAttribute("productById"); %>
<form action="edit" method="post">
					<div class="form-group">
						<label for="productName">Product Name</label>
						<input
							class="form-control item" type="text" id="productName" value=<%= productInDb.getProductName() %>
							name="productName" required="true" pattern="^[a-zA-Z_.-]*$" title="Text only">
					</div>
					<div class="form-group">
						<label for="productPrice">Product Price</label><input class="form-control"
							type="text" id="productPrice" name="productPrice" value="<%= productInDb.getProductPrice() %>"  
							pattern="^[0-9.]*$" title="Prices only"required="true">
					</div>
					<input type="hidden" name="productId" value="<%= productInDb.getProductID()  %>"><button class="btn btn-primary" type="submit">Save</button>
					
				</form>
</div>

</div>
</div><div>
</main>
</body>
</html>