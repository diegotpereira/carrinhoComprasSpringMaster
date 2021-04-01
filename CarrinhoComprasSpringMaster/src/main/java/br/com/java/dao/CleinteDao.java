package br.com.java.dao;

import java.util.List;

import br.com.java.model.Cliente;

public interface CleinteDao {
	
	void adicionarCliente(Cliente cliente);
	
	Cliente getClienteById(int clienteId);
	
	List<Cliente> getTodosClientes();
	
	Cliente getClienteByUsername (String usuarionome);
}
