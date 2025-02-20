package com.aber.entities;

import java.security.Timestamp;
import java.sql.Date;

import com.aber.enums.MultiplierUSER;

import jakarta.persistence.CascadeType;
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
	private Utente venditore;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utente acquirente;
	private Long oggettoId;
	private Integer quantità;
	private Double spesaTotale;
	private Date dataTransazione;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		
		this.id = id;
	}
	
	public Utente getVenditore() {
		return venditore;
	}
	public void setVenditore(Utente venditore) {
		this.venditore = venditore;
	}
	public Utente getAcquirente() {
		return acquirente;
	}
	public void setAcquirente(Utente acquirente) {
		this.acquirente = acquirente;
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
	
	
	
	
	
	
	
}
