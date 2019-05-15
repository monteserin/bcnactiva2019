<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


${persona.nombre}
<form action="/saludame/Controlador">
<input type="text" name="nombre">
<button>Enviar</button>
</form>


<% //request.getAttribute("elNombre") %>
${elNombre}
<c:out value="${elNombre}" />



</body>
</html>