<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome page</title>
</head>
<body>
	<form method="get" action="login">
		Username: <input type="text" name="uname" /> 
		Password: <input type="password" name="id" />
		<button type="submit">Submit</button>
	</form>
	<a href="register">Register</a>
</body>
</html>
<table style="width:100%">
  <tr>
  	<th>id</th>
    <th>Product Name</th>
    <th>Product Price</th> 
    <th>Delete</th> 
    </tr>
  
<% ArrayList<Product> productList =  (ArrayList<Product>)request.getAttribute("productList"); 
for (int i=0; i<productList.size(); i++){
Product product = productList.get(i); %>
<tr>
<td><%= product.getId() %></td>
<td><%= product.getProductName() %>
<td><%= product.getProductPrice() %>
<td><form action="list" method="get" ><input type="hidden" name="productId" value="<%= product.getId() %>"><button type="submit">Delete</button></form><td>

<%}  %>
</tr>

</table>

<form action="product" method="post">
	<label>Product Name:</label> 
	<input type="text" name="productName" /><br>
	<label>Product Price: </label>
	<input type="text" name="productPrice" /><br>
	<button type="submit">Add</button>
</form>

<table style="width:100%">
  <tr>
  	<th>id</th>
    <th>Product Name</th>
    <th>Product Price</th> 
     
    </tr>
  
<% ArrayList<Product> productList =  (ArrayList<Product>)request.getAttribute("productList"); 
for (int i=0; i<productList.size(); i++){
Product product = productList.get(i); %>
<tr>
<td><%= product.getId() %></td>
<td><%= product.getProductName() %>
<td><%= product.getProductPrice() %>

<%}  %>
</tr>

</table>