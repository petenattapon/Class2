<?php
    include_once('resources/init.php');
    $conn = new mysqli('db', 'MYSQL_USER', 'MYSQL_PASSWORD', 'blog');
    $id = ($_GET['id']);
    $sql = "DELETE FROM categories WHERE id = $id;";
    if ($conn->query($sql)) {
        echo "<script>alert('Book Deleted Successfully!');</script>";
        echo "<script>window.location.href='category_list.php'</script>";
      } else {
        echo "Error deleting record: " . $conn->error;
        echo "<script>window.location.href='category_list.php'</script>";
      }

?>