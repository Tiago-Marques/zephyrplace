package br.com.zephyrplace.facade.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import br.com.zephyrplace.facade.UsuarioFacade;
import br.com.zephyrplace.hibernate.Usuario;
import br.com.zephyrplace.service.UsuarioService;

@Default
@Stateless(mappedName = "ejb/usuarioFacade")
@Local(UsuarioFacade.class)
public class UsuarioFacadeImpl {

	@Inject
	private UsuarioService usuarioService;
	
	public String helloWorld() {
		return usuarioService.helloWorld();
	}

	public Usuario consultarUsuario(Usuario usuario) throws Exception {
		return usuarioService.consultarUsuario(usuario);
	}
	
	public Usuario inserirUsuario(Usuario usuario) throws Exception {
		return usuarioService.incluirUsuario(usuario);
	}
}
