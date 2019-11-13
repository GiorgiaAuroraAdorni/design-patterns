<%@ page import="view.auth.AuthHelper"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Authentication Example</title>
</head>
<body>
<c:choose>
	<c:when test="${authHelper.isAuthenticated()}">
		<h2>Welcome, <c:out value="${authHelper.getUsername()}"/>!</h2>
		
		<form name="frm" method="post" action="/AdorniBassoCeredaFerri/FrontController">
			<button type="submit" name="command" value="auth.Logout">Logout</button>
		</form>
		
		<c:choose>
			<c:when test="${authHelper.isAdmin()}">
			<p>You have the power!</p>
			</c:when>
		</c:choose>
	</c:when>
	<c:otherwise>
       	<h2>Welcome, guest!</h2>
       	
       	<form name="frm" method="get" action="/AdorniBassoCeredaFerri/login">
			<button type="submit">Login</button>
		</form>
		<form name="frm" method="get" action="/AdorniBassoCeredaFerri/register">
			<button type="submit">Register</button>
		</form>
	</c:otherwise>
</c:choose>
	
	
</body>
</html>