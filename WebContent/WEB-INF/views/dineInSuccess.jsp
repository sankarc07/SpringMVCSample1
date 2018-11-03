<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

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
			<td><spring:eval expression="dineInForm.reserveOn"/></td>
			
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

	<form:form action="fileUpload" modelAttribute="fileUploader" method="post" enctype="multipart/form-data">
		<input type="file" name="multipartFile">
		<input type="submit" value="Upload">
	</form:form>

</body>
</html>
