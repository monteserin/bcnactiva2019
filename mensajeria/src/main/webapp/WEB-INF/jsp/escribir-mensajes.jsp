<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="/escribirMensajes2">
<textarea name="txt"></textarea>

<c:forEach var="u" items="${usuarios}">
<p><input type="checkbox" name="ids" value="${u.id}"/> ${u.nombre}</p>
</c:forEach>

<button>Enviar</button>
</form>