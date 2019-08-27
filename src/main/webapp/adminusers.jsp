<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 27.08.2019
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf" %>

<h1>Zarządzanie użytkownikami</h1>

<a href="/userAdd">Dodaj nowego użytkownika</a>
<br><br>

<table border="1">
    <tr>
        <th>Username</th>
        <th>E-mail</th>
        <th>Grupa</th>
        <th>Akcje</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td>${user.group.name}</td>
            <td>
                <a href="/userEdit?id=${user.id}">Edytuj</a>
                <a href="/userDelete?id=${user.id}">Usuń</a>
            </td>
        </tr>
    </c:forEach>
</table>

<%@include file="fragments/footer.jspf" %>
</body>
</html>
