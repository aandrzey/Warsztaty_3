<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 24.08.2019
  Time: 20:13
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
<a href="/adminGroups">Powrót</a>
<br><br>

<h1>Edytuj grupę</h1>

<form action="/groupEdit" method="post">
    <label>Nazwa grupy:
        <input type="text" name="name">
    </label>
    <br>
    <input type="hidden" name="id" value="${id}">
    <input type="submit" value="Zapisz">
</form>

<%@include file="fragments/footer.jspf" %>
</body>
</html>
