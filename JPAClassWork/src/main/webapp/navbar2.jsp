<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.navbar-nav{
padding-left: 300px;
}
#login{
padding-left: 1000px;


}

</style>
</head>

<body>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="navbar-brand logo" href="#">JPA Products</a>
    </li>
    <li class="nav-item" role="presentation">
						<%
							if (session.getAttribute("username") != null) {
						%> <a class="nav-link" href="login">Welcome <%
 	out.print(session.getAttribute("username"));
 %></a>
						<%
							} else {
						%> <a class="nav-link" href="login"></a> <%
 	}
 %>
					</li>
    <li class="nav-item" id="login">
      <% 
				if(session.getAttribute("username") != null) {
					%>
					<a class="nav-link" href="login">Logout</a>
					<%
				} else {
					%>
					<a class="nav-link" href="login">Login</a>
					<%
				}
				%>
    </li>
    
  </ul>
</nav>
</body>
</html>


