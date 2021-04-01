<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Publisher</title>
</head>
<body>
<form action="/author/book/publisher" method="post">

    <input type="hidden" name="id" value="<c:out value = '${publisher.id}'/>"/>
    <input type="text" name="name" value="<c:out value='${publisher.name}'/> "/>
    <input type="submit" value="Edit">
    <input type="submit" value="Delete">

    <h1>Books</h1>
    <h2>
        <a href="/new">Add New Publisher</a>
        &nbsp;&nbsp;&nbsp;
        <a href="/list">Publisher</a>

    </h2>

    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Books</h2></caption>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Publisher</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${publisher.id}" /></td>
                    <td><c:out value="${publisher.title}" /></td>
                    <td><c:out value="${book.publisher}" /></td>
                    <td>
                        <a href="/edit?id=<c:out value='${publisher.id}' />">Edit</a>
                        <a href="/delete?id=<c:out value='${publisher.id}' />">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>