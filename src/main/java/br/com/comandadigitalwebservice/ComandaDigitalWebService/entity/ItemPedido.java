package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;
@Entity
public class ItemPedido extends AbstractPersistable<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3717238927327440716L;
	private String codigoProduto;
	private Integer quantidade;
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	@Column	
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	@Column
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
