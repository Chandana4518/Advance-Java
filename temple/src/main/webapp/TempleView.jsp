<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>View Page</title>
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
			<li class="nav-item"><a class="nav-link" href="total">Temple</a></li>
			<li class="nav-item"><a class="nav-link" href="#">View</a></li>

		</ul>
	</nav>
	<h1>Temple Details...</h1>
	<div>
	<table class="table table-bordered">
	<tr class="table-success">
	<th>Name</th>
	<th>Place</th>
	<th>MainGod</th>
	<th>ConstYear</th>
	<th>ConstBy</th>
	</tr>
	
	<jstl:forEach items="${view}" var="dto">
	<tr>
	<td class="table-secondary">${dto.name}</td>
	<td class="table-secondary">${dto.place}</td>
	<td class="table-secondary">${dto.mainGod}</td>
	<td class="table-secondary">${dto.constYear}</td>
	<td class="table-secondary">${dto.constBy}</td>
	</tr>
	</jstl:forEach>
	</table>
	</div>
	

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>

</body>
</html>