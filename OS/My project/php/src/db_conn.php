<?php

$sname= "db";
$unmae= "MYSQL_USER";
$password = "MYSQL_PASSWORD";

$db_name = "blog";

$conn = mysqli_connect($sname, $unmae, $password, $db_name);

if (!$conn) {
	echo "Connection failed!";
}