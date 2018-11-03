<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		Choose: <a href="?lang=en">English</a> | <a href="?lang=fr">French</a>
	</p>

	<form:form action="reserve" modelAttribute="dineInForm" method="post">
		<table>
			<tr>
				<td><spring:message code="label.restaurantName"></spring:message></td>
				<td><form:select path="restaurantName">
						<form:option value="Select"></form:option>
						<form:options items="${restaurantList}" />
					</form:select>
				</td>
				<td><form:errors path="restaurantName" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
			<td><spring:message code="label.restaurantType"></spring:message></td>
				<td><form:select path="restaurantType">
						<form:option value="Sea View"></form:option>
						<form:option value="Lake View"></form:option>
					</form:select>
				</td>
				<td><form:errors path="restaurantType" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
			<td><spring:message code="label.reserveOn"></spring:message></td>
				<td><form:input path="reserveOn" /></td>
				<td><form:errors path="reserveOn" cssStyle="color:red"></form:errors></td>
				<td><form:label path="reserveOn">[mm/dd/yyyy]</form:label> </td>
			</tr>
			<tr>
			<td><spring:message code="label.reserveTime"></spring:message></td>
				<td><form:radiobuttons path="reserveTime" items="${timeList}" /></td>
				<td><form:errors path="reserveTime" cssStyle="color:red"></form:errors></td>

			</tr>
			<tr>
			<td><spring:message code="label.guestName"></spring:message></td>
				<td><form:input path="guestName" /></td>
				<td><form:errors path="guestName" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
			<td><spring:message code="label.noOfGuest"></spring:message></td>
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
