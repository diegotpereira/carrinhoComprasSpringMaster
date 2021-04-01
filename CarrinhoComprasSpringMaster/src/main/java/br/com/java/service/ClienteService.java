package br.com.java.service;

import java.util.List;

import br.com.java.model.Cliente;

public interface ClienteService {
	
	void adicionarCliente(Cliente cliente);
	
	Cliente getClienteById(int clienteId);
	
	List<Cliente> getTodosClientes();
	
	Cliente getClientePorUsuarioNome(String usuarionome);
}
