<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 23.08.2019
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf"%>

<h1>Ostatnie rozwiązania</h1>

<table border="1">
    <tr>
        <th>Tytuł zadania</th>
        <th>Autor rozwiązania</th>
        <th>Data dodania</th>
        <th>Akcje</th>
    </tr>
    <c:forEach items="${solutions}" var="solution">
        <tr>
            <td>${solution.exercise.title}</td>
            <td>${solution.user.username}</td>
            <td>${solution.created}</td>
            <td>
                <a href="/solutionDetails?id=${solution.id}">Szczegóły</a>
            </td>
        </tr>
    </c:forEach>
</table>

<%@include file="fragments/footer.jspf"%>
</body>
</html>
