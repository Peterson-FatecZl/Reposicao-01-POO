package model;

public class ProfessorTitular extends Professor {

	private int anosInstituicao;
	private double salario;

	// Contrutores
	public ProfessorTitular() {
		super();
	}

	// Getters e Setters
	public int getAnosInstituicao() {
		return anosInstituicao;
	}

	public void setAnosInstituicao(int anosInstituicao) {
		this.anosInstituicao = anosInstituicao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Metodos
	@Override
	public double calcSalario() {
		int incrementoDeSalarioACada5Anos = anosInstituicao / 5;
		double porcentagemDeIncrementoDeSalario = incrementoDeSalarioACada5Anos * 0.05;
		salario += salario * porcentagemDeIncrementoDeSalario;
		return salario;
	}

}
