<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			</a> <a href="index.jsp">Home Page</a>
			<a href="ValitainSearch.jsp">ValitainSearch Page</a>
		</div>
	</nav>
	<c:forEach items="${errors}" var="e">
		<span style="color: red">${e.message}</span>
	</c:forEach>
	<form action="valitain" method="post">
		Name <input type="text" name="name" value="${vdto.name}"> <br>
		Valentine Name<input type="text" name="valentineName"
			value="${vdto.valentineName}"> <br> Valentine place<select
			name="place">
			<option value=" ">select</option>
			<c:forEach items="${place}" var="p">
				<option value="${p}">${p}</option>
			</c:forEach>
		</select> <br> Gift <select name="gift">
			<option value=" ">select</option>
			<c:forEach items="${gifts}" var="g">
				<option value="${g}">${g}</option>
			</c:forEach>
		</select> <br>
		<button type="submit" class="btn btn-success">Success</button>


	</form>




</body>
</html>