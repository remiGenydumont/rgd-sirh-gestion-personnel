package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.util.Constantes;

public class EditerCollaborateurController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		List<Collaborateur> collaborateurs = Constantes.COLLAB_SERVICE.listerCollaborateurs();
		String id_collab = req.getParameter("id_collab");
		Collaborateur collab = null ;
		for (Collaborateur c : collaborateurs) {
			if(c.getMatricule().equals(id_collab)){
				collab = c;
			}
		}
		req.setAttribute("collaborateur", collab);
		
		req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateurs.jsp")
		.forward(req, resp);
	}

}
