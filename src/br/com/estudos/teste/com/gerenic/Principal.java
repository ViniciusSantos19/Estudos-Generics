package br.com.estudos.teste.com.gerenic;

public class Principal {
	public static void main(String[] args) {
		Caixa<String> caixa = new Caixa();
		caixa.guardar("Vinicius");
		String nome = caixa.abrir();
		System.out.println(nome);
		
		Caixa<Double> caixa2 = new Caixa<>();
		caixa2.guardar(3.14);
		Double pi = caixa2.abrir();
		System.out.println(pi);
		
	}
}
