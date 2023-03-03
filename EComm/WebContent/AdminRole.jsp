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
}

.button1 {background-color: #4CAF50;} /* Green */
.button2 {background-color: #008CBA;} /* Blue */
.button3{background-color: hsl(0, 100%, 50%);}
</style>
</head>
<body style="background: rgba(0, 128, 0, 0.3)">
<h1>Admin Roles</h1>
<a href="AdditionPage.jsp" target="_blank"><button class="button button1">Addition</button><br><br></a>
<a href="UpdationPage.jsp"target="_blank"><button class="button button2">Updation</button><br><br></a>
<a href="DeletePage.jsp"target="_blank"><button class="button button3">Deletion</button><br><br></a>

</body>
</html>
