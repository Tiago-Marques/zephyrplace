package br.com.zephyrplace.service;


import br.com.zephyrplace.hibernate.Usuario;

public interface UsuarioService {

	public String helloWorld();
	
	public Usuario consultarUsuario(Usuario usuario) throws Exception;

	public Usuario incluirUsuario(Usuario usuario) throws Exception ;
}
