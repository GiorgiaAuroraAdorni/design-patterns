<%@ page import="view.user.UserHelper"%>
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
		String username = UserHelper.getLoggedUsername();
		boolean isAuthenticated = !username.equals(null);
		boolean isAdmin = UserHelper.getLoggedIsAdmin();
	%>

	<h2>
		Benvenuto
		<%=username%>!
	</h2>

	<c:choose>
		<c:when test="${!username.equals(null)}">
			Logged
		</c:when>
		<c:otherwise>
        	Not logged
		</c:otherwise>
	</c:choose>


</body>
</html>