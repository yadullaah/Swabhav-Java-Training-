<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>New Transaction</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
/* Navbar styling */
.navbar-custom {
	background-color: #121212; /* Darker slate */
}

.navbar-custom .navbar-brand, .navbar-custom .nav-link {
	color: #BB86FC; /* Light purple */
}

/* Heading styling */
.header-container {
	background-color: #121212; /* Darker slate */
	padding: 15px;
	text-align: left;
	border-bottom: 2px solid #BB86FC;
}

.header-container h1 {
	color: #BB86FC; /* Light purple text */
	margin: 0;
	font-size: 1.5rem;
}

/* Form container styling */
.form-container {
	background-color: #1F1F1F; /* Dark slate */
	border-radius: 12px;
	padding: 30px;
	margin-top: 50px;
	box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.5);
	color: #BB86FC; /* Light purple text */
}

/* Button styling */
.btn-custom {
	background-color: #BB86FC; /* Light purple */
	color: #121212; /* Darker slate */
	width: 100%;
	border-radius: 20px;
	font-size: 16px;
	padding: 12px;
	margin-top: 15px;
}

.btn-custom-cancel {
	background-color: #CF6679; /* Soft red */
	color: #121212; /* Darker slate */
	width: 100%;
	border-radius: 20px;
	font-size: 16px;
	padding: 12px;
	margin-top: 10px;
}

/* Input field styling */
.form-control {
	background-color: #333333; /* Dark grey background */
	color: #BB86FC; /* Light purple text */
	border: none;
	border-radius: 12px;
	padding: 15px;
	margin-top: 10px;
}

/* Hide and show account number */
#toAccountNumberGroup {
	display: none;
}
</style>
</head>
<body>
	<nav class="navbar navbar-custom">
		<div class="container">
			<a class="navbar-brand font-weight-bold" href="CustomerPortal.jsp">Customer Home</a>
			<button class="btn btn-outline-warning"
				onclick="location.href='LogoutController';">Logout</button>
		</div>
	</nav>

	<!-- Heading -->
	<div class="header-container">
		<h1>New Transaction</h1>
	</div>

	<!-- Transaction Form -->
	<div class="container form-container">
		<form action="NewTransactionController" method="post">
			<div class="form-group">
				<label for="transactionType">Type of Transaction:</label> 
				<select id="transactionType" name="transactionType" class="form-control"
					onchange="toggleToAccountNumber(this)">
					<option value="">Select</option>
					<option value="credit">Credit</option>
					<option value="debit">Debit</option>
					<option value="transfer">Transfer</option>
				</select>
			</div>

			<div class="form-group" id="toAccountNumberGroup">
				<label for="toAccountNumber">To Account Number:</label> 
				<input type="text" id="toAccountNumber" name="toAccountNumber"
					class="form-control" placeholder="Enter account number">
			</div>

			<div class="form-group">
				<label for="amount">Amount:</label> 
				<input type="text" id="amount" name="amount" class="form-control" placeholder="Enter amount" required>
			</div>

			<div class="form-group">
				<button type="submit" class="btn btn-custom">Submit</button>
				<button type="reset" class="btn btn-custom-cancel">Cancel</button>
			</div>
		</form>
	</div>

	<!-- JavaScript to handle the conditional display of the "To Account Number" field -->
	<script>
		function toggleToAccountNumber(selectElement) {
			var toAccountNumberGroup = document
					.getElementById("toAccountNumberGroup");
			if (selectElement.value === "transfer") {
				toAccountNumberGroup.style.display = "block";
			} else {
				toAccountNumberGroup.style.display = "none";
			}
		}
	</script>

</body>
</html>
