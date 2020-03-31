<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Registration</title>
</head>
<body>
<h1>Supplier Registration Form</h1>
<form action="suppform" method="post">
<label>FirstName</label><input name="fname"/><br>
<label>LastName</label><input name="lname"/><br>
<label>Age</label><input name="age"/><br>
<label>Gender</label><input name="gender"/><br>
<label>ContactNumber</label><input name="contactnumber"/><br>
<label>SupplierId</label><input name="supplierid"/><br>
<label>Pasword</label><input name="password"/><br>
<input type="submit" value="register" name="submit"/>
</form>

<h1>Welcome to <%= request.getAttribute("msg")%> </h1> 
</body>
</html>