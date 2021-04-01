package br.com.java.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5140900014886997914L;
	
	@Id
	@GeneratedValue
	private int clienteId;
	
	@NotEmpty(message = "O nome de cliente não pode ser nulo!.")
	private String clienteNome;
	
	private String clienteEmail;
	
	private String clienteTelefone;
	
	@NotEmpty(message = "O nome de usário não pode ser nulo!.")
	private String usuarionome;
	
	@NotEmpty(message = "A senha do cliente não pode ser nula!.")
	private String senha;
	
	private boolean ativado;
	
	@OneToOne
	@JoinColumn(name="enderecoCobrancaId")
	private EnderecoCobranca enderecoCobranca;
	
	@OneToOne
	@JoinColumn(name = "enderecoEnderecoId")
	private EnderecoEntrega enderecoEntrega;
	
	@OneToOne
	@JoinColumn(name = "carrinhoId")
	@JsonIgnore
	private Carrinho carrinho;

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteEmail() {
		return clienteEmail;
	}

	public void setClienteEmail(String clienteEmail) {
		this.clienteEmail = clienteEmail;
	}

	public String getClienteTelefone() {
		return clienteTelefone;
	}

	public void setClienteTelefone(String clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}

	public String getUsuarionome() {
		return usuarionome;
	}

	public void setUsuarionome(String usuarionome) {
		this.usuarionome = usuarionome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivado() {
		return ativado;
	}

	public void setAtivado(boolean ativado) {
		this.ativado = ativado;
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

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
}
