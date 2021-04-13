<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

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
        <caption><h2>List of Customers</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>customer_Address</th>
            <th>customer_Phone</th>
            <th>customer_email</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td><c:out value="${customer.id}" /></td>
                <td><c:out value="${customer.name}" /></td>
                <td><c:out value="${customer.surname}" /></td>
                <td><c:out value="${customer.customer_Address}" /></td>
                <td><c:out value="${customer.customer_Phone}" /></td>
                <td><c:out value="${customer.customer_email}" /></td>
                <td><button>Orders</button></td>
               <td><button><a href="customers/orders?id=${customer.id}">Orders</a></button></td>
               <td><button><a href="customers/edit?id=${customer.id}">Edit</a></button></td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>