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
<title>listsurvey</title>
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
<link rel="stylesheet" href="css/details.css">
</head>
<body
	background="https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2014/07/01/101805152-462861775.jpg?v=1537996617">
	<div class="presentation">
		<h1>Détails : Liste des clients et commentaires négatifs</h1>
		<br>
		<div class="try">
			<div class="try1">
				<c:forEach var="client" items="${positivClients}">
					<table>
						<tr>
							<th>Nom</th>
							<td>${client.lastname}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
			<div class="try2">
				<c:forEach var="client" items="${positivClients}">
					<table>
						<tr>
							<th>Prenom</th>
							<td>${client.firstname}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
			<div class="try3">
				<c:forEach var="opinion" items="${negativOpinions}">
					<table>
						<tr>
							<th>Commentaire</th>
							<td>${opinion.commentary}</td>
						</tr>
					</table>
				</c:forEach>
			</div>
		</div>
		<br> <a class="btn btn-outline-info" href="listsurvey.html">Retour</a>
	</div>
</body>
</html>