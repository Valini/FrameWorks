<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page import= "java.util.ArrayList"%>
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
<form class="search-form" action="searchAction" method="get"
		style="margin-top: 85px;">
		<div class="input-group">
			<div class="input-group-prepend">
				<span class="input-group-text"><i class="fa fa-search"></i></span>
			</div>
			<input class="form-control" type="text" name="searchAction"
				id="searchAction"
				placeholder="Please enter the product you are looking for .." />
			<div class="input-group-append">
				<button class="btn btn-light" type="Submit">Search</button>
			</div>
		</div>
	</form>
<main class="page container" style="margin-top:100px;">
	<div class="container">
		<section class="clean-block clean-form dark">
		<div class="container">
			<div class="block-heading">

<h1>List of products</h1>
<h5>Fill out the form below to add a product</h5>
<form action="product" method="post">
					<div class="form-group">
						<label for="productName">Product Name</label>
						<input
							class="form-control item" type="text" id="productName"
							name="productName" required="true" pattern="^[a-zA-Z_.-]*$" title="Text only">
					</div>
					<div class="form-group">
						<label for="productPrice">Product Price</label><input class="form-control"
							type="text" id="productPrice" name="productPrice" pattern="^[0-9.]*$" title="Prices only"required="true">
					</div>
					<button class="btn btn-primary btn-primary" type="submit">Add</button>
				</form>
</div>
<%if (request.getAttribute("result") != null) {
	out.println("<div class='alert alert-primary'>"+request.getAttribute("result")+"</div>");} %>	
	<br>
  <div>  
  <h5>List of products sold by Maven</h5>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Product ID</th>
    <th>Product Name</th>
    <th>Product Price</th> 
    <th>Delete</th> 
      </tr>
    </thead>
    <tbody>
     <% ArrayList<Product> productList =  (ArrayList<Product>)request.getAttribute("productList"); 
for (int i=0; i<productList.size(); i++){
Product product = productList.get(i); 

%>
<tr>
<td><%= product.getProductID() %></td>
<td><%= product.getProductName() %>
<td><%= product.getProductPrice() %>
<td><form action="product" method="get" ><input type="hidden" name="productId" value="<%= product.getProductID() %>"><button class="btn btn-primary" type="submit">Delete</button></form><td>
<td><form action="edit" method="get" ><input type="hidden" name="productId" value="<%= product.getProductID() %>"><button class="btn btn-primary" type="submit">Edit</button></form><td>
<%}  %>
</tr>
    </tbody>
  </table>	
  
<br>
</div>
</div><div>
</main>
</body>
</html>