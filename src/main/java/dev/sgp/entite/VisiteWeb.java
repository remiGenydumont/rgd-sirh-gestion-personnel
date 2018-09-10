package dev.sgp.entite;

public class VisiteWeb {
	private Integer id ;
	private String chemin ;
	private Integer tempsExecution;
	private static Integer maxId = 0 ;
	
	public VisiteWeb() {
		super();
		this.id = maxId ++;
	}
	
	
	public VisiteWeb(String chemin, Integer tempsExecution) {
		super();
		this.id = maxId ++;
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}


	@Override
	public String toString() {
		return "VisiteWeb [id=" + id + ", chemin=" + chemin + ", tempsExecution=" + tempsExecution + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public Integer getTempsExecution() {
		return tempsExecution;
	}
	public void setTempsExecution(Integer tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
	
	
}
