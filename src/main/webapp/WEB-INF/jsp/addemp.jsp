<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<tittle>Spring MVC Curd Operations</tittle>
	</head>
	
	<body>
		<h2>Add Employee Details</h2>
		<form:form method="POST" action="addemp.htm" commandName="empdata">
			<table>
				<tr>
					<td>Employee Id:</td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td>Employee Name:</td>
					<td><input type="text" name="empName"></td>
				</tr>
				<tr>
					<td>Employee Address:</td>
					<td><input type="text" name="empAddr"></td>
				</tr>
				<tr>
					<td>Employee Age:</td>
					<td><input type="text" name="empAge"></td>
				</tr>
				<tr>
					<td>Employee Salary:</td>
					<td><input type="text" name="empSal"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit"/></td>
				</tr>
			</table>
			</form:form>
	</body>
</html>