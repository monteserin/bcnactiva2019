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
<form action="/palabras/Controlador">
<input type="text" name="palabra">
<input type="submit" >
<c:forEach var="palabra" items="${palabrasSession}">
<c:out value="${palabra }" />
</c:forEach>
</form>
</body>
</html>