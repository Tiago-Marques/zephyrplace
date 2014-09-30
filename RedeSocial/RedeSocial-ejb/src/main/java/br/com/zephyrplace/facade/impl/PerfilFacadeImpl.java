package br.com.zephyrplace.facade.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import br.com.zephyrplace.facade.PerfilFacade;
import br.com.zephyrplace.hibernate.Perfil;

@Default
@Stateless(mappedName = "ejb/perfilFacade")
@Local(PerfilFacade.class)
public class PerfilFacadeImpl {
	
	public String helloWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	public Perfil consultarUsuario(Perfil usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Perfil inserirUsuario(Perfil usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
