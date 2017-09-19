package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.Perfil;
@Entity
public class Conta extends AbstractPersistable<Long>{
	private static final long serialVersionUID = -6247238454358947968L;
	private String email;
	private String senha;
	
	private Perfil perfil;
	
	@Override
	protected void setId(Long id) {
		super.setId(id);
	}
	@Column
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Column
	@Enumerated(EnumType.STRING)
	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	
}
