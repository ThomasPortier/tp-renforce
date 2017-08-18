package ex01;

import java.util.ArrayList;

public class LivreServices {

	public ArrayList<Livre> triLivreParAnnee(ArrayList<Livre> uneLivreList,int anneeMin,int anneeMax) {

		ArrayList<Livre> updatedList = new ArrayList<Livre>();	
		for (Livre unLivre : uneLivreList) {
			if (unLivre.getAnnee()>=anneeMin && unLivre.getAnnee()<=anneeMax) {
				updatedList.add(unLivre);
			}	
		}
		System.out.println(updatedList);
		return updatedList;
	}
	
	public ArrayList<Livre> triLivreParSalle(ArrayList<Livre> uneLivreList,int laClasse1,int laClasse2,int laClasse3) {

		ArrayList<Livre> updatedList = new ArrayList<Livre>();	
		for (Livre unLivre : uneLivreList) {
			if (unLivre.getSalle()==laClasse1 || unLivre.getSalle()==laClasse2 || unLivre.getSalle()==laClasse3) {
				updatedList.add(unLivre);
			}	
		}
		System.out.println(updatedList);
		return updatedList;
	}
	

}
