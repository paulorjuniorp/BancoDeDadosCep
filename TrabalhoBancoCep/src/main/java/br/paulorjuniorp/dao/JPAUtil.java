package br.paulorjuniorp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
  private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-trabalho-cep");
	    
    public EntityManager getEntityManager(){
	    	return entityManagerFactory.createEntityManager();
   }

}
