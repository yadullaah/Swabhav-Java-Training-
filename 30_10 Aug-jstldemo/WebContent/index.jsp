<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL DEMO</title>
</head>
<body>
    <c:out value="Yadullah"></c:out>
    <c:set var="greet" value="Hello" scope="session"></c:set>
    <c:out value="${greet}"></c:out>
    <c:set var="number" value="3"></c:set>

    <c:if test="${number % 2 == 0}">
        <h1>even</h1>
    </c:if>
</body>
</html>
