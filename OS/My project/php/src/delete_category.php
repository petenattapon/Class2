<?php
// include_once('resources/init.php');
// $conn = new mysqli('db', 'MYSQL_USER', 'MYSQL_PASSWORD', 'blog');
// $id = ($_GET['id']);
// $sql = "DELETE FROM categories WHERE id = $id;";
// if ($conn->query($sql)) {
//     echo "<script>alert('Book Deleted Successfully!');</script>";
//     echo "<script>window.location.href='category_list.php'</script>";
//   } else {
//     echo "Error deleting record: " . $conn->error;
//     echo "<script>window.location.href='category_list.php'</script>";
//   }
// $conn->close();

include_once('resources/init.php');

// Connect to the database
$conn = new mysqli('db-service', 'MYSQL_USER', 'MYSQL_PASSWORD', 'blog');

// Check if the connection was successful
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Delete the record from the categories table
$id = ($_GET['id']);
$sql = "DELETE FROM categories WHERE id = $id;";
if ($conn->query($sql)) {
    echo "<script>alert('Category Deleted Successfully!');</script>";
    echo "<script>window.location.href='category_list.php'</script>";
} else {
    echo "Error deleting record: " . $conn->error;
    echo "<script>window.location.href='category_list.php'</script>";
}

// Close the connection
$conn->close();


?>
?>