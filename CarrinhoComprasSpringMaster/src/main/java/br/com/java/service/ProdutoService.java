package br.com.java.service;

import java.util.List;

import br.com.java.model.Produto;

public interface ProdutoService {
	
	List<Produto>getProdutoLista();
	
	Produto getProdutoById(int id);
	
	void adicionarProduto(Produto produto);
	
	void editarProduto(Produto produto);
	
	void deletarProduto(Produto produto);
}
