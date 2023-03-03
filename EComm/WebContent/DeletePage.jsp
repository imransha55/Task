<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.button {
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 10%;
 width: 125px;
 color: black;
}

.button1 {background-color: #ff0000;} 
.button2 {background-color:#ff0000;} 
.button3{background-color: #ff0000;}
.button4{background-color: #ff0000;}
</style>
</head>
<body style="background: rgba(0, 128, 0, 0.3)">
<h1>What to Delete</h1>
<a href="DeleteAdmin.jsp"><button class="button button1">Admin</button><br><br>
<button class="button button2">User</button><br><br>
<button class="button button3">Category</button><br><br>
<button class="button button4">Product</button>
</body>
</html>