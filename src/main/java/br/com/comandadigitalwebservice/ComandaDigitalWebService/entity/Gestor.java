package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Gestor extends Colaborador{

	private static final long serialVersionUID = -3522030301324520805L;
	private String codigoGestor;
	
	@Column
	public String getCodigoGestor() {
		return codigoGestor;
	}

	public void setCodigoGestor(String codigoGestor) {
		this.codigoGestor = codigoGestor;
	}
	
	
	
	
}
