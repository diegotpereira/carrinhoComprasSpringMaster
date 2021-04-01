package br.com.java.service;

import br.com.java.model.Carrinho;

public interface CarrinhoService {
	
	Carrinho getCarrinhoById(int carrinhoId);
	
	void update(Carrinho carrinho);
}
