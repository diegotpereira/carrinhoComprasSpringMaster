package br.com.java.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Carrinho implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3940548625296145582L;
	
	@Id
	@GeneratedValue
	private int carrinhoId;
	
	@OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CarrinhoItem> carrinhoItens;
	
	@OneToOne
	@JoinColumn(name="clienteId")
	@JsonIgnore
	private Cliente cliente;
	
	private double totalGeral;

	public int getCarrinhoId() {
		return carrinhoId;
	}

	public void setCarrinhoId(int carrinhoId) {
		this.carrinhoId = carrinhoId;
	}

	public List<CarrinhoItem> getCarrinhoItens() {
		return carrinhoItens;
	}

	public void setCarrinhoItens(List<CarrinhoItem> carrinhoItens) {
		this.carrinhoItens = carrinhoItens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(double totalGeral) {
		this.totalGeral = totalGeral;
	}
}
