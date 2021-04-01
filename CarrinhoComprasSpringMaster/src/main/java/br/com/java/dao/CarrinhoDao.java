package br.com.java.dao;

import java.io.IOException;

import br.com.java.model.Carrinho;

public interface CarrinhoDao {
	
	Carrinho getCarrinhoById(int carrinhoId);
	
	Carrinho valida(int carrinhoId) throws IOException;
	
	void update(Carrinho carrinho);
}
