<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>N</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<style>
#theoffice {
	width: 50%;
	height: 50%
}
</style>
</head>
<body>
	<nav
		class="navbar navbar-dark bg-dark navbar-expand-lg fixed-top clean-navbar">
		<div class="container">
			<a class="navbar-brand logo" href="index.jsp">JPA Products</a>
			<button class="navbar-toggler" data-toggle="collapse"
				data-target="#navcol-1">
				<span class="sr-only">Toggle navigation</span><span
					class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navcol-1">
				<ul class="nav navbar-nav ml-auto">
					
					
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
					<li class="nav-item" role="presentation">
						<%
							if (session.getAttribute("username") != null) {
						%> <a class="nav-link" href="login">Logout</a> <%
 	} else {
 %> <a class="nav-link" href="login">Login</a> <%
 	}
 %>
					</li>
				</ul>
			</div>
		</div>
	</nav>

</body>
</html>