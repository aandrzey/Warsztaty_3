<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 24.08.2019
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf" %>

<a href="/groupUsers?id=${user.group.id}">Powrót</a>

<h1>Szczegóły użytkownika: ${user.username}</h1>
<br>
<div>Nazwa:
    <b>${user.username}</b>
</div>
<br>
<div>E-mail: ${user.email}</div>
<br>
<div>
    <b>Dodane rozwiązania zadań:</b>
</div>
<br>

<table border="1">
    <tr>
        <th>Tytuł zadania</th>
        <th>Data dodania</th>
        <th>Akcje</th>
    </tr>
<c:forEach items="${solutions}" var="solution">
    <tr>
        <td>${solution.exercise.title}</td>
        <td>${solution.created}</td>
        <td><a href="/solutionDetails?id=${solution.id}">Szeczegóły</a></td>
    </tr>
</c:forEach>
</table>

<%@include file="fragments/footer.jspf" %>
</body>
</html>
