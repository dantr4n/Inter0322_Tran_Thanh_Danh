<%--
  Created by IntelliJ IDEA.
  User: Danh
  Date: 31/03/2022
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <title>Furama Danang</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
<%--  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"--%>
<%--        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">--%>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <link rel="stylesheet" href="./assets/styles/style.css">
</head>
<body>
<div class="app">
  <header>
    <div id="heading">
      <div id="logo">
        <img src="./assets/images/logo.png" alt="" >
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
              <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/employee">Employee</a>
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

  <div class="container container-alt" id="home">
    <div class="row row-alt">
      <div class="col-3 sidebar"></div>
      <div class="col-9 main"></div>
    </div>
  </div>

  <footer>
    <div id="footer-text">
      <p>© 2018 Furama Resort Danang.</p>
    </div>
  </footer>

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
</body>
</html>