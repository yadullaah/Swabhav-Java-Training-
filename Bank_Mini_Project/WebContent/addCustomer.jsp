<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Add Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Add Customer</h2>
        <form action="AddCustomerServlet" method="post">
            <div class="mb-3">
                <label for="customerName" class="form-label">Customer Name</label>
                <input type="text" class="form-control" id="customerName" name="customerName" required>
            </div>
            <div class="mb-3">
                <label for="customerEmail" class="form-label">Customer Email</label>
                <input type="email" class="form-control" id="customerEmail" name="customerEmail" required>
            </div>
            <div class="mb-3">
                <label for="customerPassword" class="form-label">Password</label>
                <input type="password" class="form-control" id="customerPassword" name="customerPassword" required>
            </div>
            <button type="submit" class="btn btn-primary">Add Customer</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
