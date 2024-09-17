<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Passbook</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">Passbook</h2>

		<table class="table table-bordered mt-4">
			<thead class="thead-dark">
				<tr>
					<th>Date</th>
					<th>Transaction Type</th>
					<th>Amount</th>
					<th>Balance</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="transaction" items="${transactions}">
					<tr>
						<td>${transaction.date}</td>
						<td>${transaction.type}</td>
						<td>${transaction.amount}</td>
						<td>${transaction.balance}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<div class="text-center mt-4">
			<a href="customerDashboard.jsp" class="btn btn-primary">Back to
				Dashboard</a>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
