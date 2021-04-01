package br.com.java.dao;

import java.util.List;

import br.com.java.model.Produto;

public interface ProdutoDao {
	
	List<Produto> getProdutoLista();
	
	Produto getProdutoById(int id);
	
	void adicionarProduto(Produto produto);
	
	void editarPrudto
}
