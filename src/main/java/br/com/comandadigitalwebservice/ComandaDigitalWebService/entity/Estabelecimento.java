package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Estabelecimento extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -6652128865211501262L;
	private String codigoEstabelecimento;
	private String nomeEstabelecimento;
//	private HorarioAtendimento horarioAtendimento;
	

	@Column
	public String getCodigoEstabelecimento() {
		return codigoEstabelecimento;
	}

	public void setCodigoEstabelecimento(String codigoEstabelecimento) {
		this.codigoEstabelecimento = codigoEstabelecimento;
	}
	@Column
	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

}
