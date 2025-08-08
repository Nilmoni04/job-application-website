<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Posted Successfully</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand fw-bold" href="/">Job Portal</a>
    </div>
</nav>

<div class="container py-5">
    <div class="alert alert-success" role="alert">
        🎉 Your job has been posted successfully!
    </div>

    <div class="card shadow-sm p-4">
        <h5 class="card-title">${job.title}</h5>
        <p class="text-muted mb-1"><strong>Company:</strong> ${job.company}</p>
        <p class="text-muted mb-3"><strong>Location:</strong> ${job.location}</p>
        <p>${job.description}</p>
    </div>

    <div class="mt-4">
        <a href="/" class="btn btn-primary me-2">Back to Home</a>
        <a href="/view" class="btn btn-outline-secondary">View All Jobs</a>
    </div>
</div>

</body>
</html>
