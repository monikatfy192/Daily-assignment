<%--
  Created by IntelliJ IDEA.
  User: bm
  Date: 4/22/2024
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>add</title>
    <link type="text/css" rel="stylesheet" herf="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>
<body>
<h1>Add Customer Form</h1>

<form:form action="processAdd" modelAttribute="theCustomer">
    First Name: <form:input path="firstName"/> <form:errors path="firstName" cssClass="error"/> <br>
    Last Name: <form:input path="lastName"/>  <br>
    email: <form:input path="email"/> <br>

    <input type="submit" value="add Customer">
</form:form>

</body>
</html>