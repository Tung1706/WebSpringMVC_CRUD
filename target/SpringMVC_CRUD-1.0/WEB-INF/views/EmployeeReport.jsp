<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">

		<h1>Add Employee Form</h1>
		<a href="addEmployee" class="btn btn-primary"> Add Employee </a>
		<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Department</th>
						<th scope="col">Salary</th>
						<th scope="col">Address</th>
						<th scope="col">Designation</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${employee}">
						<tr>
							<td class="table-plus">${employee.id}</td>
							<td>${employee.name}</td>
							<td>${employee.department}</td>
							<td>${employee.salary}</td>
							<td>${employee.address}</td>
							<td>${employee.designation}</td>
							<td><a href="editEmployee/${employee.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteEmployee/${employee.id}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>