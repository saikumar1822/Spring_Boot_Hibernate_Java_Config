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

<form:form method="post" action="fetchAdmin" modelAttribute="admin">
	<h1 class="jumbotron" HEIGHT=100>Login/Registration Page</h1>
	<h5 style="color: green">${key}</h5>
	<table>
		<tr>
			<td>Admin Id :</td>
			<td><form:input path="adminId" id="adminId" value="" /></td>
		</tr>

		<tr>
			<td>Password :</td>
			<td><form:password path="password" id="password" value="" /></td>
		</tr>
		<tr>
			<td><br /></td>
			<td><input type="submit" class="btn btn-success" value="Login" /></td>
		</tr>
	</table>

</form:form>
<a href="adminRegistrationForm">AdminRegistration</a>
