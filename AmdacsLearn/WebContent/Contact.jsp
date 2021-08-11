<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/ContactContro" method=post>
User Id:<input type ="number" name= "id"><br>
Name:<input type ="text" name="username" ><br>
Email Id:<input type = "email" name="email"><br>
Phone:<input type = "number" name="phone"><br>
Message:<input type="text" name="message"><br>
Contact Id<input type="number" name="c_id">
<input type = "Submit" value="submit">
</form>


</body>
</html>