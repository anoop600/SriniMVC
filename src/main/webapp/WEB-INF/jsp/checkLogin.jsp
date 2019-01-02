<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="checkLogin.html" method="post">
		Enter Employee UserName:
		<br>
		<input type="text" name="username" >
		<br>
		Enter Employee password:
		<br>
		<input type="text" name="password" >
		<br>
		<input type="submit" value="Submit" /> 
	</form>
	<br>
	${message}
	<br>
	<a href="index.html">Index</a>
</body>
</html>