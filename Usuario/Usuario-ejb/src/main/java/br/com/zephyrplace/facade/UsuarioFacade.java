package br.com.zephyrplace.facade;

import br.com.zephyrplace.hibernate.Usuario;

public interface UsuarioFacade {

	public String helloWorld();

	public Usuario consultarUsuario(Usuario usuario) throws Exception;
	
	public Usuario inserirUsuario(Usuario usuario) throws Exception;
	
}
