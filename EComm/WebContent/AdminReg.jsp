<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: rgba(0, 128, 0, 0.3)">
<h2>Admin Registration Form</h2>
<form action="Reg" method="get">
<table>
<tr>
<td>Admin Name</td>
<td><input type="text" name="an"/></td>
</tr>
<tr>
<td>Admin Mobile</td>
<td><input type="text" name="am"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="ae"/></td>
</tr>
<tr>
<td>LogInName</td>
<td><input type="text" name="ln"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="psw"/></td>
</tr>
</table>
<input type="submit" value="REGiSTER"> &nbsp; &nbsp;
<input type="reset" value="CLEaR">
<br><br>
<a href="AdminLog.jsp">ExistingAdmin..?</a>
</form>

</body>
</html>