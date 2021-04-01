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
	@JoinColumn(name = "idEnderecoService")

}
