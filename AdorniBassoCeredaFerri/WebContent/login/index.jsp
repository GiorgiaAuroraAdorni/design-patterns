<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Authentication Example</title>
</head>
<body>

<h1>Login</h1>
<form name="frm" method="post" action="/AdorniBassoCeredaFerri/FrontController">
<label for="username">Username</label><input type="text" name="username"><br>
<label for="password">Password</label><input type="password" name="password"><br>
<button type="submit" name="command" value="auth.Login">Login</button>
</form>

go <a href="/AdorniBassoCeredaFerri/index.jsp">back</a>
<h2></h2>
</body>
</html>