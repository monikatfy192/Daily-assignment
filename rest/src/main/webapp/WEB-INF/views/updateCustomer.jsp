<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" herf="${pageContext.request.contextPath}/resources/css/style.css"/>
    <title>update</title>
</head>
<body>
<h1>Add Customer Form</h1>

<form:form action="updateProcess" modelAttribute="theCustomer">
    <input type="hidden" name="id" value="${theCustomer.id}">
    First Name: <form:input path="firstName"/><form:errors path="firstName" cssClass="error"/> <br>
    Last Name: <form:input path="lastName"/>  <br>
    email: <form:input path="email"/> <br>

    <input type="submit" value="Update Customer">
</form:form>

</body>
</html>