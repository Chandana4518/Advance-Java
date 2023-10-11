<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Food File</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<form action="food" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="#">Food</a></li>
			</ul>
		</nav>
		<div class="row mb-3">
			<label for="name" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name">
			</div>
		</div>
		<div class="row mb-3">
			<label for="price" class="col-sm-2 col-form-label">Price</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="price" placeholder="Enter Price greater than 500"name="price">
			</div>
		</div>
		<div class="col-md-12">
			<label for="type" class="col-sm-2 form-label">Type</label>  <br>
			<select id="type"
				class="form-select" name="type">
				<option selected>Choose...</option>
				<option>Veg</option>
				<option>Non-Veg</option>
				
			</select>
		</div>
		<br>
		<div class="col-md-12">
			<label for="hotelName" class="form-label">HotelName</label><br><select
				id="hotelName" class="form-select" name="hotelName">
				<option selected>Choose...</option>
				<option>Memorable Hotel Logos And Names</option>
				<option>Holiday Inn Express</option>
				<option>Mandarin Oriental Hotel Group</option>
				<option>Homewood Suites by Hilton</option>
				<option>Radisson Hotels</option>
				<option>Chana Aur Khatte Pyaaz Ka Murgh</option>
				<option>Masaledar Chicken Lollipop</option>
				<option>Hotel Indigo</option>
				<option>Wyndham Hotels & Resorts</option>
				<option>Travelodge</option>
				<option>The Peninsula Hotels</option>
				<option>Renaissance Hotels</option>
				<option>Holiday Inn</option>
				<option>Hilton Hotels & Resorts</option>
				<option>Embassy Suites</option>
			</select>
		</div>
		<br>
		
		<div class="col-md-12">
			<label for="quantity" class="form-label">Quantity </label><br><select
				id="quantity" class="form-select" name="quantity">
				<option selected>Choose...</option>
				<option>1 </option>
				<option>2 </option>
				<option>3 </option>
				<option>4 </option>
				<option>5 </option>
				<option>6 </option>
				<option>7 </option>
				<option>8 </option>
				<option>9 </option>
				<option>10 </option>
			</select>
		</div>
		
		<br>
		<div class="col-12">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value="accept"
					id="invalidCheck" required> <label class="form-check-label"
					for="invalidCheck"> Accept Agreement </label>
				<div class="invalid-feedback">You must agree before
					submitting.</div>
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