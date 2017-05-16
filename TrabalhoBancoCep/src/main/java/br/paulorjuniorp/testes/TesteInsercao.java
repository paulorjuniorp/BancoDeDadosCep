package br.paulorjuniorp.testes;

import br.paulorjuniorp.dao.BairroDao;
import br.paulorjuniorp.dao.CidadeDao;
import br.paulorjuniorp.dao.EnderecoDao;
import br.paulorjuniorp.dao.EstadoDao;
import br.paulorjuniorp.entities.Bairro;
import br.paulorjuniorp.entities.Cidade;
import br.paulorjuniorp.entities.Endereco;
import br.paulorjuniorp.entities.Estado;
import br.paulorjuniorp.entities.TipoLogradouro;

public class TesteInsercao {

	public static void main(String[] args) {
		Estado estado = new Estado();
		estado.setUf("BA");
		estado.setNome("Bahia");
		
		Estado estado2 = new Estado();
		estado2.setUf("SP");
		estado2.setNome("São Paulo");
		
		Cidade cidade = new Cidade();
		cidade.setNome("Vitoria da Conquista");
		cidade.setEstado(estado);
		
		Cidade cidade2 = new Cidade();
		cidade2.setNome("São Paulo");
		cidade2.setEstado(estado2);
		
		Bairro bairro = new Bairro();
		bairro.setNome("Candeias");
		bairro.setCidade(cidade);
		
		Bairro bairro2 = new Bairro();
		bairro2.setNome("Paraisópolis");
		bairro2.setCidade(cidade2);

		Endereco endereco = new Endereco();
		endereco.setCep("45003-008");
		endereco.setLogradouro("Luis Eduardo Magalhaes");
		endereco.setTipoLogradouro(TipoLogradouro.Avenida);
		endereco.setBairro(bairro);
		
		Endereco endereco2 = new Endereco();
		endereco2.setCep("88888-003");
		endereco2.setLogradouro("Rua da ladeira");
		endereco2.setTipoLogradouro(TipoLogradouro.Rua);
		endereco2.setBairro(bairro2);
		
		EstadoDao dao = new EstadoDao();
		dao.adiciona(estado);
		
		CidadeDao dao1 = new CidadeDao();
		dao1.adiciona(cidade);
		
		BairroDao dao2 = new BairroDao();
		dao2.adiciona(bairro);
		
		EnderecoDao dao3 = new EnderecoDao();
		dao3.adiciona(endereco);
		
		EstadoDao dao4 = new EstadoDao();
		dao4.adiciona(estado2);
		
		CidadeDao dao5 = new CidadeDao();
		dao5.adiciona(cidade2);
		
		BairroDao dao6 = new BairroDao();
		dao6.adiciona(bairro2);
		
		EnderecoDao dao7 = new EnderecoDao();
		dao7.adiciona(endereco2);
	}

}
