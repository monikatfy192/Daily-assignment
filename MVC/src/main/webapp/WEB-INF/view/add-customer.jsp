
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
   ADD CUSTOMER
</h1>
<form:form action="addconfirm" modelAttribute="newcustomer" >
    irst name: <form:input path="firstName"/><form:errors path="firstName" cssClass="error"/> <br>
    last name: <form:input path="lastName"/><form:errors path="lastName" cssClass="error"/><br>
    age: <form:input path="age"/><br>
    email: <form:input path="email"/><form:errors path="email" cssClass="error"/><br>
    active: <form:checkbox path="active"/><br>
    courseCode: <form:input path="courseCode"/><form:errors path="courseCode" cssClass="error"/><br><br>
    gender:<br>
     <form:radiobutton path="gender" value="male"/>male
   <form:radiobutton path="gender" value="female"/>female<br>
    country: <form:select path="country">
        <form:option value="egypt" label="egypt"/>
    <form:option value="german" label="german"/>
    <form:option value="italy" label="italy"/>
    <form:option value="paris" label="paris"/><br>
    </form:select>
    <input type="submit" value="add customer">

</form:form>

</body>
</html>
