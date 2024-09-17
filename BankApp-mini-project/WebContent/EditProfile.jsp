<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit profile</title>
    <style>
        body {
            background-color: #1e272e;
            font-family: 'Courier New', Courier, monospace;
            color: #ffffff;
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
        .form-container {
            background-color: #353b48;
            border-radius: 8px;
            padding: 30px;
            margin-top: 50px;
            box-shadow: 0px 16px 32px rgba(0, 0, 0, 0.5);
        }
        .form-header {
            text-align: center;
            font-size: 24px;
            margin-bottom: 20px;
            color: #ffffff;
        }
        .form-group label {
            color: #ffffff;
        }
        .form-control {
            background-color: #ffffff;
            color: #000000;
            border: none;
            border-radius: 5px;
            padding: 10px;
            margin-bottom: 15px;
        }
        .btn-success {
            background-color: #44bd32;
            border: none;
            font-weight: bold;
            width: 100px;
            transition: background-color 0.3s;
        }
        .btn-success:hover {
            background-color: #38a828;
        }
        .btn-info {
            background-color: #40739e;
            border: none;
            font-weight: bold;
            width: 100px;
            transition: background-color 0.3s;
        }
        .btn-info:hover {
            background-color: #386893;
        }
        .text-center {
            text-align: center;
        }
    </style>
</head>
<body>
    <nav class="navbar-custom">
        <div class="container">
            <div class="d-flex justify-content-center w-100">
                <a class="navbar-brand font-weight-bold" href="CustomerPortal.jsp">Customer Portal</a>
            </div>
        </div>
    </nav>

    <!-- Form Container -->
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-container">
                    <div class="form-header">Edit Customer</div>
                    <form action="" method="get">
                        <div class="form-group">
                            <label for="customerId">Customer ID</label>
                            <input type="text" class="form-control" id="customerID" name="customerID" placeholder="Customer ID" required>
                        </div>
                        <div class="form-group">
                            <label for="firstName">Customer First Name</label>
                            <input type="text" class="form-control" id="customerFirstName" name="customerFirstName" placeholder="Customer First Name" required>
                        </div>
                        <div class="form-group">
                            <label for="lastName">Customer Last Name (if you don't have a last name, write NA)</label>
                            <input type="text" class="form-control" id="customerLastName" name="customerLastName" placeholder="Customer Last Name" required>
                        </div>
                        <div class="form-group">
                            <label for="email">Email ID</label>
                            <input type="email" class="form-control" id="username" name="username" placeholder="Email ID" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-success">Edit</button>
                            <button type="reset" class="btn btn-info">Cancel</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
