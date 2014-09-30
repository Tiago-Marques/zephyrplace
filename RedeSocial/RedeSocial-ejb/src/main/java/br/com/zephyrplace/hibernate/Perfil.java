package br.com.zephyrplace.hibernate;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "perfil")
public class Perfil implements Serializable {

	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "usuario")
	@NotNull
	@Size(min = 4, max = 10, message = "O nome de usuário deve possuir entre 4 e 10 caracteres.")
	private String usuario;

	@Column(name = "nome")
	@NotNull
	@Size(min = 4, max = 20, message = "O seu nome deve possuir entre 4 e 20 caracteres.")
	private String nome;
	
	@Column(name = "sobrenome")
	@NotNull
	@Size(min = 4, max = 20, message = "O seu sobrenome deve possuir entre 4 e 20 caracteres.")
	private String sobrenome;	
	
	@Column(name = "ddd")
	@Size(min = 2, max = 2, message = "DDD invalido.")
	private int ddd;	
	
	@Column(name = "telefone")
	@Size(min = 8, max = 9, message = "Telefone invalido.")
	private int telefone;	
	
	@Column(name = "email")
	@NotNull
	@Size(min = 8, max = 9, message = "Email invalido.")
	private String email;
	
	@Column(name = "sexo")
	@NotNull
	private boolean sexo;
	
	@Column(name = "data_nascimento")
	@NotNull
	@Size(min = 8, max = 9, message = "Data de nascimento invalida.")
	private Date dataDeNascimento;
	
	@Column(name = "foto")
	private Byte foto;

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSenha(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Byte getFoto() {
		return foto;
	}

	public void setFoto(Byte foto) {
		this.foto = foto;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
