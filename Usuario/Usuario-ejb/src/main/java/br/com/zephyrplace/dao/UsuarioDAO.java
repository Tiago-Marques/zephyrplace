package br.com.zephyrplace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zephyrplace.hibernate.Usuario;


public interface UsuarioDAO extends JpaRepository<Usuario, String> {

			
	
}
