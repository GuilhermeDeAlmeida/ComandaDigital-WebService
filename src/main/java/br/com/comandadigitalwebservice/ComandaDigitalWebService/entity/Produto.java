package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.StatusProduto;

@Entity
public class Produto extends AbstractPersistable<Long>{

	private static final long serialVersionUID = 4393358608158989373L;
	private String codigoProduto;
	private String codigoFranquia;
	private String nome; 
	private String descricao;
	private Opcionais opcionais;
	private BigDecimal preco;
	private StatusProduto status;
	
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
	public String getCodigoFranquia() {
		return codigoFranquia;
	}
	public void setCodigoFranquia(String codigoFranquia) {
		this.codigoFranquia = codigoFranquia;
	}
	@Column
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
//	public Opcionais getOpcionais() {
//		return opcionais;
//	}
//	public void setOpcionais(Opcionais opcionais) {
//		this.opcionais = opcionais;
//	}
	@Column
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	@Enumerated(EnumType.STRING)
	@Column
	public StatusProduto getStatus() {
		return status;
	}
	public void setStatus(StatusProduto status) {
		this.status = status;
	}
	
	public Opcionais getOpcionais() {
		return opcionais;
	}
	public void setOpcionais(Opcionais opcionais) {
		this.opcionais = opcionais;
	}

}
