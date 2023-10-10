<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSP index File</title>
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
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="view">View</a></li>
			</ul>
		</nav>
		<h1>Total:${total}</h1>

		<div class="row mb-3">
			<label for="name" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name">
			</div>
		</div>
		<div class="row mb-3">
			<label for="place" class="col-sm-2 col-form-label">Place</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="place" name="place">
			</div>
		</div>
		<div class="row mb-3">
			<label for="god" class="col-sm-2 col-form-label">Main God</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="god" name="god">
			</div>
		</div>
		<div class="row mb-3">
			<label for="year" class="col-sm-2 col-form-label">Const Year</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="year" name="year">
			</div>
		</div>
		<div class="row mb-3">
			<label for="constBy" class="col-sm-2 col-form-label">Const By</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="constBy" name="constBy">
			</div>
		</div>
		<div class="col-12">
			<div class="text-center">
				<button type="submit" class="btn btn-primary">Save</button>
			</div>
		</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>

</body>
</html>