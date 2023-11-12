<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="send" method="post">
<h1>Crackers.....</h1>

<br>Cracker Name :<input type="text" name="name">
<br>Brand :<input type="text" name="brand">
<br>Color :<input type="text" name="color">
<br>Price :<input type="number" name="price">
<br>Length :<input type="number" name="length">
<button type="submit">Send DTO</button>

</form>

<h2>${validName}</h2>
<h2>${validBrand}</h2>
<h2>${validColor}</h2>
<h2>${validPrice}</h2>
<h2>${validLength}</h2s>
</body>
</html>