package ex02;

public abstract class Employe {

	private String nom;
	private double salaire;
	private String type;

	public Employe(String nom, double salaire, String type) {
		super();
		this.nom = nom;
		this.salaire = salaire;
		this.type = type;
	}

	@Override
	public String toString() {
		return "[nom=" + nom + ", salaire=" + salaire + "] \n";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
