package br.com.estudos.teste.sem.gerenic;

public class CaixaObjeto {
	private Object objetos;
	
	
	public void guardar(Object coisa) {
		this.objetos = coisa;
	} 
	
	
	public Object abrir() {
		return this.objetos;
	}
}
