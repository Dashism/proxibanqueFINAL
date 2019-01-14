<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- Cette balise gère les méta-données de la page, 
	toute les caractéristiques propres à la page. -->
<meta charset="ISO-8859-1">
<title>Boutique</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/admin.css">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/index.css">
<!-- <script src="js/index.js"></script> -->
</head>
<body
	background="https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2014/07/01/101805152-462861775.jpg?v=1537996617">
	<div class="presentation">
		<h1>Administration des sondages</h1>
		<br>
		<c:if test="${ empty survey }">
			<h2>Pas de sondage en cours</h2>
		</c:if>
		<c:if test="${not empty survey }">
			<h2>Le sondage a débuté le ${survey.beginDate} et finit le
				${survey.supposedFinishDate }</h2>
		</c:if>
		<br> <br> <br> <br> <br> <br> <br>
		<br>
		<c:if test="${ empty survey }">
			<a class="btn btn-outline-success" href="createsurvey.html">Créer
				un sondage</a>
			<br>
			<br>
		</c:if>

		<c:if test="${not empty survey }">
			<a class="btn btn-outline-danger"
				href="stopsurvey.html?id=${survey.id}">Arrêter un sondage</a>
			<br>
			<br>
		</c:if>
		<a class="btn btn-outline-primary"
			href="listsurvey.html?id=${survey.id}">Visualiser les retours des
			sondages</a> <br>
	</div>
</body>
</html>