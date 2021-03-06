<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- Cette balise g�re les m�ta-donn�es de la page, 
	toute les caract�ristiques propres � la page. -->
<meta charset="ISO-8859-1">
<title>R�sum�</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
	
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
<link rel="stylesheet" href="css/listsurvey.css">
</head>
<body
	background="https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2014/07/01/101805152-462861775.jpg?v=1537996617">
	<div class="presentation">
		<h1>Liste des Sondages :</h1>
		<br>
		<div class="try">
			<div class="try1">
				<c:forEach var="survey" items="${surveys}">
					<table>
						<tr>
							<th>Numero du sondage</th>
							<td>${survey.id}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
			<div class="try2">
				<c:forEach var="survey" items="${surveys}">
					<table>
						<tr>
							<th>Date de d�but</th>
							<td>${survey.beginDate}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
			<div class="try3">
				<c:forEach var="survey" items="${surveys}">
					<table>
						<tr>
							<th>Date de fin pr�visionnelle</th>
							<td>${survey.supposedFinishDate}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
			<div class="try4">
				<c:forEach var="Bleu" items="${pouceBleu}">
					<table>
						<tr>
							<th>Nombre d'avis positif</th>
							<td>${Bleu}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
			<div class="try5">
				<c:forEach var="Rouge" items="${pouceRouge}">
					<table>
						<tr>
							<th>Nombre d'avis negatif</th>
							<td>${Rouge}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
			<div class="try6">
				<c:forEach var="survey" items="${surveys}">
					<table>
						<tr>
							<td><a href="details.html?id=${survey.id}">D�tails</a></td>
						</tr>
					</table>
				</c:forEach>
			</div>
		</div>
		<br> <a class="btn btn-outline-info" href="index.html">Retour</a>
	</div>
</body>
</html>