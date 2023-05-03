
<?php

$host = 'db'; // replace with the IP address of your MySQL container
$user = 'MYSQL_USER';
$password = 'MYSQL_PASSWORD';
$db_name = 'blog';

$conn = mysqli_connect($host, $user, $password, $db_name);

if (!$conn) {
	echo "Connection failed!";
}

?>
