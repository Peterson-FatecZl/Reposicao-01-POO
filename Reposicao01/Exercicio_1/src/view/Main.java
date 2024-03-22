package view;

import model.Ingresso;
import model.IngressoVIP;

public class Main {

	public static void main(String[] args) {
		Ingresso ticket = new Ingresso();
		IngressoVIP ticketVIP = new IngressoVIP();

		ticket.setIdentificador("#9877");
		ticket.setValor(100.00f);

		System.out.println(ticket.toString());
		System.out.println("Valor Final: " + ticket.valorFinal(0.1f));

		ticketVIP.setIdentificador("$7878");
		ticketVIP.setFuncaoDesempenhadaPeloComprador("Celebridade");
		ticketVIP.setValor(200.00f);

		System.out.println(ticketVIP.toString());
		System.out.println("Valor Final: " + ticketVIP.valorFinal(0.1f));

	}

}
