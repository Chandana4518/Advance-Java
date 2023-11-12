<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>Sheet</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h1>Dto Valid...</h1>
	<table  class="table table-striped">

		<tr>
			<th scope="col">Name</th>
			<th scope="col">Brand</th>
			<th scope="col">Color</th>
			<th scope="col">Price</th>
			<th scope="col">Length</th>
		</tr>
		 <tr>
      <td>${validDto.name}</td>
      <td>${validDto.brand}</td>
      <td>${validDto.color}</td>
      <td>${validDto.price}</td>
      <td>${validDto.length}</td>
      </tr>

</table>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
		
</body>
</html>