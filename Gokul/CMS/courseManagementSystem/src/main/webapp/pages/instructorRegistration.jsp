<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>instructor registration</title>
</head>
<body>
<form action="/isave" method="post">
<label>Name:</label>
<input type="text" name="iname"><br>
<label>phno:</label>
<input type="text" name="pno"><br>
<label>e-mail:</label>
<input type="text" name="email"><br>
<tr>
<label >Course:</label>
<td>
<select name="course">
<option value="" disabled selected>Select Course</option>
<option value="Java">Java</option>
<option value="Python">Python</option>
<option value="C#">C#</option>
</select>
</td>
</tr>
<br>
<label>uname</label>
<input type="text" name="uname"><br>
<label>password</label>
<input type="text" name="psw"><br>
<input type="submit" value="register" >
</form>
</body>
</html>