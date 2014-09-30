package br.com.zephyrplace.service.impl;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.security.auth.spi.Util; 

import br.com.zephyrplace.dao.GrupoDAO;
import br.com.zephyrplace.dao.UsuarioDAO;
import br.com.zephyrplace.hibernate.Grupo;
import br.com.zephyrplace.hibernate.Usuario;
import br.com.zephyrplace.service.UsuarioService;

@Named
@Default
public class UsuarioServiceImpl implements UsuarioService {	

	@Inject
	private UsuarioDAO usuarioDAO;	

	@Inject
	private GrupoDAO grupoDAO;	
	
	public String helloWorld() {
		return "Bem vindo a Aplicativos";
	}

	public Usuario consultarUsuario(Usuario usuario) throws Exception {
		return usuarioDAO.findOne(usuario.getUsuario());
	}

	public Usuario incluirUsuario(Usuario usuario) throws Exception {
		Usuario aux = new Usuario();
		aux.setUsuario(usuario.getUsuario());
		aux.setSenha(Util.createPasswordHash("SHA-256",
		         "BASE64",
		         null, null, usuario.getSenha()));
		usuarioDAO.saveAndFlush(aux);
		Grupo grupo = new Grupo();
		grupo.setGrupo("USUARIO");
		grupo.setUsuario(aux.getUsuario());
		grupoDAO.saveAndFlush(grupo);
		return usuario;
	}
	
	

}
