package br.com.estudos.teste.metodos.generic;

import java.util.List;

public class ListUtil {
	public static Object getUltimo (List<?> lista) {
		return lista.get(lista.size() - 1);
	} 
	
	public static <T> T getUltimo2 (List<T> lista) {
		return lista.get(lista.size() - 1);
	} 
	
	public static <A, B, C> C teste (A parametroA, B parametroB){
		C teste = null;
		return teste;
	}
}
