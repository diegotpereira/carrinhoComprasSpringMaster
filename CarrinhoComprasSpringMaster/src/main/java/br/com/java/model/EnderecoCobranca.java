package br.com.java.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EnderecoCobranca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6091579459463730482L;
	
	@Id
	@GeneratedValue
	private int enderecoCobrancaId;
	
	private String ruaNome;
	private String casaNumero;
	private String cidade;
	private String estado;
	private String pais;
	private String cep;
	
	@OneToOne
	private Cliente cliente;

	public int getEnderecoCobrancaId() {
		return enderecoCobrancaId;
	}

	public void setEnderecoCobrancaId(int enderecoCobrancaId) {
		this.enderecoCobrancaId = enderecoCobrancaId;
	}

	public String getRuaNome() {
		return ruaNome;
	}

	public void setRuaNome(String ruaNome) {
		this.ruaNome = ruaNome;
	}

	public String getCasaNumero() {
		return casaNumero;
	}

	public void setCasaNumero(String casaNumero) {
		this.casaNumero = casaNumero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "EnderecoCobranca [enderecoCobrancaId=" + enderecoCobrancaId + ", ruaNome=" + ruaNome + ", casaNumero="
				+ casaNumero + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", cep=" + cep
				+ ", cliente=" + cliente + "]";
	}
}
