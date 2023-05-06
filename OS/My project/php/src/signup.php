<!DOCTYPE html>
<html>

<head>
     <title>SIGN UP</title>
     <link rel="stylesheet" href="styles.css">
     <link rel="preconnect" href="https://fonts.googleapis.com">
     <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
     <link href="https://fonts.googleapis.com/css2?family=Sono&display=swap" rel="stylesheet">
</head>

<body>
     <div class="header">
          <h2>SIGN UP</h2>
     </div>
     <form action="signup-check.php" method="post">
          <?php if (isset($_GET['error'])) { ?>
               <p class="error"><?php echo $_GET['error']; ?></p>
          <?php } ?>

          <?php if (isset($_GET['success'])) { ?>
               <p class="success"><?php echo $_GET['success']; ?></p>
          <?php } ?>
          <div class="mb-3">
               <label>Name</label>
               <?php if (isset($_GET['name'])) { ?>
                    <input type="text" name="name" placeholder="Name" value="<?php echo $_GET['name']; ?>"><br>
               <?php } else { ?>
                    <input type="text" name="name" placeholder="Name"><br>
               <?php } ?>
          </div>
          <div class="mb-3">
               <label>User Name</label>
               <?php if (isset($_GET['uname'])) { ?>
                    <input type="text" name="uname" placeholder="User Name" value="<?php echo $_GET['uname']; ?>"><br>
               <?php } else { ?>
                    <input type="text" name="uname" placeholder="User Name"><br>
               <?php } ?>
          </div>

          <div class="mb-3">
               <label>Password</label>
               <input type="password" name="password" placeholder="Password"><br>

               <label>Re Password</label>
               <input type="password" name="re_password" placeholder="Re_Password"><br>
          </div>

          <button type="submit" style="left:50%; width:100%">Sign Up</button>
          <a href="index.php" style="display: block; text-align:center;" class="ca">Already have an account?</a>
     </form>
</body>

</html>