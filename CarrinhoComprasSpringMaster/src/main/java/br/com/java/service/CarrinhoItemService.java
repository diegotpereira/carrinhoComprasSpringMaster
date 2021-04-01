package br.com.java.service;

import br.com.java.model.Carrinho;
import br.com.java.model.CarrinhoItem;

public interface CarrinhoItemService {
	
	void adicionarCarrinhoItem(CarrinhoItem carrinhoItem);
	
	void removerCarrinhoItem(CarrinhoItem carrinhoItem);
	
	void removerTodosItemsCarrinho(Carrinho carrinho);
	
	CarrinhoItem getCarrionhoItemByProdutoID(int produtoId);
}
