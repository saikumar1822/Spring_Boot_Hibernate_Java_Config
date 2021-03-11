<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1" style="border-collapse: collapse">
		<tr>
			<th>PolicyId</th>
			<th>PolicyName</th>
			<th>PolicyType</th>
			<th>DurationOfPolicy</th>
			<th>AmountOfPolicy</th>
			<th>CompanyName</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="listPolicy" items="${listPolicy}">
			<tr>
				<td><c:out value="${listPolicy.policyId}"></c:out></td>
				<td><c:out value="${listPolicy.policyName}"></c:out></td>
				<td><c:out value="${listPolicy.policyType}"></c:out></td>
				<td><c:out value="${listPolicy.durationOfPolicy}"></c:out></td>
				<td><c:out value="${listPolicy.amountOfPolicy}"></c:out></td>
				<td><c:out value="${listPolicy.companyName}"></c:out></td>
				<td><a href="editpolicy?id=${listPolicy.policyId}">Edit</a></td>
				<td><a href="deletepolicy?id=${listPolicy.policyId}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>