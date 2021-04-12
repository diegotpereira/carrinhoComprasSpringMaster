package br.com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.dao.ClienteDao;
import br.com.java.model.Cliente;
import br.com.java.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDao clienteDao;

//	@Override
	public void adicionarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDao.adicionarCliente(cliente);
	}

//	@Override
	public Cliente getClienteById(int clienteId) {
		// TODO Auto-generated method stub
		return clienteDao.getClienteById(clienteId);
	}

//	@Override
	public List<Cliente> getTodosClientes() {
		// TODO Auto-generated method stub
		return clienteDao.getTodosClientes();
	}

//	@Override
	public Cliente getClientePorUsuarioNome(String usuarionome) {
		// TODO Auto-generated method stub
		return clienteDao.getClientePorUsuarioNome(usuarionome);
	}

}
