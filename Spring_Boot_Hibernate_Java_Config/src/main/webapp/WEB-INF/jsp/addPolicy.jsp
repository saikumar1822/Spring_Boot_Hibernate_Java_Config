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
<form:form method="post" action="savePolicy" modelAttribute="policy">
<h4>${key1}</h4>
<h3>Add the Policy</h3>


	<table>
		<tr>
			<form:hidden path="policyId"></form:hidden>
			<td>PolicyName :</td>
			<td><form:input path="policyName" id="policyName" /></td>
		</tr>
		<tr>
			<td>PolicyType :</td>
			<td><form:input path="policyType" id="policyType" /></td>
		</tr>
		<tr>
			<td>durationOfPolicy :</td>
			<td><form:input path="durationOfPolicy" id="durationOfPolicy" /></td>
		</tr>
		<tr>
			<td>AmountOfPolicy :</td>
			<td><form:input path="amountOfPolicy" id="amountOfPolicy" /></td>
		</tr>
		<tr>
			<td>Company Name :</td>
			<td><form:input path="companyName" id="companyName" /></td>
		</tr>
		<tr>
			<td><br /></td>
			<td><input type="submit" class="btn btn-success" value="Save" /></td>
		</tr>
	</table>
</form:form>
<a href="viewPolicies">ViewPolicies</a>