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
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<form action="got" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label> 
			<input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Name">
		</div>
				<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">cruiseName</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="cruiseName"
				name="cruiseName">
		</div>
				<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">EntryFee</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="EntryFee"
				name="entryFee">
		</div>
		<div>
			<select class="form-select" aria-label="Default select example"
				name="freeAlcohol">
				<option selected>freeAlcohol</option>
				<option value="yes">yes</option>
				<option value="No">No</option>
			</select>
		</div>
				<div>
			<select class="form-select" aria-label="Default select example"
				name="freeFood">
				<option selected>freeFood</option>
				<option value="yes">yes</option>
				<option value="No">No</option>
			</select>
		</div>
		<button type="submit" class="btn btn-success">Touch to save</button>
	</form>
</body>
</html>