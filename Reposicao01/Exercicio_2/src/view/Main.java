package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class Main {

	public static void main(String[] args) {
		ProfessorTitular professorTitular = new ProfessorTitular();
		ProfessorHorista professorHorista = new ProfessorHorista();

		professorTitular.setAnosInstituicao(15);
		professorTitular.setSalario(20000.00d);;
		System.out.println(professorTitular.calcSalario());
		
		professorHorista.setValorHoraAula(250);
		professorHorista.setHorasAula(50);
		
		System.out.println(professorHorista.calcSalario());
		
	}

}
