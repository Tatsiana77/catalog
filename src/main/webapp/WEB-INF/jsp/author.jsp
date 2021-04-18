<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List Customers Records</title>
</head>
<body>

<html>
<body>


<div align="left">
    <table border="1" cellpadding="5">
        <caption><h2>List of  Author</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="authors" items="${authors}">
            <tr>
                <td><c:out value="${authors.id}" /></td>
                <td><c:out value="${authors.name}" /></td>
                <td><button>Book</button></td>
                <td><button><a href="authors/books?id=${author.id}"> Book </a></button></td>
                <td><button><a href="authors/edit?id=${author.id}"> Edit </a></button></td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>