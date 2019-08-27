<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 27.08.2019
  Time: 12:54
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
<a href="/adminExercises">Powrót</a>
<br><br>

<h1>Uwaga</h1>

<div>Nie można usunąć zadania, ponieważ są do niego przypisane rozwiązania. Aby usunąć zadanie usuń najpierw rozwiązania.</div>

<%@include file="fragments/footer.jspf"%>
</body>
</html>
