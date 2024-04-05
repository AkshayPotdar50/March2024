<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
<h1>Student Registration</h1>
<form action="register" method="post">
<label for="name">Name:</label>
<input type="text" id="name" name="name" required><br><br>

<label for="email">Email:</label>
<input type="email" id="email" name="email" required><br><br>

<label for="course">Course:</label>
<input type="text" id="course" name="course" required><br><br>

<input type="submit" value="Register">

</form>
</body>
</html>