package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.StatusMesa;

@Entity
public class Mesa extends AbstractPersistable<Long>{

	private static final long serialVersionUID = 8362430602656438471L;
	private String codigoMesa;
	private Integer quantidade;
	private String finalidade;
	private StatusMesa statusMesa;
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	@Column
	public String getCodigoMesa() {
		return codigoMesa;
	}

	public void setCodigoMesa(String codigoMesa) {
		this.codigoMesa = codigoMesa;
	}
	@Column
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Column
	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	@Enumerated(EnumType.STRING)
	@Column
	public StatusMesa getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(StatusMesa statusMesa) {
		this.statusMesa = statusMesa;
	}

	
}
