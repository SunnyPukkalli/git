<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript">

var pwd = document.getElementById('password');
var repwd = document.getElementById('repassword');


function validate(){
	alert("inside validate");
	alert(pwd);
	alert(repwd);
if(pwd !=repwd){
	alert("Both the entered passwords do not match");
}
}
</script>

</head>
<body>

${loginMessage }
<form name='f' action='/git/signup' method='POST'>
<table>
	<tr><td> Enter User:</td><td><input type='text' name='username' value=''></td></tr>
	<tr><td> Enter Password:</td><td><input type='password' name='password' id='password'/></td></tr>
	<tr><td> Re-Enter Password:</td><td><input type='password' name='repassword' id='repassword' /></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="signup" onclick="validate()"/></td></tr>
	<tr><td><input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}"/></td></tr>
</table>


</form>
  
  
  
  
</body>
</html>