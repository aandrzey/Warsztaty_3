<%--Group
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 24.08.2019
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf"%>

<br>
<a href="/adminGroups">Powrót</a>
<br><br>

<h1>Uwaga</h1>

<div>Nie można usunąć grupy, ponieważ są do niej przypisani użytkownicy. Aby usunąć grupę przypisz użytkowników do innych grup lub ich usuń.</div>

<%@include file="fragments/footer.jspf"%>
</body>
</html>
