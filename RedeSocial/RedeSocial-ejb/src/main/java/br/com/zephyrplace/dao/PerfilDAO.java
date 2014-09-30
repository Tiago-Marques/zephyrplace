package br.com.zephyrplace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zephyrplace.hibernate.Perfil;

public interface PerfilDAO extends JpaRepository<Perfil, Long>{

}
