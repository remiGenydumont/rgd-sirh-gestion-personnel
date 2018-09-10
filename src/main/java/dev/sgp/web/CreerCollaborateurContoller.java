package dev.sgp.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateurContoller extends HttpServlet  {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateurs.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		Properties properties = new Properties();
		FileInputStream input = new FileInputStream("src/main/resources/application.properties");
		properties.load(input);
		input.close();
		
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		LocalDate dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String adresse = req.getParameter("adresse");
		String numSecuSociale = req.getParameter("numSecuSociale");
		StringBuilder emailPro = new StringBuilder(nom).append(".").append(prenom).append(properties.getProperty("suffix_email_pro"));
		Collaborateur collab = new Collaborateur(nom, prenom, dateNaissance, adresse, numSecuSociale, emailPro.toString());
		
		Constantes.COLLAB_SERVICE.sauvegarderCollaborateur(collab);
		resp.sendRedirect("lister");
		
	}
}
