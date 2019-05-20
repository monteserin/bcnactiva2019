<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="p" items="${personas}">
 <c:out value="${p.nombre}" /> -  <c:out value="${p.edad}" /> - <c:out value="${p.dni}" />
</c:forEach>
</body>
</html>