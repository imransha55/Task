<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        .GFG {
            background-color: white;
            border: 2px solid black;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 0px 0px;
            cursor: pointer; 
        }
       #gg
       {
       background-color: white;
            border: 2px solid black;
            color: red;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 0px 0px;
            cursor: pointer; 
       border-radius: 10%;
       }
     .GG
     {
      background-color: transparent;
            border: 2px solid transparent;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 0px 0px;
            cursor: pointer;   
        
     }  
  .GG:hover {
	background-color:rgb(240, 240, 240) ;
	
}
    </style>
</head>
<body style="background: rgba(0, 128, 0, 0.3)">
<h1>Welcome to Deletion page...!</h1>
<form action="DeleteAdmin" method="get">

<br><br>
<input class="GFG" type="text" name="n" placeholder="USERNAmE/MAiL/MOBiLE" required><br><br>
<input class="GFG" type="password" name="p" placeholder="P A S S W o R D" required ><br><br>
<input  id="gg" type="submit" value="Delete">&nbsp;&nbsp;
<input id="gg" type="reset" value="CLEaR">
<br><br>
</form>
<a href="AdminReg.jsp"><button class="GG">Register</button></a><br>
<a href="Forgot.jsp"><button class="GG" >ForgotPassword</button> </a>
</body>
</html>