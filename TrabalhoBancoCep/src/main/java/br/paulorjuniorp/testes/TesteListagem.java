package br.paulorjuniorp.testes;

import br.paulorjuniorp.dao.BairroDao;
import br.paulorjuniorp.dao.CidadeDao;
import br.paulorjuniorp.dao.EnderecoDao;
import br.paulorjuniorp.dao.EstadoDao;
import br.paulorjuniorp.entities.Bairro;
import br.paulorjuniorp.entities.Cidade;
import br.paulorjuniorp.entities.Endereco;
import br.paulorjuniorp.entities.Estado;

public class TesteListagem {

	public static void main(String[] args) {
		
		EstadoDao dao = new EstadoDao();

		for (Estado e : dao.todos()) {
			System.out.println(e.getUf() + " - " + e.getNome());
		}
		
		CidadeDao dao1 = new CidadeDao();
		
		for(Cidade c : dao1.todos()){
			System.out.println(c.getId() + " - " + c.getNome());
		}
		
		BairroDao dao2 = new BairroDao();
		
		for(Bairro b : dao2.todos()){
			System.out.println(b.getId() + " - " + b.getNome());
		}
		
		EnderecoDao dao3 = new EnderecoDao();
		
		for(Endereco l : dao3.todos()){
			System.out.println(l.getCep() + " - " + l.getLogradouro());
		}

	}

}
