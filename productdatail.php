<?php
    session_start();
    if(isset($_GET['pid'])){
        $pid=$_GET['pid'];
    }
    else{
        header("Location:index.php");
    }
    include("connect.php");
    $sql="SELECT * FROM product WHERE id=$pid";
    $result=$conn->query($sql);
    if(!$result){
        echo"Error".$conn->error;
    }
    else{
        if($result->num_rows>0){
        $prd=$result->fetch_object();
    
        }
        else{
            $prd=NULL;
        }
    }


?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>plorshop</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>

<body>
    <nav class="navbar navbar-default">
        <div class="container_fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">plorshop</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">product</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <?php
        if(isset($_SESSION["id"])){
    ?>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">
                            <i class="glyphicon glyphicon-user"></i>
                            Welcom <?php echo $_SESSION['name'];?><span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">โปรไฟร์</a></li>
                            <li><a href="#">รายการสั่งซ้อ</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="logout.php">ออกจากระบบ</a></li>


                        </ul>
                    </li>


                    <li>
                        <a href="#"> <i class="glyphicon glyphicon-shopping-cart"></i></a>
                    </li>
                    <?php
        }
        else{
    ?>
                    <li><a href="loginn.php">Login</a></li>
                    <li><a href="register1111.php">Register</a></li>
                    <?php
        }   
    ?>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <div class="row">
            <h2 class="text-center"><?php echo $prd->name; ?></h2>
        <div class="col-md-6 col-sm-12">
            
            <div class="thumbnail"> 
            
                
                <img src="product/<?php echo $prd->picture; ?>" alt="">
                
            </div>
        </div>
        <div class="col-md-6 col-sm-12">
            <p>Description<?php echo $prd->description; ?></p>
            <p>price<?php echo $prd->price; ?></p>
            <p>stock<?php echo $prd->unitin_stock; ?></p>
            
            <p>
                <a href="" class="btn btn-primary">BUY NOW</a>
                <a href="" class="btn btn-info">Add to basket</a>
            </p>
</div>
        
        </div>



    </div>
   
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>


</body>

</html>