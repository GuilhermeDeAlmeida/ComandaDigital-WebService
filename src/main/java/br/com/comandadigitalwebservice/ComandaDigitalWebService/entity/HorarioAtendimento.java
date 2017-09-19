package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class HorarioAtendimento extends AbstractPersistable<Long>{

	private static final long serialVersionUID = -200315013641337266L;
	//	public Estabelecimento estabelecimento;
	private Date horarioAbertura;
	private Date horarioFechamento;
	
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	@Column
	public Date getHorarioAbertura() {
		return horarioAbertura;
	}
	public void setHorarioAbertura(Date horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}
	@Column
	public Date getHorarioFechamento() {
		return horarioFechamento;
	}
	public void setHorarioFechamento(Date horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}
	
	

}
