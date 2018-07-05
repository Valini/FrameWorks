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
</head>
<body>
<h1>This is Admin Page</h1>
<% User user = (User)request.getAttribute("user"); %>
	
	User details are:<b> <%=user %></b>
	
<table style="width:100%">
  <tr>
  	<th>id</th>
    <th>Product Name</th>
    <th>Product Price</th> 
    </tr>
  <tr>
<% ArrayList<Product> productList =  (ArrayList<Product>)request.getAttribute("productList"); 
for (int i=0; i<productList.length; i++){
Product product[i]=new Product() %>	
	  <tr><td><%= product[i].id%></td>
	    <td><%= product[i].productName%></td> 
	    <td><%=product[i].productPrice %></td>
</tr>
<%} %>
  
  
 
</table>
	
<form action="product" method="post">
	<label>Product Name:</label> 
	<input type="text" name="productName" /><br>
	<label>Product Price: </label>
	<input type="text" name="productPrice" /><br>
	<button type="submit">Add</button>
</form>

</body>
</html>