package dev.sgp.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		resp.setContentType("text/html");

		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String matricule= req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		Boolean noNull = true ;
		StringBuilder msg = new StringBuilder( "Les paramètres suivants sont incorrects : ");
		if(matricule == null){
			noNull = false ;
			msg.append("matricule, ");
		}if(titre == null){
			noNull = false ;
			msg.append("titre, ");
		}if(nom== null){
			noNull = false ;
			msg.append("nom, ");
		}if(prenom == null){
			noNull = false ;
			msg.append("prenom.");
		}

		if(noNull){
			// code HTML ecrit dans le corps de la reponse
			resp.setStatus(HttpServletResponse.SC_CREATED);
			resp.getWriter().write("<h1>Edition des collaborateurs</h1>"
					+ "<Strong>matricule : "+ matricule+", titre :"+titre+", nom :"+nom+", prenom :"+prenom+ "</Strong>");
		}else{
		
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, msg.toString());
		}

	}

}
