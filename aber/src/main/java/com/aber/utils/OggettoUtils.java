package com.aber.utils;

import java.util.List;

import com.aber.DTO.OggettoDTO;
import com.aber.entities.Oggetto;

public final class OggettoUtils {
	
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
	
}
