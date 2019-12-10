<?php
    $conn=new mysqli("localhost","root","12345678","plorshop");
    if($conn->connect_errno){

        die("connect error".$conn->connect_error);
    }
    
    
?>