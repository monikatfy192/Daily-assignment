<%--
  Created by IntelliJ IDEA.
  User: bm
  Date: 4/22/2024
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="l" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "for" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" herf="${pageContext.request.contextPath}/resources/css/style.css"/>
    <title>list</title>
</head>
<body>
<h2>List of Customers</h2>
<table border="2px">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
    </tr>
    <for:forEach items="${theCustomer}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.firstName}</td>
            <td>${c.lastName}</td>
            <td>${c.email}</td>
            <td><a href="${pageContext.request.contextPath}/customer/delete/${c.id}">Delete</a></td>
            <td><a href="${pageContext.request.contextPath}/customer/${c.id}">Update</a></td>

        </tr>
    </for:forEach>

</table>
<form action="add-customer" modelAttribute="theCustomer">
<input type="submit" value="Add Customer">
</form>

<form action="sort" modelAttribute="theCustomer">
    <input type="submit" value="sort Customer">
</form>
</body>
</html>
