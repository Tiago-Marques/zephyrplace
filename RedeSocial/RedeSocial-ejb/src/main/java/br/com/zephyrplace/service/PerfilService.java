package br.com.zephyrplace.service;

import br.com.zephyrplace.hibernate.Perfil;

public interface PerfilService {

	public Perfil consultarPerfil(Perfil perfil) throws Exception;
	
	public Perfil inserirPerfil(Perfil perfil) throws Exception;
}
