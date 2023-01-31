<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
<form action="show" method="post">
First Name<input type="text" name="fname" />
<br>
Last Name<input type="text" name="lname" />
<br>
<div>Gender
<br>
 male<input  type="radio" value="male" name="gender"/>
 female <input type="radio" value="female" name="gender"/>
 others <input type="radio" value="othes" name="gender"/>
</div>
Address <textarea rows="5" cols="25" name="address"></textarea>
<br>
Reason <textarea rows="5" cols="25" name="reason"></textarea>
<br>
<input type="submit" value="send"/>
</form>
</body>
</html>