package br.com.estudos.teste.com.gerenic;

public class Caixa<T> {
	private T objetos;
	
	
	public void guardar(T coisa) {
		this.objetos = coisa;
	} 
	
	
	public T abrir() {
		return this.objetos;
	}
}
