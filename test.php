<?php

$host = 'localhost';
$username = 'root';
$password = 'Peacebewithyouall2020!!';
$db_name = 'CGD';
$conn = mysqli_connect($host,$username,$password,$db_name);
$ResultSet = mysqli_query($conn,"SELECT * FROM UNIVERSITY_TYPE");
$json_array = array();



    // Add the data to the array
    while($row = mysqli_fetch_assoc($ResultSet)) {
        $json_array[] = $row;
    }


// while($row = mysqli_fetch_array($ResultSet)){
// 	$json_array[] = $row;

// }
$json = json_encode($json_array);

echo $json;

// echo "<pre>";
// print_r($json_array);
// echo "</pre>";
?>



