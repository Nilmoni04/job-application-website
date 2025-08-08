<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Portal - Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand fw-bold" href="/">Job Portal</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="/add">Post Job</a></li>
                <li class="nav-item"><a class="nav-link" href="/view">View Jobs</a></li>
            </ul>
        </div>
    </div>
</nav>

<section class="py-5 text-center">
    <div class="container">
        <h1 class="fw-bold">Welcome to the Job Portal</h1>
        <p class="lead text-muted">Post your job openings and find the right candidates easily.</p>
        <div class="mt-4">
            <a href="/add" class="btn btn-success btn-lg me-3">Post a Job</a>
            <a href="/view" class="btn btn-outline-primary btn-lg">Browse Jobs</a>
        </div>
    </div>
</section>

</body>
</html>
