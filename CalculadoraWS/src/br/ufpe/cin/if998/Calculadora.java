package br.ufpe.cin.if998;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class Calculadora {
	public int adicionar(int a, int b) {
		return (a + b);
	}
	public int subtrair(int a, int b) {
		return (a - b);
	}
	public int dividir(int a, int b) {
		return (a / b);
	}
	public int multiplicar(int a, int b) {
		return (a * b);
	}
}