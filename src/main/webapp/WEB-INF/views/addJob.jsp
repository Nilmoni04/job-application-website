<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Post a Job</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand fw-bold" href="/">Job Portal</a>
    </div>
</nav>

<div class="container py-5">
    <h2 class="mb-4">Post a New Job</h2>

    <form:form method="post" action="/submitJob" modelAttribute="job" class="card p-4 shadow-sm bg-white">
        <div class="mb-3">
            <form:label path="title" class="form-label">Job Title</form:label>
            <form:input path="title" class="form-control" placeholder="Enter job title" />
        </div>
        <div class="mb-3">
            <form:label path="company" class="form-label">Company</form:label>
            <form:input path="company" class="form-control" placeholder="Enter company name" />
        </div>
        <div class="mb-3">
            <form:label path="location" class="form-label">Location</form:label>
            <form:input path="location" class="form-control" placeholder="Enter job location" />
        </div>
        <div class="mb-3">
            <form:label path="description" class="form-label">Description</form:label>
            <form:textarea path="description" class="form-control" placeholder="Enter job description" rows="4"></form:textarea>
        </div>
        <button type="submit" class="btn btn-primary">Submit Job</button>
    </form:form>
</div>

</body>
</html>
