<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add New Customer</title>
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

.form-container {
	background-color: #2f3640;
	border-radius: 12px;
	box-shadow: 0px 0px 20px 5px #000000;
	padding: 20px;
}

.form-header {
	background-color: #353b48;
	border-radius: 8px;
	text-align: center;
	padding: 15px;
	margin-bottom: 20px;
	font-size: 24px;
	color: #f5f6fa;
}

.form-group label {
	color: #f5f6fa;
}

.form-control {
	background-color: #353b48;
	color: #f5f6fa;
	border: none;
	border-radius: 8px;
	padding: 10px;
	margin-bottom: 15px;
	width: 100%;
}

.btn {
	background-color: #44bd32;
	border: none;
	color: #ffffff;
	padding: 10px 20px;
	border-radius: 8px;
	cursor: pointer;
	font-size: 16px;
	margin-top: 20px;
	width: 100%;
}

.btn-info {
	background-color: #3498db;
}

.btn:hover {
	opacity: 0.9;
}
</style>
</head>
<body>
	<nav class="navbar-custom">
		<a href="AdminPortal.jsp">Admin Home</a>
	</nav>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="form-container">
					<div class="form-header">Add New Customer</div>
					<form action="AddNewCustomerController" method="get">
						<div class="form-group">
							<label for="customerId">Customer ID</label> <input type="text"
								class="form-control" id="customerID" name="customerID"
								placeholder="Customer ID" required>
						</div>
						<div class="form-group">
							<label for="firstName">Customer First Name</label> <input
								type="text" class="form-control" id="customerFirstName"
								name="customerFirstName" placeholder="Customer First Name"
								required>
						</div>
						<div class="form-group">
							<label for="lastName">Customer Last Name (if you don't
								have a last name, write NA)</label> <input type="text"
								class="form-control" id="customerLastName"
								name="customerLastName" placeholder="Customer Last Name"
								required>
						</div>
						<div class="form-group">
							<label for="email">Email ID</label> <input type="email"
								class="form-control" id="username" name="username"
								placeholder="Email ID" required>
						</div>
						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								class="form-control" id="password" name="password"
								placeholder="Password" required>
						</div>
						<button type="submit" class="btn btn-success">Submit</button>
						<button type="reset" class="btn btn-info">Cancel</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
