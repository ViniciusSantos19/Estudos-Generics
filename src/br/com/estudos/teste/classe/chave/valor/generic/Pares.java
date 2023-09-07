package br.com.estudos.teste.classe.chave.valor.generic;



import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


import br.com.estudos.teste.exceptions.teste.VazioException;

public class Pares <C extends Number, V>{
	
	private final Set<Par<C , V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) throws VazioException{
		
		if(chave == null || valor == null) {
			throw new VazioException();
		}
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		this.itens.add(novoPar);
	}
	
	public V getValor (C chave) throws VazioException{
		
		if(chave == null) {
			throw new VazioException();
		}
		
		Optional<Par<C, V>> parOpicional =  itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		//return parOpicional.isPresent() ? parOpicional.get().getValor() : null;
		return parOpicional.get().getValor();
	}

	public Set<Par<C, V>> getItens() {
		return itens;
	}
	
	
	
}
