
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
<title>createsurvey</title>
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
<link rel="stylesheet" href="css/createsurvey.css">
</head>
<body background="https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2014/07/01/101805152-462861775.jpg?v=1537996617">
	<div class="presentation">
		<h1>Créer un sondage</h1>
		<div class="presentation2">
			<!-- Utilisation d'un tag Spring pour lier le formulaire à un objet Java de la classe Article. -->
			<form:form modelAttribute="survey" method="post" action="listsurvey.html"
				onsubmit="validateForm(event)">
				<div class="form-group">
					<label for="beginDate">Date de début :</label>
					<!-- Utilisation d'un tag Spring pour lier un champ de saisie avec un 
				attribut de l'objet (classe Article) défini dans le modelAttribute du form:form. -->
					<form:input id="beginDate" path="beginDate" class="form-control" />
				</div>
				<div class="form-group">
					<label for="supposedFinishDate">Date de fin prévisionnelle
						:</label>
					<!-- Utilisation d'un tag Spring pour lier un champ de saisie avec un 
				attribut de l'objet (classe Article) défini dans le modelAttribute du form:form. -->
					<form:input id="supposedFinishDate" path="supposedFinishDate"
						class="form-control" />
				</div>
				<a class="btn btn-outline-success"
					href="validatesurvey.html?id=${survey.id}">Valider le nouveau
					sondage</a> <a class="btn btn-outline-info" href="index.html">Retour</a>
			</form:form>
		</div>
	</div>
</body>
</html>