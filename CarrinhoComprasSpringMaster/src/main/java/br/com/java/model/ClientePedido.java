package br.com.java.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class ClientePedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1546649310334411202L;
	
	@Id
	@GeneratedValue
	private int clientePedidoId;
	
	@OneToOne
	@JoinColumn(name = "carrinhoId")
	private Carrinho carrinho;
	
	@OneToOne
	@JoinColumn(name = "clienteId")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name = "enderecoCobrancaId")
	private EnderecoCobranca enderecoCobranca;
	
	@OneToOne
	@JoinColumn(name = "enderecoEntregaId")
	private EnderecoEntrega enderecoEntrega;

	public int getClientePedidoId() {
		return clientePedidoId;
	}

	public void setClientePedidoId(int clientePedidoId) {
		this.clientePedidoId = clientePedidoId;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EnderecoCobranca getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(EnderecoCobranca enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}

	public EnderecoEntrega getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
}
