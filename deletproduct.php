<?php 
    session_start();
    include("connect.php");


    $pid =$_GET['pid'];
    $sql="DELETE FROM product WHERE id=$pid";
    $resulte=$conn->query($sql);
    if(! $resulte){
        echo "Error".$conn->error;
    }
    else{
        header("Location:index.php");
    }
?>