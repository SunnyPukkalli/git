<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

Hii ${Header}

<p style="color: red" > ${error}</p>

<p>${loginMessage}</p>

<form name='f' action='/git/login' method='POST'>
<table>
	<tr><td>User:</td><td><input type='text' name='username' ></td></tr>
	<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
	<tr><td><input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}"/></td></tr>
</table>
</form>
   
   <a href="/git/signup"> Signup</a>
    
</body>
</html>