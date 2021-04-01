package br.com.java.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3532377236419382983L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int produtoId;
	
	@NotEmpty(message = "o nome de produto não pode estar vazio!.")
	private String produtoNome;
	
	private String produtoCategoria;
	
	private String produtoDescricao;
	
	@Min(value = 0, message = "o preço do produto não pode ser zero!.")
	private double produtoPreco;
	
	private String produtoCondicao;
	
	private String produtoStatus;
	
	@Min(value = 0, message = "A unidade do produto não deve ser menor que zero")
	private int unidadeEmEstoque;
	
	private String produtoFabricante;
	
	@Transient
	private MultipartFile produtoImagem;
	
	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<CarrinhoItem> carrinhoItensLista;

	public int getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public String getProdutoCategoria() {
		return produtoCategoria;
	}

	public void setProdutoCategoria(String produtoCategoria) {
		this.produtoCategoria = produtoCategoria;
	}

	public String getProdutoDescricao() {
		return produtoDescricao;
	}

	public void setProdutoDescricao(String produtoDescricao) {
		this.produtoDescricao = produtoDescricao;
	}

	public double getProdutoPreco() {
		return produtoPreco;
	}

	public void setProdutoPreco(double produtoPreco) {
		this.produtoPreco = produtoPreco;
	}

	public String getProdutoCondicao() {
		return produtoCondicao;
	}

	public void setProdutoCondicao(String produtoCondicao) {
		this.produtoCondicao = produtoCondicao;
	}

	public String getProdutoStatus() {
		return produtoStatus;
	}

	public void setProdutoStatus(String produtoStatus) {
		this.produtoStatus = produtoStatus;
	}

	public int getUnidadeEmEstoque() {
		return unidadeEmEstoque;
	}

	public void setUnidadeEmEstoque(int unidadeEmEstoque) {
		this.unidadeEmEstoque = unidadeEmEstoque;
	}

	public String getProdutoFabricante() {
		return produtoFabricante;
	}

	public void setProdutoFabricante(String produtoFabricante) {
		this.produtoFabricante = produtoFabricante;
	}

	public MultipartFile getProdutoImagem() {
		return produtoImagem;
	}

	public void setProdutoImagem(MultipartFile produtoImagem) {
		this.produtoImagem = produtoImagem;
	}

	public List<CarrinhoItem> getCarrinhoItensLista() {
		return carrinhoItensLista;
	}

	public void setCarrinhoItensLista(List<CarrinhoItem> carrinhoItensLista) {
		this.carrinhoItensLista = carrinhoItensLista;
	}
}
