package com.aber.DTO;

import java.sql.Date;

public class TransazioneDTO {

	private Long utenteId;
	private Long oggettoId;
	private Integer quantità;
	private Double spesaTotale;
	private Date dataTransazione;
	public Long getUtenteId() {
		return utenteId;
	}
	public void setUtenteId(Long utenteId) {
		this.utenteId = utenteId;
	}
	public Long getOggettoId() {
		return oggettoId;
	}
	public void setOggettoId(Long oggettoId) {
		this.oggettoId = oggettoId;
	}
	public Integer getQuantità() {
		return quantità;
	}
	public void setQuantità(Integer quantità) {
		this.quantità = quantità;
	}
	public Double getSpesaTotale() {
		return spesaTotale;
	}
	public void setSpesaTotale(Double spesaTotale) {
		this.spesaTotale = spesaTotale;
	}
	public Date getDataTransazione() {
		return dataTransazione;
	}
	public void setDataTransazione(Date dataTransazione) {
		this.dataTransazione = dataTransazione;
	}
	public TransazioneDTO() {
		super();
	}

	
	
}
