<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>View Accounts</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Your Accounts</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Account Number</th>
                    <th>Balance</th>
                    <th>Account Type</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="account" items="${accounts}">
                    <tr>
                        <td>${account.accountNumber}</td>
                        <td>${account.balance}</td>
                        <td>${account.accountType}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="dashboard.jsp" class="btn btn-secondary">Back to Dashboard</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
