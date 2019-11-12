<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="manipulator" class="model.string.StringManipulator" scope="request"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Front Controller Example</title>
</head>
<body>

<p>
The result is <%=manipulator.getText()%>. 
</p>

Go <a href="registerUserPages/index.jsp">back</a> 
</body>
</html>