<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>

hello  ${username}
<br>
<br>
<a href="/git/download">Download</a>
<a href="/git/upload">Upload</a>
<a href="/git/search">Search</a>
<a href="/git/report">Report</a>
<a href="/git/admin">Admin</a>
<br>
<a href='/git/logout' >Logout</a>

</body>
</html>