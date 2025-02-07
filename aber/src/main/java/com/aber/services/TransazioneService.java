package com.aber.services;

import java.util.List;

import com.aber.DTO.TransazioneDTO;

import jakarta.servlet.http.HttpSession;

public interface TransazioneService {

	public List<TransazioneDTO> getTransazioniByUtente(Long utenteId);
	
	public List<TransazioneDTO> getTransazioniByOggetto(Long oggettoId);
	
	public void saveTransazione(TransazioneDTO transazioneDTO);

}
