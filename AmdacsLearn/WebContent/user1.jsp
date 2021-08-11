<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>Login Form</h1>
<form action ="<%=request.getContextPath()%>/UserConrol" method ="post">
<pre>

User Id:<input type ="number" name= "id"><br>
Name:<input type ="text" name="username" ><br>
Email Id:<input type = "email" name="email"><br>
Password: <input type ="password" name ="password"><br>
Phone:<input type = "number" name="phone"><br>
Address:<input type="text" name="address"><br>
Date:<input type="number" name="date"><br>
Upload Photo:<input type="image" src ="imp.submit.gif" alt="Submit">
<input type = "Register" value="register">

</pre></form>

</body>
</html>