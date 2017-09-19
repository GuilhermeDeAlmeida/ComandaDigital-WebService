package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;
@Entity
public class Franquia extends AbstractPersistable<Long>{
	
	private static final long serialVersionUID = -1319642100371209441L;
	private String razaoSocial;

	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	@Column
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	
	
	
}
