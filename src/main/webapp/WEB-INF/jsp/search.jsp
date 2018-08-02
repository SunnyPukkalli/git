<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<br>
${message}
<br>
<a href='/git/logout' >Logout</a>
<br>
${a }

<form method='POST' action="/git/Usersearch">

	<table>
		<tr>
		<td><label>Enter Username : </label></td>
		<td> <input type="text" name="searchUsername" /> </td>
		</tr>
		
		
		<tr>
			<td colspan="2"><input type="submit" name = 'Search'/></td>
		</tr>
		
		<tr>
		<td><input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}"/></td>
		</tr>
		
	</table>

</form>
</body>
</html>