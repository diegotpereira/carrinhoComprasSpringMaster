package br.com.java.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.java.dao.CarrinhoItemDao;
import br.com.java.model.Carrinho;
import br.com.java.model.CarrinhoItem;

@Repository
@Transactional
public class CarrinhoItemDaoImpl implements CarrinhoItemDao{
	
	@Autowired
	private SessionFactory sessionFactory;

//	@Override
	public void adicionarCarrionhoItem(CarrinhoItem carrinhoItem) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(sessionFactory);
		session.flush();
	}

//	@Override
	public void removerCarrinhoItem(CarrinhoItem carrinhoItem) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(carrinhoItem);
		session.flush();
	}

//	@Override
	public void removerTodosItensCarrinho(Carrinho carrinho) {
		// TODO Auto-generated method stub
		List<CarrinhoItem> carrinhoItens = carrinho.getCarrinhoItens();
		
		for(CarrinhoItem item : carrinhoItens) {
			removerCarrinhoItem(item);
		}
	}

//	@Override
	public CarrinhoItem getCarrinhoItemPorProdutoId(int produtoId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Carrinhoitem where produtoId = ?");
		query.setInteger(0, produtoId);
		
		return (CarrinhoItem) query.uniqueResult();
	}

}
