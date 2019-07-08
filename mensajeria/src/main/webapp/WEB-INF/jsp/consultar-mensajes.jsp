<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:forEach var="m" items="${mensajes}">
<p>${m.mensaje}</p>
</c:forEach>
