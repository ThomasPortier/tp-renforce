package ex02;

import java.util.ArrayList;

import ex01.Livre;

public class EmployeService {

	public Double meanDevBack(ArrayList<Employe> employeList) {
		Double mean = 0.;
		Integer count = 0;
		for (Employe unEmploye : employeList) {
			if(unEmploye.getType().equals("BACK")){
				mean += unEmploye.getSalaire();
				count += 1;
			}
		}
		mean = mean/count;
		return mean;
	}
	
	public Double meanDevFront(ArrayList<Employe> employeList) {
		Double mean = 0.;
		Integer count = 0;
		for (Employe unEmploye : employeList) {
			if(unEmploye.getType().equals("FRONT")){
				mean += unEmploye.getSalaire();
				count += 1;
			}
		}
		mean = mean/count;
		return mean;
	}
	
	public Double meanDev(ArrayList<Employe> employeList) {
		Double mean = 0.;
		for (Employe unEmploye : employeList) {
				mean += unEmploye.getSalaire();
			
		}
		mean = mean/employeList.size();
		return mean;
	}
}
