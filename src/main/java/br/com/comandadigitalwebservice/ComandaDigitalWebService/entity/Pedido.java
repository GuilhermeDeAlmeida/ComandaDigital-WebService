package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;
@Entity
public class Pedido extends AbstractPersistable<Long>{

	private static final long serialVersionUID = -2724148695034308269L;
	private String codigoPedido;
	private String codigoCliente;
	private String codigoEstabelecimento;
	private Date dataHora;
	private BigDecimal valor;

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
	public String getCodigoEstabelecimento() {
		return codigoEstabelecimento;
	}
	public void setCodigoEstabelecimento(String codigoEstabelecimento) {
		this.codigoEstabelecimento = codigoEstabelecimento;
	}
	@Column
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	@Column
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
