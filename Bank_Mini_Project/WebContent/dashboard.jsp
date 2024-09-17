<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Admin Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Admin Dashboard</h2>
        <div class="list-group">
            <a href="ViewAccountsServlet" class="list-group-item list-group-item-action">View Accounts</a>
            <a href="ViewTransactionsServlet" class="list-group-item list-group-item-action">View Transactions</a>
            <a href="LogoutServlet" class="list-group-item list-group-item-action">Logout</a>
        </div>
        <div class="mt-3">
            <a href="AddCustomerServlet" class="btn btn-success">Add Customer</a>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
