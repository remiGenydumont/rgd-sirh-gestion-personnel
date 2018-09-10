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
		<h1 class="title">Les collaborateurs</h1>
		<div class="filterZone col-md-12"></div>
		<div class="row">
		
			<c:forEach var="collab" items="${collaborateurs}">
				<div class="collabContainer thumbnail float-left col-md-5 m-10">
					<div class="nameContainer col-md-12">
						<p>${collab.getNom()} ${collab.getPrenom()}</p>
					</div>
					<img class="col-md-4" alt="phot de profil"
						src="${pageContext.servletContext.contextPath}/${collab.photo}">
					<div class="content col-md-8">
						<p class="">Fonction : ${collab.getIntitulePoste()}</p>
						<p class="">Departement : ${collab.getDepartement().getNom()}</p>
						<p class="">Email : ${collab.getEmailPro()}</p>
						<p class="">Adresse : ${collab.getAdresse()}</p>
					</div>
					<form action="editer" method="get">
						<input name="id_collab" type="hidden" value="${collab.getMatricule()}" />
						<button type="submit">Editer</button>
					</form>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
</body>
</html>
