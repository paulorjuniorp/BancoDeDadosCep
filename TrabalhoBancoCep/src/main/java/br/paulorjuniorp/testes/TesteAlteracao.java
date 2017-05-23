package br.paulorjuniorp.testes;

import br.paulorjuniorp.dao.BairroDao;
import br.paulorjuniorp.dao.CidadeDao;
import br.paulorjuniorp.dao.EnderecoDao;
import br.paulorjuniorp.dao.EstadoDao;
import br.paulorjuniorp.entities.Bairro;
import br.paulorjuniorp.entities.Cidade;
import br.paulorjuniorp.entities.Endereco;
import br.paulorjuniorp.entities.Estado;

public class TesteAlteracao {

	public static void main(String[] args) {
		
		EstadoDao dao = new EstadoDao();

		Estado estado = dao.porUf("BA");
		
		System.out.println("Nome antes = " + estado.getNome());
		
		estado.setNome("Baía");
		
		dao.altera(estado);
		
		CidadeDao dao1 = new CidadeDao();
		
		
		Cidade cidade = dao1.porId((long) 1);
		
		System.out.println("Nome antes =" + cidade.getNome());
		
		cidade.setNome("Concas");
		
		dao1.altera(cidade);
		
		BairroDao dao2 = new BairroDao();
		
		Bairro bairro = dao2.porId((long) 2);
		
		System.out.println("Nome antes =" + bairro.getNome());
		
		bairro.setNome("Morumbi");
		
		dao2.altera(bairro);
		
		EnderecoDao dao3 = new EnderecoDao();
		
		Endereco endereco = dao3.porCep("45003-008");
		
		System.out.println("Nome antes =" + endereco.getCep());
		
		endereco.setLogradouro("LEM");
		
		dao3.altera(endereco);
		
		System.out.println("Alteração realizada com sucesso!");
		
		
	}

}
