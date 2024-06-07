<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ejemplo MVC</title>
</head>
<body>
<h1><%= "Ejemplo MVC" %></h1>
<br/>
<!--Expresion Languaje que se dirije al Servlet-->
<a href="${pageContext.request.contextPath}/ServletControlador"> Ir al Servlet</a>
</body>
</html>