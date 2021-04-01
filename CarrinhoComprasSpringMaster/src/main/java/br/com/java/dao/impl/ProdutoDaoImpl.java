package br.com.java.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.java.dao.ProdutoDao;
import br.com.java.model.Produto;

@Repository
@Transactional
public class ProdutoDaoImpl implements ProdutoDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Produto> getProdutoLista() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Produto");
		List<Produto> produtoLista = query.list();
		session.flush();
		
		return produtoLista;
	}

	@Override
	public Produto getProdutoById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Produto produto = (Produto) session.get(Produto.class, id);
		session.flush();
		return produto;
	}

	@Override
	public void adicionarProduto(Produto produto) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(produto);
		session.flush();
	}

	@Override
	public void editarPruduto(Produto produto) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(produto);
		session.flush();
	}

	@Override
	public void deletarProduto(Produto produto) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(produto);
		session.flush();
	}

}
