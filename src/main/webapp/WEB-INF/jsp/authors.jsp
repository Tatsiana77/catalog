
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<head>
    <title>Authors</title>
</head>
<form action="/edit-author" method="post">

    <input type="hidden" name="id" value="<c:out value = '${author.id}'/>"/>
    <input type="text" name="name" value="<c:out value='${author.name}'/> "/>
    <input type="submit" value="Edit">
<table border ="1"  cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Action</th>
    </tr>

    <c:forEach  var="author" items="${authors}">
        <tr>
            <td><c:out value="${author.id}" /></td>
            <td><c:out value="${author.name}" /></td>
            <td><button><a href ="/author/book?id=${author.id}">Books</a></button></td>
            <td><button><a href ="/author/edit?id=${author.id}">Edit</a></button></td>

        </tr>
    </c:forEach>>
</table>
</body>
</html>
