package br.com.comandadigitalwebservice.ComandaDigitalWebService.entity;

import javax.persistence.Column;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Localizacao extends AbstractPersistable<Long>{
	
/**
	 * 
	 */
	private static final long serialVersionUID = -3748844291016074855L;
	//	private Estabelecimento estabelecimento;
	private String latitude;
	private String longitude;
//	public Estabelecimento getEstabelecimento() {
//		return estabelecimento;
//	}
//	public void setEstabelecimento(Estabelecimento estabelecimento) {
//		this.estabelecimento = estabelecimento;
//	}
	
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}

	@Column
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Column
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	
}
