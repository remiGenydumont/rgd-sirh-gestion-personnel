package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

public class DepartementService {
	List<Departement> listeDepartements= new ArrayList<>();

	public DepartementService() {
		super();
		listeDepartements.add(new Departement("Comptabilite"));
		listeDepartements.add(new Departement("Ressources Humaines"));
		listeDepartements.add(new Departement("Informatique"));
		listeDepartements.add(new Departement("Administratif"));
	}
	
	public List<Departement> listerDepartement() {
		return listeDepartements;
	}

	public void sauvegarderDepartement(Departement dep) {
		listeDepartements.add(dep);
	}
	

}
