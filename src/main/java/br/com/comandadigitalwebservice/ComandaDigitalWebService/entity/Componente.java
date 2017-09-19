package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.StatusComponente;

@Entity
public class Componente extends AbstractPersistable<Long>{
	private static final long serialVersionUID = 4231121055504505154L;
	private String codigoComponente;
	private String nome;
	private StatusComponente statusComponente;
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	@Column
	public String getCodigoComponente() {
		return codigoComponente;
	}

	public void setCodigoComponente(String codigoComponente) {
		this.codigoComponente = codigoComponente;
	}
	@Column
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column
	@Enumerated(EnumType.STRING)
	public StatusComponente getStatusComponente() {
		return statusComponente;
	}

	public void setStatusComponente(StatusComponente statusComponente) {
		this.statusComponente = statusComponente;
	}

}
