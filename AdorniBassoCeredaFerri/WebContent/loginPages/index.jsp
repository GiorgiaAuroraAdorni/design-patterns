<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Front Controller Example</title>
</head>
<body>

Enter two numeric values
<form name="frm" method="get" action="/AdorniBassoCeredaFerri/FrontController">
Enter value a: <input type="text" name="a">
Enter value b: <input type="text" name="b">
<button type="submit" name="command" value="math.SumNumbers">Sum</button>
</form>

go <a href="/AdorniBassoCeredaFerri/index.jsp">back</a>
<h2></h2>
</body>
</html>