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
<h1>Festival Info</h1>
Festival Name
<input type="text" name="festivalName">
No of days
<input type="number" name="noOfDays">
Season
<input type="text" name="season">
Date
<input type="text" name="date">
<button type="submit">Save</button>
</form>
<h2>${saved}</h2>

</body>
</html>