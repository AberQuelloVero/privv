package com.aber.services;

import com.aber.DTO.OggettoDTO;
import com.aber.entities.Oggetto;

public interface OggettoService {
	
	public void salvaOggetto(OggettoDTO oggettoDTO);
	
	public void updateQuantitàOggetto(OggettoDTO oggettoDTO,Integer oggettiVenduti) throws Exception;
	
	
}
