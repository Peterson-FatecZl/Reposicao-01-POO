package model;

public class ProfessorHorista extends Professor{

	private int horasAula;
	private double valorHoraAula;
	
	//Construtores
	public ProfessorHorista() {
		super();
	}

	//Getters e Setters
	public int getHorasAula() {
		return horasAula;
	}
	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}
	public double getValorHoraAula() {
		return valorHoraAula;
	}
	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	
	//Metodos
	@Override
	public double calcSalario() {
		double salario = horasAula * valorHoraAula;
		return salario;
	}
	
	
	
}
