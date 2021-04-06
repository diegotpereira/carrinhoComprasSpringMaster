package br.com.java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.dao.CarrinhoDao;
import br.com.java.model.Carrinho;
import br.com.java.service.CarrinhoService;

@Service
public class CarrinhoServiceImpl implements CarrinhoService{
	
	@Autowired
	private CarrinhoDao carrinhoDao;

//	@Override
	public Carrinho getCarrinhoById(int carrinhoId) {
		// TODO Auto-generated method stub
		return carrinhoDao.getCarrinhoById(carrinhoId);
	}

//	@Override
	public void update(Carrinho carrinho) {
		// TODO Auto-generated method stub
		carrinhoDao.update(carrinho);
	}

}
