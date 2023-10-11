<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Product File</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
<form action="airport" method="post">
<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="Product.jsp">Product</a></li>
					<li class="nav-item"><a class="nav-link"
					href="Vendor.jsp">Vendor</a></li>
					<li class="nav-item"><a class="nav-link"
					href="Player.jsp">Player</a></li>
					<li class="nav-item"><a class="nav-link active"
					href="#">Airport</a></li>
			</ul>
		</nav>
		 <div class="row mb-3">
    <label for="name" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name">
    </div>
  </div>

	<div class="row mb-3">
			<label for="country" class="col-sm-2 col-form-label">Country</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="country" name="country">
			</div>
		</div>
		
		<div class="row mb-3">
    <label for="type" class="col-sm-2 col-form-label">Type</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="type" name="type">
    </div>
  </div>
  <div class="row mb-3">
    <label for="city" class="col-sm-2 col-form-label">City</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="city" name="city">
    </div>
  </div>
  <div class="row mb-3">
    <label for="capacity" class="col-sm-2 col-form-label">Capacity</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="capacity" name="capacity">
    </div>
  </div>
  <div class="row mb-3">
    <label for="width" class="col-sm-2 col-form-label">Width</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="width" name="width">
    </div>
  </div>
  <div class="row mb-3">
    <label for="totalTerminal" class="col-sm-2 col-form-label">TotalTerminal</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="totalTerminal" name="totalTerminal">
    </div>
  </div>
  <div class="row mb-3">
    <label for="openDate" class="col-sm-2 col-form-label">OpenDate</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" id="openDate" name="openDate">
    </div>
  </div>
  <div class="row mb-3">
    <label for="operational" class="col-sm-2 col-form-label">Operational</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="operational" name="operational">
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