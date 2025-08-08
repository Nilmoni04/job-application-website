Online Job Portal
A modern, full-stack Online Job Portal built with Spring Boot, JSP, Bootstrap, and MySQL.
Admins can securely log in and post jobs, while employees and general users can browse available job listings.
Features a fully redesigned responsive UI, role-based access, and persistent database storage for job posts.

Features
Role-Based Access Control

Admin → Login & post jobs

Users/Employees → View jobs only

Responsive UI with Bootstrap 5

Persistent Storage using MySQL + Spring Data JPA

Secure Login page for authentication

Modernized JSP Pages (Home, Add Job, View All Jobs, Success, Login)

Tech Stack
Backend: Java, Spring Boot, Spring MVC, Spring Data JPA, Spring Security
Frontend: JSP, HTML5, CSS3, Bootstrap 5
Database: MySQL
Build Tool: Maven

src/
 ├── main/
 │   ├── java/com/spring/jobapp/       # Java source files (Controllers, Models, Repositories, Services)
 │   ├── resources/                    # application.properties, static assets
 │   └── webapp/WEB-INF/views/          # JSP files
 └── test/                              # Test cases

