package com.aber.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aber.DTO.OggettoDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Utente;
import com.aber.services.UtenteService;

public final class OggettoUtils {
	
	@Autowired
	UtenteService utenteService;
	
	public static OggettoDTO convertOggettoToDTO(Oggetto oggetto) {
		
		OggettoDTO oggettoDTO = new OggettoDTO();
		
		oggettoDTO.setCosto(oggetto.getCosto());
		oggettoDTO.setImageUrl(oggetto.getImageUrl());
		oggettoDTO.setMultiplier(oggetto.getMultiplier());
		oggettoDTO.setNome(oggetto.getNome());
		oggettoDTO.setQuantità(oggetto.getQuantità());
		oggettoDTO.setVenditoreID(oggetto.getVenditore().getId());
		
		return oggettoDTO;
	}
	
	public static Oggetto convertDTOToOggetto(OggettoDTO oggettoDTO) {
	    
		Oggetto oggetto = new Oggetto();
	    
	    oggetto.setCosto(oggettoDTO.getCosto());
	    oggetto.setImageUrl(oggettoDTO.getImageUrl());
	    oggetto.setMultiplier(oggettoDTO.getMultiplier());
	    oggetto.setNome(oggettoDTO.getNome());
	    oggetto.setQuantità(oggettoDTO.getQuantità());
	    
	    
	    return oggetto;
	}

	
}
