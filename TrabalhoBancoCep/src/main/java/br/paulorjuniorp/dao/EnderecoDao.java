package br.paulorjuniorp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.paulorjuniorp.entities.Cidade;
import br.paulorjuniorp.entities.Endereco;

public class EnderecoDao {

    EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Endereco endereco) {
		manager.getTransaction().begin();
		
		manager.persist(endereco);
		
		manager.getTransaction().commit();
	}
	
	public void altera(Endereco endereco) {
		manager.getTransaction().begin();
		
		manager.merge(endereco);
		
		manager.getTransaction().commit();		
	}

	public void remove(Endereco endereco) {
		manager.getTransaction().begin();

		manager.remove(endereco);
		
		manager.getTransaction().commit();

	}
	
	public List<Endereco> todos() {
	  return manager.createQuery("from Endereco", Endereco.class).getResultList();
	}

	public List<Endereco> ordenadosPeloLogradouro() {
		return manager.createQuery("select l from Endereco l order by l.logradouro", Endereco.class).getResultList();
	}	
	
	public Endereco  porCep(String cep) {
		return manager.find(Endereco.class,cep);
	}

}
