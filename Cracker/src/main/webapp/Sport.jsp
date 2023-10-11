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
	<form action="sport" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="#">Sport</a></li>
				<li class="nav-item"><a class="nav-link" href="Product.jsp">Product</a></li>
				<li class="nav-item"><a class="nav-link" href="Vendor.jsp">Vendor</a></li>
			</ul>
		</nav>
		<label class="form-check-label" for="inlineRadio1">Gender
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="gender"
					id="inlineRadio1" value="female"> <label
					class="form-check-label" for="inlineRadio1">Female</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="gender"
					id="inlineRadio2" value="male"> <label
					class="form-check-label" for="inlineRadio2">Male</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="gender"
					id="inlineRadio3" value="others"> <label
					class="form-check-label" for="inlineRadio3">Others</label>
		</label>
	</form>
	<div class="col-12">
		<div class="text-center">
			<button type="submit" class="btn btn-primary">Send</button>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>