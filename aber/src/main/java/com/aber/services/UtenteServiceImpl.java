package com.aber.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.OggettoDAO;
import com.aber.DAO.TransazioneDAO;
import com.aber.DAO.UtenteDAO;
import com.aber.DTO.OggettoDTO;
import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Transazione;
import com.aber.entities.Utente;
import com.aber.utils.OggettoUtils;
import com.aber.utils.TransazioniUtils;
import com.aber.utils.UtenteUtils;
@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
	UtenteDAO utenteDAO;
	@Autowired
	TransazioneDAO transazioneDAO;
	@Autowired
	OggettoDAO oggettoDAO;

	@Override
	public Utente setScore(Utente utente,int score) throws IllegalArgumentException {
		
		if (score < -100 ||score > 200) {
			throw new IllegalArgumentException("Valore dello score errato");
		}
		return utenteDAO.save(utente);
	}

	
	
	@Override
	public List<TransazioneDTO> getTransazioniUtenteAcquisti(Utente utente) throws RuntimeException{
	    try {
	        List<Transazione> transazioni = transazioneDAO.findByAcquirente(utente);
	        return transazioni.stream()
	            .map(TransazioniUtils::convertToDTO)
	            .collect(Collectors.toList());
	    } catch (Exception e) {
	        throw new RuntimeException("Errore nel recupero delle transazioni", e);
	    }
	}
	
	@Override
	public List<TransazioneDTO> getTransazioniUtenteVendita(Utente utente) throws RuntimeException{
	    try {
	        List<Transazione> transazioni = transazioneDAO.findByVenditore(utente);
	        return transazioni.stream()
	            .map(TransazioniUtils::convertToDTO)
	            .collect(Collectors.toList());
	    } catch (Exception e) {
	        throw new RuntimeException("Errore nel recupero delle transazioni", e);
	    }
	}


	@Override
	public List<OggettoDTO> getOggettiInVendita(Utente utente) throws RuntimeException{
		
		try {
			return oggettoDAO.findByVenditore(utente).stream()
				.map(OggettoUtils::convertOggettoToDTO)
				.collect(Collectors.toList());
		}catch(Exception exception) {
			throw new RuntimeException("Errore nel recupero degli oggetti in vendita",exception);
		}
		
		
	} 

}
