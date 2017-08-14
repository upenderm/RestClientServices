<html>
<body>
	<h2>Hello World!</h2>
	<form action="empDetails" method="get">
		<label>Test your GET request here. "getEmployeeDetails" is
			called here.</label> <input type="text" name="empId" /> <input type="submit" />
	</form>
	<div style="height: 100px;">&nbsp;</div>
	<hr />
	<div style="height: 100px;">&nbsp;</div>
	<form action="createEmployee" method="post">
		<label>Test your POST request here. "createEmployeeDetails" is
			called here.</label>
		<table>
			<tr>
				<td><input type="text" name="empId" /></td>
			</tr>
			<tr>
				<td><input type="text" name="empName" /></td>
			</tr>
			<tr>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
