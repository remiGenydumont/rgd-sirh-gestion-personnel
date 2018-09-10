package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Collaborateur {
	private String matricule;
	private String nom ;
	private String prenom ;
	private LocalDate dateNaissance;
	private String adresse ;
	private String NumeroSecuriteSociale ;
	private String emailPro ;
	private String photo ;
	private ZonedDateTime dateHeureCreation ;
	private Boolean actif;
	
	private String intitulePoste;
	private Departement departement ;
	
	
	
	public Collaborateur(String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numeroSecuriteSociale, String emailPro, String intitulePoste, Departement departement) {
		super();
		this.matricule = UUID.randomUUID().toString();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		NumeroSecuriteSociale = numeroSecuriteSociale;
		this.emailPro = emailPro;
		this.dateHeureCreation = ZonedDateTime.now();
		this.photo = "resources/people.png";
		this.actif = true;
		this.intitulePoste = intitulePoste;
		this.departement = departement;
	}

	public Collaborateur(String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numeroSecuriteSociale, String emailPro) {
		super();
		this.matricule = UUID.randomUUID().toString();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		NumeroSecuriteSociale = numeroSecuriteSociale;
		this.emailPro = emailPro;
		this.dateHeureCreation = ZonedDateTime.now();
		this.photo = "resources/people.png";
		this.actif = true;
	}
	
	public Collaborateur() {
		super();
		this.matricule = UUID.randomUUID().toString();
		this.dateHeureCreation = ZonedDateTime.now();
		this.photo = "resources/people.png";
		this.actif = true;
	}
	
	@Override
	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", NumeroSecuriteSociale=" + NumeroSecuriteSociale
				+ ", emailPro=" + emailPro + ", photo=" + photo + ", dateHeureCreation=" + dateHeureCreation
				+ ", actif=" + actif + "]";
	}

	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumeroSecuriteSociale() {
		return NumeroSecuriteSociale;
	}
	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		NumeroSecuriteSociale = numeroSecuriteSociale;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public String getIntitulePoste() {
		return intitulePoste;
	}

	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}


}
