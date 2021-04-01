package br.com.java.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.java.dao.ClientePedidoDao;
import br.com.java.model.ClientePedido;

@Repository
@Transactional
public class ClientePedidoDaoImpl implements ClientePedidoDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void adicionarClientePedido(ClientePedido clientePedido) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(clientePedido);
		session.flush();
		
	}

}
