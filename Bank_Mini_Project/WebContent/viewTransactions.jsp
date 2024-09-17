<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>View Transactions</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Your Transactions</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Transaction ID</th>
                    <th>Account Number</th>
                    <th>Type</th>
                    <th>Amount</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="transaction" items="${transactions}">
                    <tr>
                        <td>${transaction.transactionId}</td>
                        <td>${transaction.accountNumber}</td>
                        <td>${transaction.type}</td>
                        <td>${transaction.amount}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="dashboard.jsp" class="btn btn-secondary">Back to Dashboard</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
