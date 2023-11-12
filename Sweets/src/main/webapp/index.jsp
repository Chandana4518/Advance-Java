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
Shop Info
<br>
Sweet Name <input name=sweetName type="text"><br>
Price <input name=price type="number"><br>
<button type="submit">Send</button>
<br>

${Valid}
</form>

</body>
</html>