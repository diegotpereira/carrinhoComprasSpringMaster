package br.com.java.dao;

import java.util.List;

import br.com.java.model.Cliente;

public interface ClienteDao {
	
	void adicionarCliente(Cliente cliente);
	
	Cliente getClienteById(int clienteId);
	
	List<Cliente> getTodosClientes();
	
	Cliente getClientePorUsuarioNome (String usuarionome);
}
