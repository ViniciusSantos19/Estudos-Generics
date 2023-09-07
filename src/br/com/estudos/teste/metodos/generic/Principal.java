package br.com.estudos.teste.metodos.generic;

import java.util.Arrays;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java","Kotlin","C#","C++");
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		String nome = (String) ListUtil.getUltimo(langs);
		Integer num =(Integer) ListUtil.getUltimo(numeros);
		System.out.println(nome);
		System.out.println(num);
		nome = ListUtil.getUltimo2(langs);
		num = ListUtil.getUltimo2(numeros);
	}
}
