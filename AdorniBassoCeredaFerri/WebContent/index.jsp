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


	<%
		AuthHelper auth = (AuthHelper)request.getAttribute("authHelper");
	%>

	<h2>
		Benvenuto
		<%=auth.getUsername()%>!
	</h2>

	<c:choose>
		<c:when test="${auth.isAuthenticated()}">
			Logged.
			
			<form name="frm" method="post" action="/AdorniBassoCeredaFerri/FrontController">
				<button type="submit" name="command" value="auth.Logout">Logout</button>
			</form>
		</c:when>
		<c:otherwise>
        	Not logged. 
        	
        	<form name="frm" method="get" action="/AdorniBassoCeredaFerri/login">
				<button type="submit">Login</button>
			</form>
		</c:otherwise>
	</c:choose>
	
	


</body>
</html>