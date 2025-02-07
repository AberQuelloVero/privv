package com.aber.entities;

import java.security.Timestamp;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transazione {
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utente utente;
	@ManyToOne(fetch = FetchType.LAZY)
	private Oggetto oggetto;
	private Integer quantità;
	private Double spesaTotale;
	private Date dataTransazione;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Oggetto getOggetto() {
		return oggetto;
	}
	public void setOggetto(Oggetto oggetto) {
		this.oggetto = oggetto;
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
	
	
	
	
	
	
	
}
