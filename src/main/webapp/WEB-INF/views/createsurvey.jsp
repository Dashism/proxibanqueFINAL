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
<title>Cr�ation d'un sondage</title>
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
<link rel="stylesheet" href="css/createsurvey.css">
</head>
<c:url var="background" value="/Image/background.jpg"/>
<body
	background="${background}">
	<div class="presentation">
		<h1>Cr�er un sondage</h1>
		<div class="presentation2">
			<form:form modelAttribute="survey" method="post"
				action="createsurvey.html" onsubmit="validateForm(event)">
				<div class="form-group">
					<label for="beginDate">Date de d�but (yyyy-mm-dd) :</label>
					<!-- Utilisation d'un tag Spring pour lier un champ de saisie avec un 
				attribut de l'objet (classe Article) d�fini dans le modelAttribute du form:form. -->
					<form:input id="beginDate" path="beginDate" class="form-control" />
				</div>
				<div class="form-group">
					<label for="supposedFinishDate">Date de fin pr�visionnelle (yyyy-mm-dd) :</label>
					<!-- Utilisation d'un tag Spring pour lier un champ de saisie avec un 
				attribut de l'objet (classe Article) d�fini dans le modelAttribute du form:form. -->
					<form:input id="supposedFinishDate" path="supposedFinishDate"
						class="form-control"></form:input>
				</div>
				<button class="btn btn-outline-success">Valider le nouveau sondage</button>
				<a class="btn btn-outline-info" href="index.html">Retour</a>
			</form:form>
		</div>
		<h2> ${message}</h2>
	</div>
</body>
</html>