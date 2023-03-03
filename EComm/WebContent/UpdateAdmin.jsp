<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: rgba(0, 128, 0, 0.3)">
<form action="UpdateAdmin" method="get">
Old Mail:<input type="text" placeholder="ENter Old Mail"  name="omail" id="bg"  required><br><br>
New Mail:<input type="text" placeholder="Enter New Mail" name="nmail" id="bg" required><br/><br/>
New Number:<input type="text" placeholder="Enter New Number" name="nnum" id="bg" required><br/><br/>
New LogName:<input type="text" placeholder="Enter New LogName"name="nlname" id="bg" required><br/><br/>
<input type="submit" value="UPDATE" style="background-color: green; font-size: 15px">&nbsp;&nbsp;
<input type="reset" value="Clear" style="background-color: red; font-size: 15px" >
</form>
</center></div>
</body>
</html>