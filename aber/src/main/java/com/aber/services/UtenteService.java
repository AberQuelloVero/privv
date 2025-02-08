
 package com.aber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.UtenteDAO;
import com.aber.DTO.OggettoDTO;
import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Utente;


public interface UtenteService {
	
	public Utente setScore(Utente utente,int score);
	
	public List<TransazioneDTO> getTransazioniUtenteAcquisti(Utente utente);
	
	public List<TransazioneDTO> getTransazioniUtenteVendita(Utente utente);

	public List<OggettoDTO> getOggettiInVendita(Utente utente);
	
}
