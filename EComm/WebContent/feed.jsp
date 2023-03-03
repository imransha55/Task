<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <H1>Feedback Form</H1>
    <FORM action="Feed" method="get" enctype="text/plain">
      LoginName : <INPUT type="text" name="dname" placeholder="Enter LogName" required>
 
     
    <br><br>
      Email: <INPUT type="email" name="dmail" placeholder="e-mail address" required>
      <BR>
      <BR>
        Comment :<BR>        
        <TEXTAREA rows="6" cols="50" name="cfield" required></TEXTAREA>
       
        <BR>
        <BR>
        <INPUT TYPE="submit" value="Send Feedback">
        <INPUT TYPE="reset" value="Reset">
    </FORM>
</body>
</html>