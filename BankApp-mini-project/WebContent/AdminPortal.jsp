<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%if(session.getAttribute("adminID") == null){
    response.sendRedirect("Login.jsp");
}
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
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
        }
        .navbar-custom a {
            color: #ffffff;
            font-size: 24px;
            text-decoration: none;
        }
        .btn-custom {
            background-color: #44bd32;
            border: none;
            color: #ffffff;
            padding: 15px;
            font-size: 16px;
            font-weight: bold;
            border-radius: 10px;
            cursor: pointer;
            width: 100%;
            margin: 10px 0;
            transition: background-color 0.3s;
        }
        .btn-custom:hover {
            background-color: #38a828;
        }
        .btn-outline-primary {
            background-color: #40739e;
        }
        .btn-outline-primary:hover {
            background-color: #386893;
        }
        .content-container {
            margin-top: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: calc(100vh - 180px);
        }
        .content-card {
            background-color: #353b48;
            color: #ffffff;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            padding: 40px;
            text-align: center;
            width: 75%;
        }
        .content-card h3 {
            font-size: 24px;
            margin-bottom: 15px;
        }
        .content-card p {
            font-size: 18px;
            margin-bottom: 15px;
        }
        .content-card hr {
            border-top: 1px solid #7f8fa6;
            margin: 30px 0;
        }
        .logout-btn {
            background-color: #e84118;
            border: none;
            color: #ffffff;
            padding: 10px 20px;
            border-radius: 10px;
            cursor: pointer;
            font-size: 16px;
            margin-left: auto;
            transition: background-color 0.3s;
        }
        .logout-btn:hover {
            background-color: #c23616;
        }
    </style>
</head>
<body>

    <!-- Navbar Section -->
    <nav class="navbar-custom">
        <div class="container">
            <div class="d-flex w-100">
                <a class="navbar-brand font-weight-bold" href="AdminPortal.jsp">Admin Home</a>
                <button class="logout-btn" onclick="location.href='LogoutController';">Logout</button>
            </div>
        </div>
    </nav>

    <!-- Button Row Section -->
    <div class="container mt-4">
        <div class="row text-center">
            <div class="col-md-3">
                <button class="btn btn-outline-primary" onclick="location.href='AddNewCustomer.jsp';">Add New Customer</button>
            </div>
            <div class="col-md-3">
                <button class="btn  btn-outline-primary" onclick="location.href='AddBankAccount.jsp';">Add Bank Account</button>
            </div>
            <div class="col-md-3">
                <button class="btn btn-outline-primary" onclick="location.href='ViewCustomerController';">View Customers</button>
            </div>
            <div class="col-md-3">
                <button class="btn btn-outline-primary" onclick="location.href='ViewTransactionController';">View Transactions</button>
            </div>
        </div>
    </div>

    <!-- Content Section in Card 
    <div class="content-container">
        <div class="card content-card">
            <div class="card-body">
                <h3>Customer Addition</h3>
                <p>Manage customer information and add new customers to the system.</p>
                <hr>
                <h3>View Customers</h3>
                <p>Access and manage the list of all registered customers.</p>
                <hr>
                <h3>View Transactions</h3>
                <p>Review and analyze customer transactions within the system.</p>
            </div>
        </div>
    </div> -->

</body>
</html>
