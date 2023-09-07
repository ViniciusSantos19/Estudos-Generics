package br.com.estudos.teste.sem.gerenic;

public class Principal {
	public static void main(String[] args) {
		CaixaObjeto caixa = new CaixaObjeto();
		caixa.guardar(2.3);
		Double num = (Double) caixa.abrir();
		System.out.println(num);
		
		CaixaObjeto caixa2 = new CaixaObjeto();
		caixa2.guardar("Olá");
		String palavra = (String) caixa2.abrir();
		System.out.println(palavra);
		
	}
}
