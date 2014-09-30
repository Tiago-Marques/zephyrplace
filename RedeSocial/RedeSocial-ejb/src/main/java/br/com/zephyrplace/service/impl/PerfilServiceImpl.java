package br.com.zephyrplace.service.impl;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.zephyrplace.dao.PerfilDAO;
import br.com.zephyrplace.hibernate.Perfil;
import br.com.zephyrplace.service.PerfilService;

@Named
@Default
public class PerfilServiceImpl implements PerfilService{

	@Inject
	private PerfilDAO perfilDAO;	

	@Override
	public Perfil consultarPerfil(Perfil perfil) throws Exception {
		return perfilDAO.findOne(perfil.getId());
	}

	@Override
	public Perfil inserirPerfil(Perfil perfil) throws Exception {
		perfilDAO.saveAndFlush(perfil);
		return perfil;
	}

	
}
