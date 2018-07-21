<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<style type="text/css">


.form-signin {
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}
.form-signin .form-signin-heading,
.form-signin .checkbox {
  margin-bottom: 10px;
}
.form-signin .checkbox {
  font-weight: normal;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="text"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

</style>
</head>
<body>



    <%--   <form class="form-signin" action="${contextRoot}/git/login" method="POST">
      
        <h2 class="form-signin-heading">Please Login in</h2>
      
        <label for="username" class="sr-only">User Name</label>
        <input type="text" name="username" id="username" class="form-control" placeholder="user name" required autofocus>
      
        <label for="password" name="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="Password" required>
      
        <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
        <input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}"/>
      
      </form> --%>


<form name='f' action='/git/login' method='POST'>
<table>
	<tr><td>User:</td><td><input type='text' name='username' value=''></td></tr>
	<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
	<input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}"/>
</table>
</form>
    
</body>
</html>