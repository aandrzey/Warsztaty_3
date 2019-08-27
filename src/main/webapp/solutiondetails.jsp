<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 24.08.2019
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf"%>

<a href="/">Powrót</a>

<h1>Szczegóły rozwiązania zadania:</h1>

<c:out value="${solution.description}"></c:out>

<%@include file="fragments/footer.jspf"%>
</body>
</html>
