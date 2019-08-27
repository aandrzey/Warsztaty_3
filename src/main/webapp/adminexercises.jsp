<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 27.08.2019
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf" %>

<h1>Zarządzanie zadaniami</h1>

<a href="/exerciseAdd">Dodaj nowe zadanie</a>
<br><br>

<table border="1">
    <tr>
        <th>Tytuł</th>
        <th>Opis</th>
        <th>Akcje</th>
    </tr>
    <c:forEach items="${exercises}" var="exercise">
        <tr>
            <td>${exercise.title}</td>
            <td>${exercise.description}</td>
            <td>
                <a href="/exerciseEdit?id=${exercise.id}">Edytuj</a>
                <a href="/exerciseDelete?id=${exercise.id}">Usuń</a>
            </td>
        </tr>
    </c:forEach>
</table>

<%@include file="fragments/footer.jspf" %>
</body>
</html>
