<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/logueateomuere/Controlador">
<input type="hidden" name="action" value="loguearse">
<input type="text" name="nombre" />
<input type="password" name="password"/>
<input type="submit">
</form>
<a href="/logueateomuere/Controlador?action=matarSession">Matar sesion</a>
| <a href="/logueateomuere/Controlador?action=irAPagina2">Ir a pagina 2</a>

</body>
</html>