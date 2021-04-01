package br.com.java.dao.impl;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.java.dao.CarrinhoDao;
import br.com.java.model.Carrinho;
import br.com.java.service.ClientePedidoService;

@Repository
@Transactional
public class CarrinhoDaoImpl implements CarrinhoDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private ClientePedidoService clientePedidoService;

	@Override
	public Carrinho getCarrinhoById(int carrinhoId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Carrinho) session.get(Carrinho.class, carrinhoId);
	}

	@Override
	public Carrinho valida(int carrinhoId) throws IOException {
		// TODO Auto-generated method stub
		Carrinho carrinho =  getCarrinhoById(carrinhoId);
		
		if (carrinho == null || carrinho.getCarrinhoItens().size() == 0) {
			throw new IOException(carrinhoId + "");
		}
		update(carrinho);
		return carrinho;
	}

	@Override
	public void update(Carrinho carrinho) {
		// TODO Auto-generated method stub
		int carrinhoId = carrinho.getCarrinhoId();
		double totalGeral = clientePedidoService.getClientePedidoTotalGeral(carrinhoId);
		carrinho.setTotalGeral(totalGeral);
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(carrinho);
	}

}
