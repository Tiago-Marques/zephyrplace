package br.com.zephyrplace.persistence.producer;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Singleton
public class EntityManagerProducer {

	@PersistenceUnit(unitName = "RedeSocial-ejb")
	private EntityManagerFactory emf;
	
	@Default
	@Produces
	public EntityManager entityManager() {
		return emf.createEntityManager();
	}
	
	public void close(@Disposes EntityManager em){
		em.close();
	}
	
}
