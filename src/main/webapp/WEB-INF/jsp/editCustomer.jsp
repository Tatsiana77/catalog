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
<foam: form action ="/edit-customer" method="post" >
    <input type ="hidden" name="id" value="<c:out value ='${customer.id}' />"/>
    <input type ="text" name="name" value="<c:out value ='${customer.name}' />"/>
    <input type ="text" name="name" value="<c:out value ='${customer.surname}' />"/>
    <input type="submit" value="Edit">
</foam:>
<html>
<body>