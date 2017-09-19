package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.comandadigitalwebservice.ComandaDigitalWebService.enums.entity.Jornada;
@Entity
public class Colaborador extends Cliente {

	private static final long serialVersionUID = 785257740784480047L;
	private String cpf;
	private String cargo;
	private Jornada jornada;
	private Date dataHoraEntrada;
	private Date dataHoraSaida;
	
	@Column
	public String getCpf() {
	
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Column
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Column
	@Enumerated(EnumType.STRING)
	public Jornada getJornada() {
		return jornada;
	}
	public void setJornada(Jornada jornada) {
		this.jornada = jornada;
	}
	@Column
	public Date getDataHoraEntrada() {
		return dataHoraEntrada;
	}
	public void setDataHoraEntrada(Date dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}
	@Column
	public Date getDataHoraSaida() {
		return dataHoraSaida;
	}
	public void setDataHoraSaida(Date dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}
}
