package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.Sexo;
@Entity
public class Pessoa extends AbstractPersistable<Long>{
	private static final long serialVersionUID = 5150233313763307818L;
	private String nome;
	private Sexo sexo;
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	@Column	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Enumerated(EnumType.STRING)
	@Column
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}
