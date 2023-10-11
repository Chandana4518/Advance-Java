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
	<form action="player" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="#">Player</a></li>
				<li class="nav-item"><a class="nav-link" href="Product.jsp">Product</a></li>
				<li class="nav-item"><a class="nav-link" href="Vendor.jsp">Vendor</a></li>
			</ul>
		</nav>
		<div class="row mb-3">
			<label for="name" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name">
			</div>
		</div>

		<div class="row mb-3">
			<label for="sport" class="col-sm-2 col-form-label">Sport</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="sport" name="sport">
			</div>
		</div>
		<div class="row mb-3">
			<label for="country" class="col-sm-2 col-form-label">Country</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="country" name="country">
			</div>
		</div>
		<div class="row mb-3">
			<label for="jerseyNo" class="col-sm-2 col-form-label">JerseyNo</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="jerseyNo"
					name="jerseyNo">
			</div>
		</div>
		<div class="row mb-3">
			<label for="age" class="col-sm-2 col-form-label">Age</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="age" name="age">
			</div>
		</div>
		<div class="row mb-3">
			<label for="captainName" class="col-sm-2 col-form-label">captainName</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="captainName"
					name="captainName">
			</div>
		</div>



		<div class="row mb-3">
			<label for="coachName" class="col-sm-2 col-form-label">CoachName</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="coachName"
					name="coachName">
			</div>
		</div>
		<div class="row mb-3">
			<label for="mother" class="col-sm-2 col-form-label">Mother</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="mother" name="mother">
			</div>
		</div>
		<div class="row mb-3">
			<label for="father" class="col-sm-2 col-form-label">Father</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="father" name="father">
			</div>
		</div>
		<label class="form-check-label" for="inlineRadio1">MaritalStatus
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="married"
					id="inlineRadio1" value="single"> <label
					class="form-check-label" for="inlineRadio1">Single</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="married"
					id="inlineRadio2" value="married"> <label
					class="form-check-label" for="inlineRadio2">Married</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="married"
					id="inlineRadio3" value="divorce"> <label
					class="form-check-label" for="inlineRadio3">Divorce</label>
			</div>
		</label>
		<div class="row mb-3">
			<label for="wife" class="col-sm-2 col-form-label">Wife</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="wife" name="wife">
			</div>
		</div>
		<label class="form-check-label" for="inlineRadio1">Alive
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="alive"
					id="inlineRadio2" value="Yes"> <label
					class="form-check-label" for="inlineRadio2">Yes</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="alive"
					id="inlineRadio3" value="No"> <label
					class="form-check-label" for="inlineRadio3">No</label>
			</div>
		</label>
		<div class="row mb-3">
			<label for="dob" class="col-sm-2 col-form-label">DOB</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="dob" name="dob">
			</div>
		</div>
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
			</div>
		</label>
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