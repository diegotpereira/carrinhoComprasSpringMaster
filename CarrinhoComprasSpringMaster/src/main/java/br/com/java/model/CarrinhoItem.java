package br.com.java.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CarrinhoItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -904360230041854157L;
	
	@Id
	@GeneratedValue
	private int carrinhoItemId;
	
	@ManyToOne
	@JoinColumn(name =  "carrinhoId")
	@JsonIgnore
	private Carrinho carrinho;
	
	@ManyToOne
	@JoinColumn(name = "produtoId")
	private Produto produto;
	
	private int quantidade;
	
	private double precoTotal;

	public int getCarrinhoItemId() {
		return carrinhoItemId;
	}

	public void setCarrinhoItemId(int carrinhoItemId) {
		this.carrinhoItemId = carrinhoItemId;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
}
