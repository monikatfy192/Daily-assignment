<%--
  Created by IntelliJ IDEA.
  User: BM
  Date: 4/22/2024
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/webapp/resources/css/add-customer-style.css">

</head>
<body>
<form:form action="update" modelAttribute="customer">

    <input type="hidden" name="id" value="${customer.id}">

    First Name: <form:input path="firstName"/><form:errors path="firstName" cssStyle="color: blueviolet"/><br>
    Last Name: <form:input path="lastName"/><form:errors path="lastName" cssStyle="color: blueviolet"/><br>
    Email: <form:input path="email"/><form:errors path="email" cssStyle="color: blueviolet"/><br>
    <input type="submit" value="update"/>

</form:form>

<form:form action="${pageContext.request.contextPath}/customer/back" modelAttribute="customer" >
    <input type="submit" value="cancel" />
</form:form>

</body>
</html>
