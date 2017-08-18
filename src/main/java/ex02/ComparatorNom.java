package ex02;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Employe> {


	public int compare(Employe arg0, Employe arg1) {
		if (arg0.getNom().compareTo(arg1.getNom()) > 0) {
			return 1;
		} else if (arg0.getNom().compareTo(arg1.getNom()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
