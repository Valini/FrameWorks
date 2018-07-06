<nav class="navbar navbar-dark bg-dark navbar-expand-lg fixed-top clean-navbar" style="font-color:white;">
	<div class="container">
		<a class="navbar-brand logo" href="#">Maven Products</a>
		<button class="navbar-toggler" data-toggle="collapse"
			data-target="#navcol-1">
			<span class="sr-only">Toggle navigation</span><span
				class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navcol-1">
			<ul class="nav navbar-nav ml-auto">
				<li class="nav-item" role="presentation">
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
		</div>
	</div>
	</nav>