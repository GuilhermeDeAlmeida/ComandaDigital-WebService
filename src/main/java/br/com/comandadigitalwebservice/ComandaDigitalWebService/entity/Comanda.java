package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.StatusComanda;
@Entity
public class Comanda extends AbstractPersistable<Long>{

	private static final long serialVersionUID = 1417237469711079079L;
	private String codigoPedido;
	private String codigoCliente;
	private String codigoComanda;
	private Date dataHoraAtual;
	private BigDecimal total;
	private StatusComanda status;
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	@Column
	public String getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	
	@Column
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	@Column
	public String getCodigoComanda() {
		return codigoComanda;
	}
	public void setCodigoComanda(String codigoComanda) {
		this.codigoComanda = codigoComanda;
	}
	@Column
	public Date getDataHoraAtual() {
		return dataHoraAtual;
	}
	public void setDataHoraAtual(Date dataHoraAtual) {
		this.dataHoraAtual = dataHoraAtual;
	}
	@Column
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	@Column
	@Enumerated(EnumType.STRING)
	public StatusComanda getStatus() {
		return status;
	}
	public void setStatus(StatusComanda status) {
		this.status = status;
	}
	
	
	
	
	
}
