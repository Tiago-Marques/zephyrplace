package br.com.zephyrplace.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
public class Grupo implements Serializable{

	@Id
	@Column(name = "username")
	private String usuario;
	
	@Column(name = "rolename")
	@NotNull
	@Size(min = 5, max = 10, message = "Minimo 5, maximo 10")
	private String grupo;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}	

	
	
}
