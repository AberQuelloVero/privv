package com.aber.services;

import java.util.List;

import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Utente;

import jakarta.servlet.http.HttpSession;


public interface TransazioneService {
	

	public List<TransazioneDTO> getTransazioniByUtenteAcquisti(Utente utente);
	
	public List<TransazioneDTO> getTransazioniByUtenteVendite(Utente utente);
	
	public List<TransazioneDTO> getTransazioniByOggetto(Oggetto oggetto);
	
	public void saveTransazione(TransazioneDTO transazioneDTO);

}
