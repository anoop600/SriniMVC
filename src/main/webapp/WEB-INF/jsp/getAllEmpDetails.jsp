<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Username</th>
			<th>Password</th>
			<th>Fullname</th>
			<th>Emailid</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Security Question</th>
			<th>Security Answer</th>
		</tr>
		<c:forEach items="${message}" var="employee">
		 <tr>
		 	<td>${employee.empId}</td>
		 	<td>${employee.username}</td>
		 	<td>${employee.password}</td>
		 	<td>${employee.fullName}</td>
		 	<td>${employee.emailid}</td>
		 	<td>${employee.dob}</td>
		 	<td>${employee.gender}</td>
		 	<td>${employee.securityQuestion}</td>
		 	<td>${employee.securityAnswer}</td>
		 	<td></td>
		 	<td></td>
		 	
		</tr>
		</c:forEach>
	
	</table>
	
	<a href="index.html">Index</a>
</body>
</html>