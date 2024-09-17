<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bank Login</title>
<style>
body {
	font-family: 'Courier New', Courier, monospace;
	background-color: #1e272e;
	color: #ffffff;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.login-box {
	background-color: #2f3640;
	padding: 40px;
	border-radius: 12px;
	box-shadow: 0px 0px 20px 5px #000000;
	width: 320px;
	text-align: center;
}

.login-box h2 {
	margin-bottom: 30px;
	color: #f5f6fa;
}

.login-box .form-group {
	margin-bottom: 20px;
}

.login-box label {
	display: block;
	margin-bottom: 5px;
	color: #dcdde1;
	text-align: left;
}

.login-box input[type="text"], .login-box input[type="password"] {
	width: 100%;
	padding: 12px;
	border: none;
	border-radius: 8px;
	background-color: #353b48;
	color: #f5f6fa;
	font-size: 14px;
}

.login-box input[type="text"]::placeholder, .login-box input[type="password"]::placeholder
	{
	color: #7f8fa6;
}

.login-box button {
	width: 100%;
	padding: 12px;
	border: none;
	border-radius: 8px;
	font-size: 16px;
	cursor: pointer;
	margin-top: 20px;
}

.login-box .btn-submit {
	background-color: #44bd32;
	color: #ffffff;
}

.login-box .btn-cancel {
	background-color: #e84118;
	color: #ffffff;
}

.login-box button:hover {
	opacity: 0.9;
}
</style>
</head>
<body>
	<div class="login-box">
		<h2>Bank Login</h2>
		<form action="LoginController" method="post">
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					id="username" name="username" placeholder="Enter username" required>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					id="password" name="password" placeholder="Enter password" required>
			</div>
			<button type="submit" class="btn-submit">Login</button>
			<button type="reset" class="btn-cancel">Reset</button>
		</form>
	</div>
</body>
</html>
