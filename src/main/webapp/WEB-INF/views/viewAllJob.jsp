<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Job Listings</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand fw-bold" href="/">Job Portal</a>
    </div>
</nav>

<div class="container py-5">
    <h2 class="mb-4">Available Jobs</h2>

    <c:if test="${empty jobs}">
        <div class="alert alert-info">No jobs available right now. Please check back later.</div>
    </c:if>

    <c:if test="${not empty jobs}">
        <div class="table-responsive shadow-sm">
            <table class="table table-striped align-middle">
                <thead class="table-dark">
                    <tr>
                        <th>#</th>
                        <th>Title</th>
                        <th>Company</th>
                        <th>Location</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="job" items="${jobs}">
                        <tr>
                            <td>${job.id}</td>
                            <td>${job.title}</td>
                            <td>${job.company}</td>
                            <td>${job.location}</td>
                            <td>${job.description}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </c:if>

    <div class="mt-4">
        <a href="/" class="btn btn-primary">Back to Home</a>
    </div>
</div>

</body>
</html>
