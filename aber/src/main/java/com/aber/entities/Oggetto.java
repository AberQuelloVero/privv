package com.aber.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public abstract class Oggetto {	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double costo;
	private String imageUrl;
	private Double multiplier;
	@ManyToOne
	private Utente venditore;
	private Integer quantità;
	
	
	
	public Utente getVenditore() {
		return venditore;
	}
	public void setVenditore(Utente venditore) {
		this.venditore = venditore;
	}
	public Integer getQuantità() {
		return quantità;
	}
	public void setQuantità(Integer quantità) {
		this.quantità = quantità;
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
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(Double multiplier) {
		this.multiplier = multiplier;
	}
	public Oggetto(String nome, Double costo, String imageUrl) {
		super();
		this.nome = nome;
		this.costo = costo;
		this.imageUrl = imageUrl;
	}
	
	
	
	
	
	
	
	

}
