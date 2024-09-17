<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Transactions</title>

<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<style>
/* Navbar styling */
.navbar-custom {
	background-color: #343a40; /* Darker slate */
}

.navbar-custom .navbar-brand, .navbar-custom .nav-link {
	color: #f8f9fa; /* Light grey */
}

body {
	background-color: #2c2c2c; /* Dark background */
	color: #e0e0e0; /* Light text */
	font-family: Arial, sans-serif;
}

.container {
	margin-top: 50px;
}

h1 {
	color: #ffffff;
	margin-bottom: 30px;
}

table {
	background-color: #3c3c3c; /* Dark table background */
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
}

thead {
	background-color: #007bff; /* Bright blue header */
	color: white;
}

th, td {
	text-align: center;
	padding: 12px;
	color: #e0e0e0; /* Light text */
}

th {
	font-size: 1.1rem;
}

td {
	font-size: 0.95rem;
}

.no-customers {
	text-align: center;
	font-size: 1.2rem;
	color: #dc3545;
	margin-top: 20px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-custom">
		<div class="container">
			<div class="d-flex justify-content-center w-100">
				<a class="navbar-brand font-weight-bold" href="CustomerPortal.jsp">Customer Home</a>
			</div>
		</div>
	</nav>
	<div class="container">
		<h1 class="text-center">All Transactions</h1>

		<!-- Transaction Type Filter -->
		<form method="get" action="PassbookController">
			<div class="form-group">
				<label for="transactionType">Filter by Transaction Type:</label>
				<select id="transactionType" name="transactionType" class="form-control">
					<option value="all">All</option>
					<option value="Credit">Credit</option>
					<option value="Debit">Debit</option>
					<option value="Transfer">Transfer</option>
				</select>
			</div>
			<div class="text-center">
				<button type="submit" class="btn btn-primary">Filter</button>
			</div>
		</form>

		<c:if test="${not empty transactionsList}">
			<div class="table-responsive">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Transaction ID</th>
							<th>Transaction Amount</th>
							<th>Transaction Date</th>
							<th>Transaction Type</th>
							<th>Sender Account</th>
							<th>Receiver Account</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="transaction" items="${transactionsList}">
							<tr>
								<td>${transaction[0]}</td>
								<td>${transaction[1]}</td>
								<td>${transaction[2]}</td>
								<td>${transaction[3]}</td>
								<td>${transaction[4]}</td>
								<td>${transaction[5]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</c:if>

		<c:if test="${empty transactionsList}">
			<p class="no-customers">No transactions found.</p>
		</c:if>
	</div>

	<!-- Bootstrap JS and dependencies (Optional if you have interactive components) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
