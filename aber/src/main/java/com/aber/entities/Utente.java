package com.aber.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cognome;
	private Integer score;
	private Double saldo;
	private String immagineProfilo;
	private Double multiplier;
	@OneToMany(fetch =FetchType.LAZY,mappedBy = "venditore")
	private List<Oggetto> oggettiInVendita;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "acquirente")
	private List<Transazione> transazioniAcquisti;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "venditore")
	private List<Transazione> transazioniVendite;
	
	
	
	
	
	public String getImmagineProfilo() {
		return immagineProfilo;
	}
	public void setImmagineProfilo(String immagineProfilo) {
		this.immagineProfilo = immagineProfilo;
	}
	public Double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(Double multiplier) {
		this.multiplier = multiplier;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public List<Oggetto> getOggettiInVendita() {
		return oggettiInVendita;
	}
	public void setOggettiInVendita(List<Oggetto> oggettiInVendita) {
		this.oggettiInVendita = oggettiInVendita;
	}
	public List<Transazione> getTransazioniAcquisti() {
		return transazioniAcquisti;
	}
	public void setTransazioniAcquisti(List<Transazione> transazioniAcquisti) {
		this.transazioniAcquisti = transazioniAcquisti;
	}
	public List<Transazione> getTransazioniVendite() {
		return transazioniVendite;
	}
	public void setTransazioniVendite(List<Transazione> transazioniVendite) {
		this.transazioniVendite = transazioniVendite;
	}
	public Utente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	public Utente() {
		super();
	}
	
	
	
	

}
