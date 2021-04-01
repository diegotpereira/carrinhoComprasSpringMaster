package br.com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.dao.ProdutoDao;
import br.com.java.model.Produto;
import br.com.java.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoDao produtoDao;

	@Override
	public List<Produto> getProdutoLista() {
		// TODO Auto-generated method stub
		return produtoDao.getProdutoLista();
	}

	@Override
	public Produto getProdutoById(int produtoId) {
		// TODO Auto-generated method stub
		return produtoDao.getProdutoById(produtoId);
	}

	@Override
	public void adicionarProduto(Produto produto) {
		// TODO Auto-generated method stub
		produtoDao.adicionarProduto(produto);
	}

	@Override
	public void editarProduto(Produto produto) {
		// TODO Auto-generated method stub
		produtoDao.editarProduto(produto);
	}

	@Override
	public void deletarProduto(Produto produto) {
		// TODO Auto-generated method stub
		produtoDao.deletarProduto(produto);
	}

}
