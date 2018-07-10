<?php

ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

$content = trim(file_get_contents("http://localhost:8080"));
$someArray = json_decode($content, true);

foreach ($someArray as $key => $value) {
    echo $value["id"] . "    ". $value["name"] . "<br>";
}
