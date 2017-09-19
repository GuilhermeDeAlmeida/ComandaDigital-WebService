package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Administrador extends Gestor{
	
	private static final long serialVersionUID = -5165975016510252489L;
	public String codigoAdministrador;

	@Column
	public String getCodigoAdministrador() {
		return codigoAdministrador;
	}

	public void setCodigoAdministrador(String codigoAdministrador) {
		this.codigoAdministrador = codigoAdministrador;
	}
	
	

}
