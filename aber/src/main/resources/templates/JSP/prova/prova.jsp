<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:forEach items="${risultato}" var="item">
		<h2><c:out value="${item.nome}"/></h2>
</c:forEach>

</body>
</html>