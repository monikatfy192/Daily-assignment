<%--
  Created by IntelliJ IDEA.
  User: BM
  Date: 4/21/2024
  Time: 11:45 AM
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
<form:form action="process" modelAttribute="customer">

    First Name: <form:input path="firstName"/><form:errors path="firstName" cssStyle="color: blueviolet"/><br>
    Last Name: <form:input path="lastName"/><form:errors path="lastName" cssStyle="color: blueviolet"/><br>
    Email: <form:input path="email"/><form:errors path="email" cssStyle="color: blueviolet"/><br>
    <input type="submit" value="add"/>

</form:form>

<form:form action="${pageContext.request.contextPath}/customer/back" modelAttribute="customer" >
    <input type="submit" value="cancel" />
</form:form>

</body>
</html>
