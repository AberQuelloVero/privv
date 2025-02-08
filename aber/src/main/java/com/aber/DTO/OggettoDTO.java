package com.aber.DTO;

public class OggettoDTO {
	
	private String nome;
	private Double costo;
	private String imageUrl;
	private Double multiplier;
	private Long venditoreID;
	private Integer quantità;
	
	
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
	public Long getVenditoreID() {
		return venditoreID;
	}
	public void setVenditoreID(Long venditoreID) {
		this.venditoreID = venditoreID;
	}
	public Integer getQuantità() {
		return quantità;
	}
	public void setQuantità(Integer quantità) {
		this.quantità = quantità;
	}
	public OggettoDTO() {
		super();
	}
	
	

}
