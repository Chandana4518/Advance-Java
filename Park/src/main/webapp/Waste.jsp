<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Waste File</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
<form action="save" method="post">
<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link "
					href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="#">Waste</a></li>
					</ul>
		</nav>
		<div class="row mb-3">
			<label for="name" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name">
			</div>
		</div>
		<div class="row mb-3">
			<label for="type" class="col-sm-2 col-form-label">Type</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="type" name="type">
			</div>
		</div>
		<div class="row mb-3">
			<label for="weight" class="col-sm-2 col-form-label">Weight</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="weight" name="weight">
			</div>
		</div>
		<div class="col-12">
			<div class="text-center">
				<button type="submit" class="btn btn-primary">Send</button>
			</div>
		</div>
		</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>