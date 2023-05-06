<!DOCTYPE html>
<html>

<head>
	<title>LOGIN</title>
	<link rel="stylesheet" href="styles.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Sono&display=swap" rel="stylesheet">
</head>

<body>
	<div class="header">
		<h2>LOGIN</h2>
	</div>
	<form action="login.php" method="post">
		<?php if (isset($_GET['error'])) { ?>
			<p class="error"><?php echo $_GET['error']; ?></p>
		<?php } ?>
		<div class="mb-3">
			<label>User Name</label>
			<input type="text" name="uname" placeholder="User Name"><br>
		</div>

		<div class="mb-3">
			<label>Password</label>
			<input type="password" name="password" placeholder="Password"><br>
		</div>

		<button type="submit" style="left:50%; width:100%">Login</button>
		<a href="signup.php" style="display: block; text-align:center;" class="ca">Create an account</a>
	</form>
</body>

</html>