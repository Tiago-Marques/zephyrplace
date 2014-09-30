package br.com.zephyrplace.facade;

import br.com.zephyrplace.hibernate.Perfil;

public interface PerfilFacade {

	public Perfil consultarPerfil(Perfil perfil) throws Exception;
	
	public Perfil inserirPerfil(Perfil perfil) throws Exception;
	
}
