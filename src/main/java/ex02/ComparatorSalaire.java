package ex02;

import java.util.Comparator;

public class ComparatorSalaire implements Comparator<Employe> {

	public int compare(Employe arg0, Employe arg1) {
		if (arg0.getSalaire() < arg1.getSalaire()) {
			return 1;
		} else if (arg0.getSalaire() > arg1.getSalaire()) {
			return -1;
		} else {
			return 0;
		}
	}
}

