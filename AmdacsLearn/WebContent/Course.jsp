<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
</head>
<body>

<h1>Our Courses</h1>
<form action="<%=request.getContextPath()%>/CoursesControl" method ="post">
Course Id:<input type ="number" name= "c_id"><br>
Course Name:<input type ="text" name="c_name" ><br>
Course Description:<input type = "text" name="c_desp"><br>
Course Resources:<input type = "text" name="c_resource"><br>
Course Fees:<input type="number" name="c_fees"><br>
<input type = "Submit" value="submit">
</form>

</body>
</html>