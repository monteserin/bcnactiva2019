<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/sumatorio/Controlador">

<input type="hidden" name="action" value="sumar">

<input type="number" name="n1" > + 
<input type="number" name="n2" > = <input type="text" value="${requestSuma}">
<button>Enviar</button>
</form>
${sessionSuma} <br>
${ctxSuma}

<form  action="/sumatorio/Controlador">

<input type="hidden" name="action" value="borrar">
<button>Borrar</button>
</form>
</body>
</html>