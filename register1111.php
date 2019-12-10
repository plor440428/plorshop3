
<?php
session_start();

?>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<?php
include_once("connect.php");
if(isset($_POST['submit'])){
    $firstname=$_POST['firstname'];
    $lastname=$_POST['lastname'];
    $email=$_POST['email'];
    $username=$_POST['username'];
    $password=md5($conn->real_escape_string($_POST['password']));
    $confirmpassword=$_POST['confirmpassword'];

    $sqlinsert="INSERT INTO customer(firsname,lastname,email,username,password,active)VALUES('$firstname','$lastname','$email','$username','$password','0')";
   // echo $sqlinsert;

    $resul=$conn->Query($sqlinsert);
    if($resul){
       echo"<script>alert('Register Complete');</script>" ;
       header("Location: index.php");

    }
    else{
        echo"Error diruing insert:" .$conn->error;
    }
}




?>
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <div class="container">
        <div class="row">
            <form action="" method="post">
                <div class="col-md-8 col-md-offset-2" style="margin-top:50px;">
                    <div class="panel panel-primary">
                        <div class="panel-heading text-center">
                            Register
                        </div>
                        <div class="panel-body">
                            <div class="form-group row">
                                <label for="firstname" class="col-md-3">Firstname : </label>
                                <div class="col-md-6">
                                    <input type="text" name="firstname" class="form-control">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lastname" class="col-md-3">Lastname : </label>
                                <div class="col-md-6">
                                    <input type="text" name="lastname" class="form-control">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="email" class="col-md-3">E-mail : </label>
                                <div class="col-md-6">
                                    <input type="text" name="email" class="form-control">
                                </div>
                            </div>
                         <div class="form-group row">
                                <label for="username" class="col-md-3">Username : </label>
                                <div class="col-md-6">
                                    <input type="text" name="username" class="form-control">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="password" class="col-md-3">Password : </label>
                                <div class="col-md-6">
                                    <input type="password" name="password" class="form-control">
                                </div>
                           </div>
                            <div class="form-group row"> 
                                <label for="confirmpassword" class="col-md-3">Confirm Password : </label>
                                <div class="col-md-6">
                                    <input type="password" name="confirmpassword" class="form-control">
                                </div>
                            </div>
                        </div>
                        <div class="panel-footer">
                            <button type="submit" name="submit" class="btn btn-primary btn-block">Login</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>