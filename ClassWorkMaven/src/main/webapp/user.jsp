<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jac.web.model.User"%>
     <%@page import= "java.util.ArrayList"%>
    <%@page import="com.jac.web.model.Product"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</head>
<body>
<!-- Navbar -->
<%@ include file="navbar2.jsp" %>
<main class="page container" style="margin-top:120px;"> 
<div class="container-fluid">
<h1>Welcome <%out.print(request.getAttribute("username")); %></h1>


<div>  
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Product ID</th>
    <th>Product Name</th>
    <th>Product Price</th> 
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


<%}  %>
</tr>
    </tbody>
  </table>	
  </div>
	
	
</div>
</main>
</body>
</html>