<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		</div>
	</nav>
	<form action="ragidani" method="post">
 <marquee><h1>Please Select Dish and Hotel </h1></marquee>
		Hotel Name <input type="text" name="hotelName" /> <br> Dish Name
		<select name="dishName">
			<option>Select</option>
			<option>south meals</option>
			<option>North meals</option>
			<option>Rotti curry</option>
			<option>Fried rice</option>
			<option>Rice samber</option>
			<option>Gobi rice</option>
			<option>Nodels</option>
			<option>Full meals</option>
			<option>RagiMudde meals</option>
			<option>Roti meals</option>
			<option>Chapati meals</option>
			<option>Others</option>
		</select><br> Type<select name="type">

			<option>Select</option>
			<option>VEG</option>
			<option>NONVEG</option>
			<option>Drinks</option>
		</select><br> Price <input type="text" name="price" /> <br> Quantity
		<select name="quantity">
			<option>Select</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
			<option>5</option>
			<option>9</option>
			<option>10</option>
			<option>12</option>
		</select><br> 
		Take away    Yes <input type="radio" value="true"
			name="takeAway" /> 
			No<input type="radio" value="false"
			name="takeAway" /><br>
		<button type="submit" class="btn btn-success">Order Food</button>
	</form>

</body>
</html>