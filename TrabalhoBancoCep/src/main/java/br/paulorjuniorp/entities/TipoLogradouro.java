package br.paulorjuniorp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiposLogradouros")

public class TipoLogradouro {
	
	@Id
	@GeneratedValue
	@Column(unique=true)
	private String tipoLogradouro;
	

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	
}
