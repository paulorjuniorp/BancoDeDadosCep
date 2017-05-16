package br.paulorjuniorp.testes;

import br.paulorjuniorp.dao.EstadoDao;
import br.paulorjuniorp.entities.Estado;

public class TesteRemoção {

	public static void main(String[] args) {
		
		EstadoDao dao = new EstadoDao();
		
		Estado estado =  dao.porUf("SP");
				
		dao.remove(estado);
		
		System.out.println("Registro " + estado.getUf() + " excluido com sucesso.");

	}

}
