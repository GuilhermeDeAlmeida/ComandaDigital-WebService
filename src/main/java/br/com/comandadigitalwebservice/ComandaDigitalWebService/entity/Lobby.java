package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Lobby extends AbstractPersistable<Long>{

	private static final long serialVersionUID = 8724905034889737853L;
	private String codigoDoCliente;

	@Override
	protected void setId(Long id) {
		super.setId(id);
	}

	@Column
	public String getCodigoDoCliente() {
		return codigoDoCliente;
	}

	public void setCodigoDoCliente(String codigoDoCliente) {
		this.codigoDoCliente = codigoDoCliente;
	}

	
	
	
}
