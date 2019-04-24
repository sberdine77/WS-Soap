package br.ufpe.cin.if998.endpoint;

import javax.xml.ws.Endpoint;

import br.ufpe.cin.if998.Calculadora;

public class CalculadoraPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/MeuWS/Calculadora",
		new Calculadora());
		}
}
