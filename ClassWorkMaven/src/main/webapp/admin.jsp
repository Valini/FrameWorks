<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jac.web.model.User"%>
    <%@page import= "java.util.ArrayList"%>
    <%@page import="com.jac.web.model.Product"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</head>
<body>

<!-- Navbar -->
<%@ include file="navbar2.jsp" %>
 <!--Search Form -->
  <form action="search" method="get" id="seachEmployeeForm" role="form" >
    <input type="hidden" id="searchAction" name="searchAction" value="searchByName"/>
    <div class="form-group col-xs-5">
        <input type="text" name="employeeName" id="employeeName" class="form-control" required="true" 
                 placeholder="Type the Name or Last Name of the employee"/>                    
    </div>
    <button type="submit" class="btn btn-success">
        <span class="glyphicon glyphicon-search"></span> Search
    </button>
    <br></br>
    <br></br>
  </form>
  
<main class="page container" style="margin-top:120px;"> 
<div class="container-fluid">
<h1>Welcome <% out.print(session.getAttribute("username")); %></h1>
<br>
<br>
<div>
<h5>Fill out the form below to add a product</h5>
<form action="product" method="post">
					<div class="form-group">
						<label for="productName">Product Name</label><input
							class="form-control item" type="text" id="productName"
							name="productName" required="true">
					</div>
					<div class="form-group">
						<label for="productPrice">Product Price</label><input class="form-control"
							type="text" id="productPrice" name="productPrice" required="true">
					</div>
					<button class="btn btn-primary btn-primary" type="submit">Add</button>
				</form>
</div>
<br>

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
Product product = productList.get(i); %>
<tr>
<td><%= product.getId() %></td>
<td><%= product.getProductName() %>
<td><%= product.getProductPrice() %>
<td><form action="list" method="get" ><input type="hidden" name="productId" value="<%= product.getId() %>"><button class="btn btn-primary" type="submit">Delete</button></form><td>

<%}  %>
</tr>
    </tbody>
  </table>	
  </div>     			
</div>
</main>
</body>
</html>