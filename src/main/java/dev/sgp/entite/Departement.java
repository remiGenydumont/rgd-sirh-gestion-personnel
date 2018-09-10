package dev.sgp.entite;

public class Departement {
	private Integer id ;
	private String nom ;
	
	private static Integer maxId = 0;
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(String nom) {
		super();
		this.id = maxId ++;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
