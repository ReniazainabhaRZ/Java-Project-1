<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Login</h1>
<font color="red"><%=request.getAttribute("msg") %></font>

<form method="post" action="<%=request.getContextPath() %>/Controller">

<input type="hidden" name="action" value="student-login" />

Student ID: <input type="text" name="sid" value="<%=request.getAttribute("sid") %>"/> <br><br>
Password: <input type="password" name="password" value="<%=request.getAttribute("password") %>"/> <br><br>

<input type="submit" name="submit" value="login" />

</form>
</body>
</html>