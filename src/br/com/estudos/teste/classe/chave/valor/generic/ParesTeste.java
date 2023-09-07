package br.com.estudos.teste.classe.chave.valor.generic;

import java.util.function.Consumer;
import java.util.function.Function;



public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();

		resultadoConcurso.adicionar(1, "Vinicius");
		resultadoConcurso.adicionar(2, "Jorge");
		resultadoConcurso.adicionar(3, "Maria");
		resultadoConcurso.adicionar(4, "Marco");
		resultadoConcurso.adicionar(5, "Julia");
		String test = resultadoConcurso.getValor(2);
		System.out.println(test);

		Function<Par<Integer, String>, String> transformaString = p -> "Parabéns " 
		+ p.getValor() 
		+ " você foi aprovado";
		resultadoConcurso.getItens().stream().map(transformaString).forEach(System.out::println);
		
		
	}

}
