package model;

public class Ingresso {

	private String identificador;
	private float valor;

	// Construtores
	public Ingresso() {
		super();
	}

	// Getters and Setters
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	// Metodos
	public float valorFinal(float taxaDeConveniencia) {
		float valorDaTaxaDeConveniencia = valor * taxaDeConveniencia;
		valor += valor + valorDaTaxaDeConveniencia;
		return valor;
	}

	@Override
	public String toString() {
		return "Ingresso [identificador=" + identificador + ", valor=" + valor + "]";
	}

}
