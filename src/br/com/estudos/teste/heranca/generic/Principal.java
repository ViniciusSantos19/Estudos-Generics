package br.com.estudos.teste.heranca.generic;

public class Principal {
	public static void main(String[] args) {
		CaixaInteger caixa = new CaixaInteger();
		caixa.guardar(12);
		Integer num = caixa.abrir();
		System.out.println(num);
		
		CaixaNumero<Double> caixaDouble = new CaixaNumero<>();
		caixaDouble.guardar(12.5);
		Double num2 = caixaDouble.abrir();
		System.out.println(num2);
	}
}
