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
@Table(name = "users")
public class Usuario implements Serializable{

	@Id
	@Column(name = "username")
	@Size(min = 4, max = 10, message = "O nome de usuário deve possuir entre 4 e 20 caracteres.")
	private String usuario;
	
	@Column(name = "password")
	@NotNull
	@Size(min = 4, max = 20, message = "A senha deve possuir entre 4 e 20 caracteres.")
	private String senha;	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
