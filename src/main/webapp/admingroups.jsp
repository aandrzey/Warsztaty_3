<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 24.08.2019
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf" %>

<h1>Zarządzanie grupami użytkowników</h1>

<a href="/groupAdd">Dodaj nową grupę</a>
<br><br>

<table border="1">
    <tr>
        <th>Nazwa</th>
        <th>Akcje</th>
    </tr>
    <c:forEach items="${groups}" var="group">
        <tr>
            <td>${group.name}</td>
            <td>
                <a href="/groupEdit?id=${group.id}">Edytuj</a>
                <a href="/groupDelete?id=${group.id}">Usuń</a>
            </td>
        </tr>
    </c:forEach>
</table>

<%@include file="fragments/footer.jspf" %>
</body>
</html>
