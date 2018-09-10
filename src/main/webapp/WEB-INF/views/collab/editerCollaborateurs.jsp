<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h1>Editer Collaborateur</h1>
		<div class="panel panel-default">
		<c:set var="collab"  value="${collaborateur}"/>
			<form class="form-horizontal panel-body " action="creer"
				name="creerCollaborateur" method="post">
				<div class="form-group">
					<label class=" control-label for="nom">Nom :</label> <input
						class="form-control" type="string" name="nom" id="nom" value="${collab.getNom()}"  readonly/>
				</div>
				<div class="form-group">
					<label class=" control-label for="prenom">Prénom :</label> <input
						class="form-control" type="string" name="prenom" id="prenom" value="${collab.getPrenom()}" readonly/>
				</div>
				<div class="form-group">
					<label class=" control-label for="dateNaissance">Date de
						Naissance :</label> <input class="form-control" type="Date"
						name="dateNaissance" id="dateNaissance"  value="${collab.getDateNaissance()}" readonly/>
				</div>
				<div class="form-group">
					<label class=" control-label for="adresse">Adresse :</label> <input
						class="form-control" type="string" name="adresse" id="adresse"value="${collab.getAdresse()}" />
				</div>
				<div class="form-group">
					<label class=" control-label for="numSecuSociale">Numéro de
						sécurité sociale :</label> <input class="form-control" type="string"
						name="numSecuSociale" id="numSecuSociale" value="${collab.getNumeroSecuriteSociale()}" readonly/>
				</div>
				<div class="btn-group">
					<button type="submit" class="btn btn-default">Modifier</button>
				</div>
			</form>
		</div>
	</div>
	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
</body>
</html>
