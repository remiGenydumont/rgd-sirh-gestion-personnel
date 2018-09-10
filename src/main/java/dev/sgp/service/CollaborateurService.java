package dev.sgp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.util.Constantes;

public class CollaborateurService {
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();


	public CollaborateurService() {
		super();
		List<Departement> listDep = Constantes.DEPARTEMENT_SERVICE.listerDepartement();
		
		listeCollaborateurs.add(new Collaborateur("Geny-Dumont", "Rémi",LocalDate.of(1990, 5, 15), "somewhere", "5165151561", "remi.genydumont@societe.com", "Dev", listDep.get(2)));
		listeCollaborateurs.add(new Collaborateur("Correoso", "Antony",LocalDate.of(2000, 1, 1), "somewhereLozanne", "7586963543456", "antony.correoso@societe.com", "Chef de projet", listDep.get(2)));
	}

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}
