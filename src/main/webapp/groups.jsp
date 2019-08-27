<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 24.08.2019
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="fragments/header.jspf"%>

<h1>Lista grup</h1>

<table border="1">
    <tr>
        <th>Nazwa</th>
        <th>Akcje</th>
    </tr>
    <c:forEach items="${groups}" var="group">
        <tr>
            <td>${group.name}</td>
            <td>
                <a href="/groupUsers?id=${group.id}">Użytkownicy</a>
            </td>
        </tr>
    </c:forEach>
</table>

<%@include file="fragments/footer.jspf"%>
</body>
</html>
