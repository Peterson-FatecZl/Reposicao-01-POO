package model;

public class IngressoVIP extends Ingresso {

	private String funcaoDesempenhadaPeloComprador;

	// Contrutores
	public IngressoVIP() {
		super();
	}

	// Getters and Setters
	public String getFuncaoDesempenhadaPeloComprador() {
		return funcaoDesempenhadaPeloComprador;
	}

	public void setFuncaoDesempenhadaPeloComprador(String funcaoDesempenhadaPeloComprador) {
		this.funcaoDesempenhadaPeloComprador = funcaoDesempenhadaPeloComprador;
	}

	// Metodos
	@Override
	public float valorFinal(float taxaDeConveniencia) {
		float valorDaTaxaDeConveniencia = getValor() * taxaDeConveniencia;
		float valorAntesDaTaxaVIP = getValor() + valorDaTaxaDeConveniencia;
		float valorFinal = valorAntesDaTaxaVIP + (valorAntesDaTaxaVIP * 0.18f);
		return valorFinal;
	}

	@Override
	public String toString() {
		return "IngressoVIP [funcaoDesempenhadaPeloComprador=" + funcaoDesempenhadaPeloComprador
				+ ", getIdentificador()=" + getIdentificador() + ", getValor()=" + getValor() + "]";
	}

}
