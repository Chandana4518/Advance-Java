<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Player File</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="Player.jsp">Player</a></li>
				<li class="nav-item"><a class="nav-link active" href="#">Success</a></li>
				<li class="nav-item"><a class="nav-link" href="Product.jsp">Product</a></li>
				<li class="nav-item"><a class="nav-link" href="Vendor.jsp">Vendor</a></li>
			</ul>
		</nav>
		
		<h1>Player Sent Successfully</h1>
		
		<p>Name : ${Name}</p>
		<p>Sport : ${Sport}</p>
		<p>Country : ${Country}</p>
		<p>JerseyNo : ${JerseyNo}</p>
		<p>Age : ${Age}</p>
		<p>CaptainName : ${CaptainName}</p>
		<p>CoachName : ${CoachName}</p>
		<p>Mother : ${Mother}</p>
		<p>Father : ${Father}</p>
		<p>Wife : ${Wife}</p>
		<p>DOB : ${DOB}</p>
		<p>Alive : ${Alive}</p>
		<p>Gender : ${Gender }</p>
		<p>MaritalStatus : ${MaritalStatus }</p>
		
		
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>