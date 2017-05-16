package br.paulorjuniorp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.paulorjuniorp.entities.Bairro;
import br.paulorjuniorp.entities.Cidade;

public class BairroDao {
    EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Bairro bairro) {
		manager.getTransaction().begin();
		
		manager.persist(bairro);
		
		manager.getTransaction().commit();
	}
	
	public void altera(Bairro bairro) {
		manager.getTransaction().begin();
		
		manager.merge(bairro);
		
		manager.getTransaction().commit();		
	}

	public void remove(Bairro bairro) {
		manager.getTransaction().begin();

		manager.remove(bairro);
		
		manager.getTransaction().commit();

	}
	
	public List<Bairro> todos() {
	  return manager.createQuery("from Bairro", Bairro.class).getResultList();
	}

	public List<Bairro> ordenadosPeloNome() {
		return manager.createQuery("select b from Bairro b order by b.nome", Bairro.class).getResultList();
	}	
	
	public Bairro  porId(Long id) {
		return manager.find(Bairro.class, id);
	}

}
