package br.com.java.service;

import br.com.java.model.ClientePedido;

public interface ClientePedidoService {
	
	void adicionarClientePedido(ClientePedido clientePedido);
	
	double getClientePedidoTotalGeral(int clienteID);
	
}
