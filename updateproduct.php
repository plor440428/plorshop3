<?php 
    session_start();
    include("connect.php");
    $pid=$pid=$_POST['hdnproduct'];
    $name=$_POST['txtname'];
    $description=$_POST['txtdescription'];
    $price=$_POST['price'];
    $stock=$_POST['stock'];
    $picture=$_POST['tphdnproductic'];
    if($_FILES["filepic"]["name"]!="")
    {
        $picture=$_FILES["filepic"]["name"];
        move_uploaded_file($_FILES["filepic"]["tmp_name"],"product/".$_FILES["filepic"]["name"]);

    }
    $sql="UPDATE product SET name='$name',description='$description',price=$price,unitin_stock=$stock,picture= '$picture' WHERE id=$pid";
   // echo $sql;
    $result=$conn->query($sql);
    if(! $result){
        echo "Error".$conn->error;

    }
    else{
        header("Location:index.php");
    }


?>