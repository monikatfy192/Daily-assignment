<%--
  Created by IntelliJ IDEA.
  User: BM
  Date: 4/21/2024
  Time: 12:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/webapp/resources/css/style.css">
</head>
<body>
<h2>Customer List</h2>

<table border="2px">
    <tr>
        <th>id</th>
        <th>first name</th>
        <th>last name</th>
        <th>email</th>
    </tr>
    <c:forEach items="${customer}" var="cl">
        <tr>
            <td>${cl.id}</td>
            <td>${cl.firstName}</td>
            <td>${cl.lastName}</td>
            <td>${cl.email}</td>
<%--            <td>--%>
<%--            <c:url var="delete" value="delete/${cl.id}"/>--%>
<%--            <a href="${delete}">delete</a>--%>
<%--            </td>--%>

            <td><a href="${pageContext.request.contextPath}/customer/updateCustomer/${cl.id}">update</a></td>
            <td><a href="${pageContext.request.contextPath}/customer/delete/${cl.id}">delete</a></td>
        </tr>
    </c:forEach>

</table>
<br>

<form:form action="${pageContext.request.contextPath}/customer/add" modelAttribute="customer" >
    <input type="submit" value="add new customer" />
</form:form>

<form:form action="${pageContext.request.contextPath}/customer/name-sort" modelAttribute="customer" >
    <input type="submit" value="sort alphabetically" />
</form:form>

<form:form action="${pageContext.request.contextPath}/customer/id-sort" modelAttribute="customer" >
    <input type="submit" value="sort by id" />
</form:form>

<%--<form:form action="${pageContext.request.contextPath}/customer/search" modelAttribute="customer" >--%>
<%--    <input type="submit" value="search by name" />--%>
<%--</form:form>--%>

<%--<h2>customer added!</h2>--%>
<%--first name: ${customer.firstName}<br>--%>
<%--last name: ${customer.lastName}<br>--%>
<%--email: ${customer.email}<br>--%>
</body>
</html>
