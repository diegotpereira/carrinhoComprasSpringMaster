package br.com.java.dao;

import br.com.java.model.Carrinho;
import br.com.java.model.CarrinhoItem;

public interface CarrinhoItemDao {
	
	void adicionarCarrinhoItem(CarrinhoItem carrinhoItem);
	
	void removerCarrinhoItem(CarrinhoItem carrinhoItem);
	
	void removerTodosItensCarrinho(Carrinho carrinho);
	
	CarrinhoItem getCarrinhoItemPorProdutoId(int produtoId);
}
