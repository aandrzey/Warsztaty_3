<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 27.08.2019
  Time: 12:30
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
<a href="/adminExercises">Powrót</a>
<br><br>

<h1>Dodaj zadanie</h1>

<form action="/exerciseAdd" method="post">
    <label>Tytuł zadania:
        <textarea name="title" rows="3", cols="80"></textarea>
    </label>
    <br>
    <label>Polecenie:
        <textarea name="description" rows="3", cols="80"></textarea>
    </label>
    <br>
    <input type="submit" value="Zapisz">
</form>

<%@include file="fragments/footer.jspf" %>
</body>
</html>
