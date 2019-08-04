<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Intelligence</title>
</head>
<body>
	<h1>Create a Dog</h1>
	<form action="showDogs">
		Name: <input type="text" name="name"><br>
		Breed: <input type="text" name="breed"><br>
		Weight (lb): <input type="number" name="weight"><br>
		<input type="submit" value="Create Dog">
	</form>
	<h1>Create a Cat</h1>
	<form action="showCats">
		Name: <input type="text" name="name"><br>
		Breed: <input type="text" name="breed"><br>
		Weight (lb): <input type="number" name="weight"><br>
		<input type="submit" value="Create Cat">
	</form>
</body>
</html>