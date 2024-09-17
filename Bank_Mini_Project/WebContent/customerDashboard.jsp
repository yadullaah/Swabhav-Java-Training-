<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Customer Dashboard</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">Customer Dashboard</h2>
		<div class="list-group">
			<a href="PassbookServlet"
				class="list-group-item list-group-item-action">Passbook</a> <a
				href="NewTransactionServlet"
				class="list-group-item list-group-item-action">New Transaction</a> <a
				href="LogoutServlet" class="list-group-item list-group-item-action">Logout</a>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
