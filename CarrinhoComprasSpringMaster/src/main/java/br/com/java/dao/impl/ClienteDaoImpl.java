package br.com.java.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.java.dao.ClienteDao;
import br.com.java.model.Autoridades;
import br.com.java.model.Carrinho;
import br.com.java.model.Cliente;
import br.com.java.model.Usuario;

@Repository
@Transactional
public class ClienteDaoImpl implements ClienteDao{
	
	@Autowired
	private SessionFactory sessionFactory;

//	@Override
	public void adicionarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		cliente.getEnderecoCobranca().setCliente(cliente);
		cliente.getEnderecoEntrega().setCliente(cliente);
		
		session.saveOrUpdate(cliente);
		session.saveOrUpdate(cliente.getEnderecoCobranca());
		session.saveOrUpdate(cliente.getEnderecoEntrega());
		
		Usuario novoUsuario = new Usuario();
		novoUsuario.setUsuarionome(cliente.getUsuarionome());
		novoUsuario.setSenha(cliente.getSenha());
		novoUsuario.setAtivado(true);
		novoUsuario.setClienteId(cliente.getClienteId());
		
		Autoridades novoAutoridades = new Autoridades();
		novoAutoridades.setUsuarionome(cliente.getUsuarionome());
		novoAutoridades.setAuthority("ROLE_USER");
		
		session.saveOrUpdate(novoUsuario);
		session.saveOrUpdate(novoAutoridades);
		
		Carrinho novoCarrinho = new Carrinho();
		novoCarrinho.setCliente(cliente);
		cliente.setCarrinho(novoCarrinho);
		
		session.saveOrUpdate(cliente);
		session.saveOrUpdate(novoCarrinho);
		
		session.flush();
		
	}

//	@Override
	public Cliente getClienteById(int clienteId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Cliente) session.get(Cliente.class, clienteId);
	}

//	@Override
	public List<Cliente> getTodosClientes() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Cliente");
		List<Cliente> clienteLista = query.list();
		return clienteLista;
	}

//	@Override
	public Cliente getClienteByUsername(String usuarionome) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Cliente where usuarionome = ?");
		query.setString(0, usuarionome);
		
		return (Cliente) query.uniqueResult();
	}

}
