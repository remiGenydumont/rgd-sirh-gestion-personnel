package dev.sgp.web;

import java.io.Console;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;

public class CreerCollaborateurContoller extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		
		Properties properties = new Properties();
		FileInputStream input = new FileInputStream("src/main/resources/application.properties");
		properties.load(input);
		input.close();
		
		String suffix = properties.getProperty("suffix_email_pro");
		
		System.out.println(suffix);

		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateurs.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateNaissance = req.getParameter("dateNaissance");
		String adresse = req.getParameter("adresse");
		String numSecuSociale = req.getParameter("numSecuSociale");
		
		
	}
}
