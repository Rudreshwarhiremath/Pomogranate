<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- As a link -->
	<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home page</a>
		</div>
	</nav>
	<h1>Running in Interview</h1>
	<form action="show" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
				name</label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="name">
		</div>
		<div>
			<select class="form-select" aria-label="Default select example"
				name="compnayType">
				<option selected>Open this for company</option>
				<option value="1">X-workz Raj</option>
				<option value="2">X-workz BTM</option>
				<option value="3">Networkz</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">location
			</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="location"
				name="location">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Role
			</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="job role"
				name="role">
		</div>
		<button type="submit" class="btn btn-success">book food</button>
	</form>

</body>
</html>