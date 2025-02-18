<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="com.telusko.JobApp.model.JobPost" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Job Post Details</title>
    <!-- Add Bootstrap CSS link -->

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous">
    <style>
        .card {
            border: 2px solid #343a40; /* Dark border color */
            background-color: #f8f9fa; /* Light background color */
            margin-bottom: 20px;
        }
    </style>

    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">Telusko Job Portal Web App</a>
        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewalljobs">All Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://telusko.com/">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>



<%
    JobPost myJobPost = (JobPost) request.getAttribute("jobPost");
%>


<div class="container mt-5">
    <h2 class="mb-4 text-center font-weight-bold">Job Post Details</h2>
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card border-dark bg-dark text-white">
                <div class="card-body">
                    <h5 class="card-title"><%= myJobPost.getPostProfile() %></h5>
                    <p class="card-text">
                        <strong>Description:</strong>
                        <%= myJobPost.getPostDesc() %>
                    </p>
                    <p class="card-text">
                        <strong>Experience Required:</strong>
                        <%= myJobPost.getReqExperience() %> years
                    </p>
                    <p class="card-text">
                        <strong>Tech Stack:</strong>
                    <ul>
                        <% for (String tech : myJobPost.getPostTechStack()) { %>
                        <li><%= tech %></li>
                        <% } %>
                    </ul>
                    </p>
                </div>
                <div class="card-footer">
                    <!-- Optional footer content -->
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>