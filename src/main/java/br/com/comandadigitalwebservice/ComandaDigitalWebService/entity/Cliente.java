package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa{

	private static final long serialVersionUID = -1009225191941509409L;
	private String codigo;
	private String dispositivo;

	@Column
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Column
	public String getDispositivo() {
		return dispositivo;
	}
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}
}
