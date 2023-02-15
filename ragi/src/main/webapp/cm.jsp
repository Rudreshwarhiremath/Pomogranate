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
			</a> <a href="sucess.jsp">Application Page</a>
		</div>
	</nav>
	<form action="cmyogi" method="post">
	
	 <marquee><h1>Please Fill information of CM </h1></marquee>
CM Name	<input type="text" name="name"/> <br>
Party <select name="party">
<option value=" " >Select</option>
<option>BJP</option>
<option>Congress</option>
<option>JDS</option>
<option>AAP</option>
</select><br>
State <select name="state">
<option value=" ">Select</option>
<option >KA</option>
<option>AP</option>
<option>TS</option>
<option>MH</option>
<option>TN</option>
<option>KL</option>
</select> <br>
Tenure <select name="tenure">
<option value="0">Select</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select> <br>
PortFolio<textarea rows="3" cols="15" name="portfilio"></textarea> <br>

<button type="submit" class="btn btn-success">Send</button>	
	</form>

</body>
</html>