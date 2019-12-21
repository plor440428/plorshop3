<?php
include("connect.php");

    echo ini_get("upload_max_filesize")."<br>" ;
    $allowtype=["jpg","jpeg","gif","png","tif","tiff"];
    $filetype=explode("/",$_FILES["filepic"]["type"]);
    $size=$_FILES["filepic"]["size"]/1024/1024;
    if(!in_array($filetype[1], $allowtype)){
            echo "Non-image is not file";

    }
    else if($size>1.00){
        echo "File size exceeds the maximum treshold. <br>";
    }

    else{
        $name=$_POST["txtName"];
        $desc=$_POST["txtdescription"];
        $price=$_POST["price"];
        $unitinstock=$_POST["stock"];
        $catygory=$_POST["category"];
        $filename=$_POST["filepic"]['name'];
        move_uploaded_file($_FILES["filepic"]["tmp_name"],"product/".$_FILES["filepic"]["name"]);
        $sqlinsert="INSERT INTO product(name,description,price,unitin_stock,picture,categoryID)VALUES('$name','$desc','$price','$unitinstock','$filename', $catygory)";
        $result=$conn->query($sqlinsert);
        header("location:index.php");
    }

  
    
?>