<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Add Employee</title>
</head>
<body>
	<form action="addEmployee.html" method="post" >
		${message}
		
        <fieldset >
            <table>
                
                <tr>
                    <td>
                            User Id:
                    </td>
                    <td>
                            <input type="text" name="id" >
                    </td>
                </tr>
                <tr>
                    <td>
                            USERNAME:
                    </td>
                    <td>
                            <input type="text" name="username">
                    </td>
                </tr>
                <tr>
                    <td>
                            Password:
                    </td>
                    <td>
                            <input type="text" name="password">                        
                    </td>
                </tr>
                <tr>
                    <td>
                            Email ID:
                    </td>
                    <td>
                            <input type="text" name="emailid">
                    </td>
                </tr>
                <tr>
                    <td>
                            DOB:
                    </td>
                    <td>
                            <input type="text" name="dob">
                    </td>
                </tr>
                <tr>
                    <td>
                            Gender:
                    </td>
                    <td>
                            <input type="text" name="gender">
                    </td>
                </tr>
                <tr>
                    <td>
                            Security Question:
                    </td>
                    <td>
                            <input type="text" name="securityQuestion">
                    </td>
                </tr>
                <tr>
                    <td>
                            Security Answer:
                    </td>
                    <td>
                            <input type="text" name="securityAnswer">
                    </td>
                </tr>
                <tr>
                        <td>
                                
                        </td>
                        <td>
                                <input type="submit" value="Confirm & Checkout">
                        </td>
                </tr>           
            </table>
        </fieldset>
	</form>
</body>
</html>