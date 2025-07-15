<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add Job</title>
    <link rel="stylesheet" href="<c:url value='/style1.css' />" />
</head>
<body>
<div class="container">
    <h2>Add Job</h2>
    <form:form action="submitJob" modelAttribute="job" method="post">
        <label>Title:</label>
        <form:input path="title" />

        <label>Company:</label>
        <form:input path="company" />

        <label>Location:</label>
        <form:input path="location" />

        <label>Description:</label>
        <form:textarea path="description" />

        <input type="submit" value="Submit Job" />
    </form:form>
</div>
</body>
</html>

