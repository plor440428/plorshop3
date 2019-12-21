<?php
    session_start();
    include("connect.php");

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
                    <span class="sr-only">Toggle navigation 5555</span>
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
                    <li><a href="search.php">Search</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">
                            <i class="glyphicon glyphicon-user"></i>
                            Product<span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="product2.php?cat=1">คอมพิวเตอร์</a></li>
                            <li><a href="product2.php?cat=2">โทรศัพท์</a></li>
                            <li><a href="product2.php?cat=3">เตารีด</a></li>


                        </ul>
                    </li>

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
            <h2>Search Product</h2>
            <div class="col-md-12">
            <form action="" method="post">
                    <div class="form-group">
                        <div class="col-md-5">
                            <input type="text" class="form-control" name="txtsearch" placeholder="ราคาต่ำสุด">
                        </div>
                        <div class="col-md-5">
                            <input type="text" class="form-control" name="txtsearch2" placeholder="ราคาสูงสุด">
                        </div>
                        <div class="col-md-2">
                            <button name="submit" class="btn btn-block btn-success">
                                <i class="glyphicon glyphicon-search"></i> Go!
                            </button>
                        </div>
                    </div>
            </form>
            </div>
        </div>
    </div>


    <?php
        if(isset($_POST['submit'])){  
            $search = $_POST['txtsearch'];
            $search2 = $_POST['txtsearch2'];
            $sql = "SELECT * FROM product WHERE price BETWEEN '$search' AND '$search2'";
    ?>
        <div class="row">
            <div class="col-md-8 col-md-offset-2" style="margin-top:50px;">
            <h3><?php echo "ผลการค้นหา : ".$search." - ".$search2; ?></h3>
            <?php
            $result = $conn->query($sql);
            
                if(!$result){
                    echo "Error during data retrieval";
                }
                else{
                    //fetch data
                    while($prd = $result->fetch_object()){
                        ?>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12">
                    <div class="thumbnail">
                        <a href="productdetail.php?pid=<?php echo $prd->id; ?>">
                            <img src="img/product/<?php echo $prd->picture ?>" alt="">
                        </a>
                        <div class="caption">
                            <h3><?php echo $prd->name ?></h3>
                            <p><?php echo $prd->description ?></p>
                            <h4>Price : <?php echo $prd->price ?> Baht</h4>
                        </div>
                            <p>
                            <a href="#" class="btn btn-success"><i class="glyphicon glyphicon-shopping-cart"></i> Add To Cart.</a>
                            <a href="editproduct.php?pid=<?php echo $prd->id ?>" class="btn btn-warning"><i class="glyphicon glyphicon-pencil"></i></a>
                            <a href="deleteproduct.php?pid=<?php echo $prd->id ?>" class="btn btn-danger lnkDelete" ><i class="glyphicon glyphicon-trash"></i></a>
                            </p>
                    </div>
                </div>
                        <?php
                    }
                }
            ?>
            </div>
        </div>

    <?php
        }   
    ?>
  
</body>
</html>