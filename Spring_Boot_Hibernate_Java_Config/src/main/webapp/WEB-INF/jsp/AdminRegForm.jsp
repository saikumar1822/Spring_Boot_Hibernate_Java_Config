<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.error {
	color: red;
	font-style: italic;
}
</style>
<form:form method="post" action="saveAdmin" modelAttribute="admin">
	<h1 class="jumbotron" HEIGHT=100>Add New User</h1>
	<table>
		<tr>
			<form:hidden path="adminId"></form:hidden>
			<td>FirstName :</td>
			<td><form:input path="firstName" id="firstName" /></td>
		</tr>
		<tr>
			<td>LastName :</td>
			<td><form:input path="lastName" id="lastName" /></td>
		</tr>
		<tr>
			<td>Age :</td>
			<td><form:input path="age" id="age" /></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td><form:input path="gender" id="gender" /></td>
		</tr>
		<tr>
			<td>ContactNumber :</td>
			<td><form:input path="contactNumber" id="contactNumber" value="" /></td>

		</tr>
		<tr>
			<td>Password :</td>
			<td><form:password path="password" id="password" value="" /></td>
		</tr>
		<tr>
			<td><br /></td>
			<td><input type="submit" class="btn btn-success" value="Save" /></td>
		</tr>
	</table>

</form:form>
