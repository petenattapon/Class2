<?php
    include_once('resources/init.php');
    $conn = new mysqli('db', 'MYSQL_USER', 'MYSQL_PASSWORD', 'blog');
    $post = ($_GET['id']);
    $sql = "DELETE FROM posts WHERE id = $post;";
    if ($conn->query($sql)) {
        echo "<script>alert('Book Deleted Successfully!');</script>";
        echo "<script>window.location.href='manage_post.php'</script>";
      } else {
        echo "Error deleting record: " . $conn->error;
        echo "<script>window.location.href='manage_post.php'</script>";
      }

?>