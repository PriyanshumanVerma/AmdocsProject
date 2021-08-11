<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>
<centre>
<h1>Feedback</h1>
<form action="<%=request.getContextPath()%>/FeedbackControl" method ="post">
 Name:<input type ="text" name="f_name" ><br>
User id:<input type = "text" name="user_id"><br>
Email:<input type = "email" name="f_email"><br>
Feedback:<input type="text" name="feedback"><br>
<input type = "Submit" value="submit">

</form>
</centre>

</body>
</html>