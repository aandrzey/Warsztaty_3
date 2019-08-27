<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 24.08.2019
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf"%>

<h1>Panel Admina</h1>

<a href="/adminGroups">Zarządzanie grupami użytkowników</a>
<br>
<a href="/adminUsers">Zarządzanie użytkownikami</a>
<br>
<a href="/adminExercises">Zarządzanie zadaniami</a>


<%@include file="fragments/footer.jspf"%>
</body>
</html>
