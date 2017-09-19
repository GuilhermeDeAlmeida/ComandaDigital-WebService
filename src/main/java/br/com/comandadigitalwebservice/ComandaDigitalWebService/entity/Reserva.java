package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Reserva extends AbstractPersistable<Long>{

	private static final long serialVersionUID = -4603038167520171802L;
	private String codigoReserva;
	private String codigoCliente;
	private String codigoMesa;

	@Override
	public void setId(Long id) {
		super.setId(id);
	}

	@Column
	public String getCodigoReserva() {
		return codigoReserva;
	}
	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	@Column
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	@Column
	public String getCodigoMesa() {
		return codigoMesa;
	}
	public void setCodigoMesa(String codigoMesa) {
		this.codigoMesa = codigoMesa;
	}

	
	
}
