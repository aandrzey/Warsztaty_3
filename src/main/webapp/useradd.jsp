<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 27.08.2019
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf" %>

<br>
<a href="/adminUsers">Powrót</a>
<br><br>

<h1>Dodaj użytkownika</h1>

<form action="/userAdd" method="post">
    <label>Username:
        <input type="text" name="username">
    </label>
    <br>
    <label>E-mail:
        <input type="text" name="email">
    </label>
    <br>
    <label>Hasło:
        <input type="text" name="password">
    </label>
    <br>
    <label>Grupa:</label>
    <select name="groupId">
        <c:forEach items="${groups}" var="group">
            <option value="${group.id}">${group.name}</option>
        </c:forEach>
    </select>
    <br>
    <input type="submit" value="Zapisz">
</form>

<%@include file="fragments/footer.jspf" %>
</body>
</html>
