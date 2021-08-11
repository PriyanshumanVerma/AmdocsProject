<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert New Title</title>
</head>
<body>
<h1>Admin Page</h1>
<form action="<%=request.getContextPath()%>/Insert" method ="post">
Admin Id:<input type ="number" name= "Admin_id"><br>
Name:<input type ="text" name="ad_name" ><br>
Email:<input type="email" name="ad_email"><br>
Password:<input type ="password" name=ad_password><br>

<input type = "Submit" value="submit">
</form>
</body>
</html>