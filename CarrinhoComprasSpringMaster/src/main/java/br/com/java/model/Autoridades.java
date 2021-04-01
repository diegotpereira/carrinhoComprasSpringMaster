package br.com.java.model;

import javax.persistence.*;

@Entity
public class Autoridades {
	
	@Id
	@GeneratedValue
	private int autoridadesId;
	
	private String usuarionome;
	
	private String authority;

	public int getAutoridadesId() {
		return autoridadesId;
	}

	public void setAutoridadesId(int autoridadesId) {
		this.autoridadesId = autoridadesId;
	}

	public String getUsuarionome() {
		return usuarionome;
	}

	public void setUsuarionome(String usuarionome) {
		this.usuarionome = usuarionome;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
