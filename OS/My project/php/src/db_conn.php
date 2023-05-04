<?php
$host = "db-service";
$user = base64_decode("TVlTUUxfVVNFUg==");
$password = base64_decode("TVlTUUxfUEFTU1dPUkQ=");
$database = "blog";
$port = 3306;

$conn = mysqli_connect($host, $user, $password, $database, $port);

if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

?>