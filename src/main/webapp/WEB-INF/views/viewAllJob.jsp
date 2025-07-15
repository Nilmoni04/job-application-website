<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All Jobs</title>
    <link rel="stylesheet" href="<c:url value='/style.css' />" />
</head>

<body>
<div class="container">
    <h2>All Job Listings</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Title</th><th>Company</th><th>Location</th><th>Description</th>
        </tr>
        <c:forEach var="job" items="${jobs}">
            <tr>
                <td>${job.id}</td>
                <td>${job.title}</td>
                <td>${job.company}</td>
                <td>${job.location}</td>
                <td>${job.description}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/">Back to Home</a>
</div>
</body>
</html>

