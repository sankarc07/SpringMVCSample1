<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="reserve" modelAttribute="dineInForm" method="post">
		<table>
			<tr>
				<td><form:label path="restaurantName">Restaurant Name</form:label></td>
				<td><form:select path="restaurantName">
						<form:option value="Select"></form:option>
						<form:options items="${restaurantList}" />
					</form:select>
				</td>
				<td><form:errors path="restaurantName" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="restaurantType">Restaurant Type</form:label></td>
				<td><form:select path="restaurantType">
						<form:option value="Sea View"></form:option>
						<form:option value="Lake View"></form:option>
					</form:select>
				</td>
				<td><form:errors path="restaurantType" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="reserveOn">Reserved Date</form:label></td>
				<td><form:input path="reserveOn" /></td>
				<td><form:errors path="reserveOn" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="reserveTime">Reserved Time</form:label></td>
				<td><form:radiobuttons path="reserveTime" items="${timeList}" /></td>
				<td><form:errors path="reserveTime" cssStyle="color:red"></form:errors></td>

			</tr>
			<tr>
				<td><form:label path="guestName">Name</form:label></td>
				<td><form:input path="guestName" /></td>
				<td><form:errors path="guestName" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="noOfGuest">No Of Guest</form:label></td>
				<td><form:input path="noOfGuest" /></td>
				<td><form:errors path="noOfGuest" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>