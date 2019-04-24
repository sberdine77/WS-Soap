package br.ufpe.cin.if998.cliente;

import br.ufpe.cin.if998.CalculadoraService;
import br.ufpe.cin.if998.Calculadora;

public class CalculadoraClient {
	public static void main (String args[]) {
		int v1 = 4;
		int v2 = 2;
		CalculadoraService calcService = new CalculadoraService();
		Calculadora calc = calcService.getCalculadoraPort();
		System.out.println(v1 + " + " + v2 + " = " + calc.adicionar(v1, v2));
		System.out.println(v1 + " - " + v2 + " = " + calc.subtrair(v1, v2));
		System.out.println(v1 + " * " + v2 + " = " + calc.multiplicar(v1, v2));
		System.out.println(v1 + " / " + v2 + " = " + calc.dividir(v1, v2));
	}
}
