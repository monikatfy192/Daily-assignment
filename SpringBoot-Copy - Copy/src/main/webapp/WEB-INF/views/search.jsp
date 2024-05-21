<%--
  Created by IntelliJ IDEA.
  User: BM
  Date: 4/23/2024
  Time: 12:49 PM
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
<form:form action="searchByName" modelAttribute="customer">

    First Name: <form:input path="firstName"/><form:errors path="firstName" cssStyle="color: blueviolet"/><br>
    <input type="submit" value="search"/>
    <input type="hidden" value="firstName">

</form:form>

<%--<h3>Search Result</h3>--%>

<%--<table border="2px">--%>
<%--    <tr>--%>
<%--        <th>id</th>--%>
<%--        <th>first name</th>--%>
<%--        <th>last name</th>--%>
<%--        <th>email</th>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${customer}" var="cl">--%>
<%--        <tr>--%>
<%--            <td>${cl.id}</td>--%>
<%--            <td>${cl.firstName}</td>--%>
<%--            <td>${cl.lastName}</td>--%>
<%--            <td>${cl.email}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>

<%--</table>--%>

</body>
</html>
