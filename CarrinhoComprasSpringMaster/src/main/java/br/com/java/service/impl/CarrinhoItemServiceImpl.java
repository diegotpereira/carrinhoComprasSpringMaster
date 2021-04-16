package br.com.java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.dao.CarrinhoItemDao;
import br.com.java.model.Carrinho;
import br.com.java.model.CarrinhoItem;
import br.com.java.service.CarrinhoItemService;

@Service
public class CarrinhoItemServiceImpl implements CarrinhoItemService{
	
	@Autowired
	private CarrinhoItemDao carrinhoItemDao;

//	@Override
	public void adicionarCarrinhoItem(CarrinhoItem carrinhoItem) {
		// TODO Auto-generated method stub
		carrinhoItemDao.adicionarCarrinhoItem(carrinhoItem);
	}

//	@Override
	public void removerCarrinhoItem(CarrinhoItem carrinhoItem) {
		// TODO Auto-generated method stub
		carrinhoItemDao.removerCarrinhoItem(carrinhoItem);
	}

//	@Override
	public void removerTodosItemsCarrinho(Carrinho carrinho) {
		// TODO Auto-generated method stub
		carrinhoItemDao.removerTodosItensCarrinho(carrinho);
	}

//	@Override
	public CarrinhoItem getCarrionhoItemByProdutoID(int produtoId) {
		// TODO Auto-generated method stub
		return carrinhoItemDao.getCarrinhoItemPorProdutoId(produtoId);
	}

}
