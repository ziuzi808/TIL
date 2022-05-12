<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        .box{
            width: 100px;
            height: 100px;
            position: absolute;
            opacity: 0.8;
            float: left;
        }
        .box:nth-child(1){
            background-color: red;
            left: 10px;
            top: 10px;
            z-index: 100;
        }
        .box:nth-child(2){
            background-color: blue;
            left: 50px;
            top: 50px;
            z-index: 10;
        }
        .box:nth-child(3){
            background-color: green;
            left: 100px;
            top: 100px;
            z-index: 50;
        }
    </style>
</head>
<body>
    
    <div class="box"></div>
    <div class="box"></div>
    <div class="box"></div>
</body>
</html>