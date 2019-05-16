<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/proyecto-persona/Controlador">
<input type="text" name="nombre">
<input type="text" name="edad">

<input type="submit">
</form>

<p>El señor/a ${persona.nombre} tiene ${persona.edad} años</p>
<p>El señor/a <c:out value="${persona.nombre}" /> tiene <c:out value="${persona.edad}" /> años</p>

</body>
</html>