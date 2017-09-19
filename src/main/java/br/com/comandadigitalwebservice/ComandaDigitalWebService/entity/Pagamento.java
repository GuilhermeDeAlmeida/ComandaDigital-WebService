package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.FormaPagamento;
@Entity
public class Pagamento extends AbstractPersistable<Long>{

	private static final long serialVersionUID = -8014252210021233873L;
	private String codigoComanda;
	private FormaPagamento forma;
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	@Column
	public String getCodigoComanda() {
		return codigoComanda;
	}
	public void setCodigoComanda(String codigoComanda) {
		this.codigoComanda = codigoComanda;
	}
	@Enumerated(EnumType.STRING)
	@Column
	public FormaPagamento getForma() {
		return forma;
	}
	public void setForma(FormaPagamento forma) {
		this.forma = forma;
	}
	
	

}
