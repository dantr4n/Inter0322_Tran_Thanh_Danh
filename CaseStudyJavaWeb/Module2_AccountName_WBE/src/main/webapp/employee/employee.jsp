<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Danh
  Date: 31/03/2022
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Furama - Employee</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <%--  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"--%>
    <%--        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/styles/style.css">
</head>
<body>
<div class="app">
    <header>
        <div id="heading">
            <div id="logo">
                <img src="${pageContext.request.contextPath}/assets/images/logo.png" alt="" >
            </div>
            <div id="user-name">
                <p >Tran Thanh Danh</p>
            </div>
        </div>
        <!-- ---------- Navigation ---------- -->
        <nav class="navbar navbar-alt navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <!-- <a class="navbar-brand" href="#">Navbar</a> -->
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item nav-item-alt" id="nav-home">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item nav-item-alt" id="nav-employee">
                            <a class="nav-link active" aria-current="page" href="#">Employee</a>
                        </li>
                        <li class="nav-item nav-item-alt" id="nav-customer">
                            <a class="nav-link active" aria-current="page" href="#">Customer</a>
                        </li>
                        <li class="nav-item nav-item-alt" id="nav-service">
                            <a class="nav-link active" aria-current="page" href="#">Service</a>
                        </li>
                        <li class="nav-item nav-item-alt" id="nav-contract">
                            <a class="nav-link active" aria-current="page" href="#">Contract</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </header>

    <!-- ---------- Employee Section ---------- -->
    <div class="container container-alt" id="employee-container">
        <div class="row row-alt">
            <div class="col-2 sidebar">
                <div class="sidebar-menu" id="menu-employee">
                    <ul class="list-group sidebar-list">
                        <li class="list-group-item sidebar-item"><a href="#" class="sidebar-link" id="display-employee-link">Display All Employees</a></li>
                        <li class="list-group-item sidebar-item"><a href="#" class="sidebar-link" id="create-employee-link">Add New Employee</a></li>
                    </ul>
                </div>
            </div>
            <!-- ---------- Main ---------- -->
            <div class="col-10 main">
                <div id="form-create-employee" class="d-none mb-3">
                    <h3 class="mt-3">Add Employee</h3>
                    <form class="container" method="post" action="${pageContext.request.contextPath}/employee?action=create">
                        <div class="row">
                            <div class="col">
                                <div class="mt-3 mb-3">
                                    <label for="employeeIDInput" class="form-label">Employee ID</label>
                                    <input type="text" class="form-control" name="id" id="employeeIDInput">
                                </div>
                                <div class="mb-3">
                                    <label for="fullNameInput" class="form-label">Full Name</label>
                                    <input type="text" class="form-control" name="name" id="fullNameInput">
                                </div>
                                <div class="mb-3">
                                    <label for="birthdayInput" class="form-label">Date of Birth</label>
                                    <input type="date" class="form-control" name="birthday" id="birthdayInput">
                                </div>
                                <div class="mb-4">
                                    <%--<label for="genderInput" class="form-label">Gender</label>--%>
                                    <%--<input type="text" class="form-control" id="genderInput">--%>
                                    <label class="form-label">Gender</label>
                                    <div class="d-flex mt-1">
                                        <div class="form-check me-5">
                                            <input class="form-check-input" type="radio" name="gender" id="maleInput" value="false">
                                            <label class="form-check-label" for="maleInput">
                                                Male
                                            </label>
                                        </div>
                                        <div class="form-check ms-4">
                                            <input class="form-check-input" type="radio" name="gender" id="femaleInput" value="true">
                                            <label class="form-check-label" for="femaleInput">
                                                Female
                                            </label>
                                        </div>
                                    </div>

                                </div>
                                <div class="mb-3">
                                    <label for="cardIDInput" class="form-label">Citizen ID</label>
                                    <input type="text" class="form-control" name="idCard" id="cardIDInput">
                                </div>
                                <div class="mb-3">
                                    <label for="phoneInput" class="form-label">Phone Number</label>
                                    <input type="text" class="form-control" name="phoneNumber" id="phoneInput">
                                </div>
                                <div class="mb-3">
                                    <label for="emailInput" class="form-label">Email</label>
                                    <input type="text" class="form-control" name="email" id="emailInput">
                                </div>
                            </div>
                            <div class="col">
                                <div class="mt-3 mb-3">
                                    <label for="addressInput" class="form-label">Address</label>
                                    <input type="text" class="form-control" name="address" id="addressInput">
                                </div>
                                <div class="mb-3">
                                    <label for="educationDegreeInput" class="form-label">Education Degree</label>
<%--                                    <input type="text" class="form-control" id="educationDegreeInput">--%>
                                    <select class="form-select" name="educationDegree" id="educationDegreeInput" aria-label="Select an Education Degree">
                                        <option selected>Select an Education Degree</option>
                                        <option value="1">Intermediate</option>
                                        <option value="2">College</option>
                                        <option value="3">University</option>
                                        <option value="4">Post University</option>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="divisionInput" class="form-label">Division</label>
<%--                                    <input type="text" class="form-control" id="divisionInput">--%>
                                    <select class="form-select" name="division" id="divisionInput" aria-label="Select a Division">
                                        <option selected>Select a Division</option>
                                        <option value="1">Sales-Marketing</option>
                                        <option value="2">Administrative</option>
                                        <option value="3">Service</option>
                                        <option value="4">Management</option>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="positionInput" class="form-label">Position</label>
<%--                                    <input type="text" class="form-control" id="positionInput">--%>
                                    <select class="form-select" name="position" id="positionInput" aria-label="Select a Position">
                                        <option selected>Select a Position</option>
                                        <option value="1">Receptionist</option>
                                        <option value="2">Staff</option>
                                        <option value="3">Specialist</option>
                                        <option value="4">Supervisor</option>
                                        <option value="4">Manager</option>
                                        <option value="4">Director</option>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="salaryInput" class="form-label">Salary</label>
                                    <input type="text" class="form-control" name="salary" id="salaryInput">
                                </div>
                                <div class="mb-4">
                                    <label for="usernameInput" class="form-label">Username</label>
                                    <input type="text" class="form-control" name="username" id="usernameInput">
                                </div>
<%--                                <button type="submit" class="btn btn-primary mt-4">Submit</button>--%>
                                <div class="d-grid gap-2 mt-5">
                                    <button class="btn btn-primary" type="submit">Submit</button>
<%--                                    <button class="btn btn-primary" type="button">Button</button>--%>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
                <div id="table-employee">
                    <h3 style="margin-top: 1rem;">Employees Table</h3>
                    <c:if test="${empty employeeList}">
                        <p class="fs-3 fw-italic text-warning">It's Empty ¯\_(ツ)_/¯</p>
                    </c:if>
                    <c:if test="${not empty employeeList}">
                        <table class="table table-striped table-sm" style="font-size: 0.875rem;">
                            <thead>
                            <tr>
                                <th scope="col">#ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Date of Birth</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Citizen ID</th>
                                <th scope="col">Phone Number</th>
                                <th scope="col">Email</th>
                                <th scope="col">Address</th>
                                <th scope="col">Edu. Degree</th>
                                <th scope="col">Division</th>
                                <th scope="col">Position</th>
                                <th scope="col">Salary</th>
                                <th scope="col">Username</th>
                                <th scope="col">Actions</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="employee" items="${employeeList}">
                                <tr>
                                    <td>${employee.id}</td>
                                    <td>${employee.name}</td>
                                    <td>${employee.birthday}</td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${employee.gender == true}">Female</c:when>
                                            <c:when test="${employee.gender == false}">Male</c:when>
                                        </c:choose>
                                    </td>
                                    <td>${employee.idCard}</td>
                                    <td>${employee.phoneNumber}</td>
                                    <td>${employee.email}</td>
                                    <td>${employee.address}</td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${employee.educationDegree == 1}">Intermediate</c:when>
                                            <c:when test="${employee.educationDegree == 2}">College</c:when>
                                            <c:when test="${employee.educationDegree == 3}">University</c:when>
                                            <c:when test="${employee.educationDegree == 4}">Post-Uni.</c:when>
                                        </c:choose>
                                    </td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${employee.division == 1}">Sales</c:when>
                                            <c:when test="${employee.division == 2}">Administrative</c:when>
                                            <c:when test="${employee.division == 3}">Service</c:when>
                                            <c:when test="${employee.division == 4}">Management</c:when>
                                        </c:choose>
                                    </td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${employee.position == 1}">Receptionist</c:when>
                                            <c:when test="${employee.position == 2}">Staff</c:when>
                                            <c:when test="${employee.position == 3}">Specialist</c:when>
                                            <c:when test="${employee.position == 4}">Supervisor</c:when>
                                            <c:when test="${employee.position == 5}">Manager</c:when>
                                            <c:when test="${employee.position == 6}">Director</c:when>
                                        </c:choose>
                                    </td>
                                    <td>${employee.salary}</td>
                                    <td>${employee.username}</td>
                                    <td>
                                        <button onclick="onUpdate()" type="button" class="btn btn-warning btn-sm"  data-toggle="modal" data-target="#updateEmployeeModal">
                                            Update
                                        </button>
                                        <button onclick="onDelete(${employee.id})" type="button" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#deleteEmployeeModal">
                                            Delete
                                        </button>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </c:if>
                    <nav class="d-flex justify-content-center" id="pagination-container" aria-label="Page navigation example">
                        <ul class="pagination pagination-sm">
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>

            </div>

        </div>
    </div>
    <footer>
        <div id="footer-text">
            <p>© 2018 Furama Resort Danang.</p>
        </div>
    </footer>
</div>

<%-- Update Emplyee Modal --%>
<div class="modal" id="updateEmployeeModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="deleteEmployeeLabel">Update Employee</h5>
                <button type="button" class="btn-close" data-dismiss="modal" aria-label="Close"></button>
            </div>
            <form class="container" method="post" action="${pageContext.request.contextPath}/employee?action=update">
                <input type="hidden" name="id" id="idEmployeeUpdate">
                <div class="row">
                    <div class="col">
                        <div class="mt-3 mb-3">
                            <label for="employeeIDUpdate" class="form-label">Employee ID</label>
                            <input type="text" class="form-control" name="id" id="employeeIDUpdate">
                        </div>
                        <div class="mb-3">
                            <label for="fullNameUpdate" class="form-label">Full Name</label>
                            <input type="text" class="form-control" name="name" id="fullNameUpdate">
                        </div>
                        <div class="mb-3">
                            <label for="birthdayUpdate" class="form-label">Date of Birth</label>
                            <input type="date" class="form-control" name="birthday" id="birthdayUpdate">
                        </div>
                        <div class="mb-4">
                            <%--<label for="genderInput" class="form-label">Gender</label>--%>
                            <%--<input type="text" class="form-control" id="genderInput">--%>
                            <label class="form-label">Gender</label>
                            <div class="d-flex mt-1">
                                <div class="form-check me-5">
                                    <input class="form-check-input" type="radio" name="gender" id="maleUpdate" value="false">
                                    <label class="form-check-label" for="maleUpdate">
                                        Male
                                    </label>
                                </div>
                                <div class="form-check ms-4">
                                    <input class="form-check-input" type="radio" name="gender" id="femaleUpdate" value="true">
                                    <label class="form-check-label" for="femaleUpdate">
                                        Female
                                    </label>
                                </div>
                            </div>

                        </div>
                        <div class="mb-3">
                            <label for="cardIDUpdate" class="form-label">Citizen ID</label>
                            <input type="text" class="form-control" name="idCard" id="cardIDUpdate">
                        </div>
                        <div class="mb-3">
                            <label for="phoneUpdate" class="form-label">Phone Number</label>
                            <input type="text" class="form-control" name="phoneNumber" id="phoneUpdate">
                        </div>
                        <div class="mb-3">
                            <label for="emailUpdate" class="form-label">Email</label>
                            <input type="text" class="form-control" name="email" id="emailUpdate">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mt-3 mb-3">
                            <label for="addressUpdate" class="form-label">Address</label>
                            <input type="text" class="form-control" name="address" id="addressUpdate">
                        </div>
                        <div class="mb-3">
                            <label for="educationDegreeUpdate" class="form-label">Education Degree</label>
                            <%--                                    <input type="text" class="form-control" id="educationDegreeInput">--%>
                            <select class="form-select" name="educationDegree" id="educationDegreeUpdate" aria-label="Select an Education Degree">
                                <option selected>Select an Education Degree</option>
                                <option value="1">Intermediate</option>
                                <option value="2">College</option>
                                <option value="3">University</option>
                                <option value="4">Post University</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="divisionUpdate" class="form-label">Division</label>
                            <%--                                    <input type="text" class="form-control" id="divisionInput">--%>
                            <select class="form-select" name="division" id="divisionUpdate" aria-label="Select a Division">
                                <option selected>Select a Division</option>
                                <option value="1">Sales-Marketing</option>
                                <option value="2">Administrative</option>
                                <option value="3">Service</option>
                                <option value="4">Management</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="positionUpdate" class="form-label">Position</label>
                            <%-- <input type="text" class="form-control" id="positionInput">--%>
                            <select class="form-select" name="position" id="positionUpdate" aria-label="Select a Position">
                                <option selected>Select a Position</option>
                                <option value="1">Receptionist</option>
                                <option value="2">Staff</option>
                                <option value="3">Specialist</option>
                                <option value="4">Supervisor</option>
                                <option value="4">Manager</option>
                                <option value="4">Director</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="salaryUpdate" class="form-label">Salary</label>
                            <input type="text" class="form-control" name="salary" id="salaryUpdate">
                        </div>
                        <div class="mb-4">
                            <label for="usernameUpdate" class="form-label">Username</label>
                            <input type="text" class="form-control" name="username" id="usernameUpdate">
                        </div>
                        <%--                                <button type="submit" class="btn btn-primary mt-4">Submit</button>--%>
                        <div class="d-grid gap-2 mt-5">
                            <button class="btn btn-primary" type="submit">Submit</button>
                            <%--                                    <button class="btn btn-primary" type="button">Button</button>--%>
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>
<%-- Confirm Delete Modal --%>
<div class="modal" id="deleteEmployeeModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="updateEmployeeLabel">Delete Employee Confirmation</h5>
                <button type="button" class="btn-close" data-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="${pageContext.request.contextPath}/employee?action=delete" method="post">
                <input type="hidden" name="id" id="idEmployeeDelete">
                <div class="modal-body">
                    This employee will be deleted from the data. Click <b>"Confirm"</b> to proceed, or <b>"Cancel"</b> to exit.
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Confirm</button>
                </div>
            </form>

        </div>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script src="/assets/js/script.js"></script>
</body>
</html>