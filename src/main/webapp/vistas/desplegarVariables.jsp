<%--
  Created by IntelliJ IDEA.
  User: USUARIO
  Date: 7/6/2024
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Desplegar variables</title>
</head>
<body>
<h1>Desplegar variables </h1>

Variable de la base del rectangulo: ${rectangulo.base}
<br>
Variable de la altura del rectangulo: ${rectangulo.altura}
<br>
El area del rectangulo es: ${rectangulo.area}
<br>
<a href="${pageContext.request.contextPath}/index.jsp">Ir al inicio</a>

</body>
</html>
