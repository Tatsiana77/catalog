<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

</head>
<body>

<html>
<body>


<div align="left">
    <table border="1" cellpadding="5">
        <caption><h2>List of Orders</h2></caption>
        <tr>
            <th>Customer</th>
            <th>ID</th>
            <th>countOrders</th>
            <th>dateOfOrder</th>

        </tr>
        <c:forEach var="orders" items="${customers.orders}">
            <tr>
                <td><c:out value="${orders.id}" /></td>
                <td><c:out value="${orders.countOrders}" /></td>
                <td><c:out value="${orders.dateOfOrders}" /></td>

                <td><button>Orders</button></td>
                <td><button><a href="/link/to/" >Orders</button></td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>