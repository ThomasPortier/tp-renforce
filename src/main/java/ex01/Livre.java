package ex01;

public class Livre {

	private int annee;
	private String auteur;
	private String nom;
	private int salle;
	//
	public Livre(int annee, String auteur, String nom, int salle) {
		super();
		this.annee = annee;
		this.auteur = auteur;
		this.nom = nom;
		this.salle = salle;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSalle() {
		return salle;
	}

	public void setSalle(int salle) {
		this.salle = salle;
	}

	@Override
	public String toString() {
		return "[annee=" + annee + ", auteur=" + auteur + ", nom=" + nom + ", salle=" + salle + "]\n";
	}
	
	
}
