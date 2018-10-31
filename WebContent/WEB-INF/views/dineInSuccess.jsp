<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserved Success</title>
</head>
<body>
	Thank you for choosing ${dineInForm.restaurantName }
	<table>
		<tr>
			<td>Name :</td>
			<td>${dineInForm.guestName }</td>
		</tr>
		<tr>
			<td>Date :</td>
			<td>${dineInForm.reserveOn }</td>
		</tr>
		<tr>
			<td>Reserved Time :</td>
			<td>${dineInForm.reserveTime}</td>
		</tr>
		<tr>
			<td>No Of Guest :</td>
			<td>${dineInForm.noOfGuest}</td>
		</tr>
	</table>

</body>
</html>