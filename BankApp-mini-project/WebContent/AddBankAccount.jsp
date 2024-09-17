<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Bank Account</title>
<style>
body {
	font-family: 'Courier New', Courier, monospace;
	background-color: #1e272e;
	color: #ffffff;
	margin: 0;
	padding: 0;
}

.navbar-custom {
	background-color: #2f3640;
	padding: 15px;
	text-align: center;
}

.navbar-custom a {
	color: #ffffff;
	font-size: 24px;
	text-decoration: none;
}

.container {
	margin-top: 50px;
}

.card {
	background-color: #2f3640;
	border: none;
	border-radius: 12px;
	box-shadow: 0px 0px 20px 5px #000000;
	padding: 20px;
}

.card-header h3 {
	color: #f5f6fa;
	margin-bottom: 20px;
}

.form-inline {
	display: flex;
	justify-content: space-between;
	margin-bottom: 30px;
}

.form-control {
	background-color: #353b48;
	color: #f5f6fa;
	border: none;
	border-radius: 8px;
	padding: 10px;
	width: 80%;
}

.btn-outline-success {
	background-color: #44bd32;
	border: none;
	color: #ffffff;
	border-radius: 8px;
	padding: 10px 20px;
	cursor: pointer;
	font-size: 16px;
}

.btn-outline-success:hover {
	opacity: 0.9;
}

.table {
	width: 100%;
	margin-top: 20px;
	background-color: #353b48;
	color: #f5f6fa;
	border-radius: 8px;
	overflow: hidden;
}

.table th, .table td {
	padding: 15px;
	text-align: left;
	border-bottom: 1px solid #2f3640;
}

.table th {
	background-color: #3b3f44;
}

.btn-primary {
	width: 100%;
	background-color: #44bd32;
	color: #ffffff;
	border: none;
	padding: 12px;
	border-radius: 8px;
	font-size: 16px;
	cursor: pointer;
	margin-top: 20px;
}

.btn-primary:hover {
	opacity: 0.9;
}
</style>
</head>
<body>
	<nav class="navbar-custom">
		<a href="AdminPortal.jsp">Admin Home</a>
	</nav>
	<div class="container">
		<div class="card">
			<div class="card-header">
				<h3>Add Bank Account</h3>
			</div>
			<div class="card-body">
				<form class="form-inline" action="AddBankAccountController"
					method="post">
					<input class="form-control" name="customerID" id="customerID"
						type="text" placeholder="Search by Customer ID">
					<button class="btn-outline-success" type="submit">Search</button>
				</form>

				<c:choose>
					<c:when test="${not empty customerID}">
						<table class="table">
							<tr>
								<th>Customer ID</th>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Username</th>
							</tr>
							<tr>
								<td>${customerID}</td>
								<td>${customerFirstName}</td>
								<td>${customerLastName}</td>
								<td>${username}</td>
							</tr>
						</table>
					</c:when>
					<c:otherwise>
						<p>No customer found with the given ID.</p>
					</c:otherwise>
				</c:choose>

				<form action="GenerateAccountNumberController" method="post">
					<button type="submit" class="btn-secondary">Generate Account
						Number</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
