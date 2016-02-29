<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>PersonalInfoOutPut</title>
<style>
table {
	border: 1px solid #cccccc;
}
</style>
</head>
<body>

	
			<jsp:useBean id="javaBeans" class="com.apex.sample.beans.JavaBeans" scope="session" />
			
				<center>
					<div height="300" width="300">

						<table>
							<tr>
								<th>FirstName</th>
								<td><jsp:getProperty property="firstName" name="javaBeans" />
								</td>
							</tr>
							<tr>
								<th>LastName</th>
								<td><jsp:getProperty property="lastName" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>MiddleName</th>
								<td><jsp:getProperty property="middleName" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>Gender</th>
								<td><jsp:getProperty property="gender" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>Address</th>
								<td><jsp:getProperty property="address" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>City</th>
								<td><jsp:getProperty property="city" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>State</th>
								<td><jsp:getProperty property="state" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>Country</th>
								<td><jsp:getProperty property="country" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>Phone</th>
								<td><jsp:getProperty property="phone" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>BankName</th>
								<td><jsp:getProperty property="bankName" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>Account</th>
								<td><jsp:getProperty property="account" name="javaBeans" /></td>
							</tr>
							<tr>
								<th>SSN</th>
								<td><jsp:getProperty property="ssn" name="javaBeans" /></td>
							</tr>
							<tr>
								<th colspan="2">You Have Registered Successfully</th>
							</tr>

						</table>
					</div>
				</center>	
</body>
</html>