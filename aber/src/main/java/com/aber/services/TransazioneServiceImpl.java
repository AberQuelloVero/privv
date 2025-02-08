package com.aber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.TransazioneDAO;
import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Transazione;
import com.aber.entities.Utente;

@Service
public class TransazioneServiceImpl implements TransazioneService {
	
	@Autowired
	TransazioneDAO transazioneDAO;
	

	@Override
	public List<TransazioneDTO> getTransazioniByUtente(Utente utente) {
		
			List<Transazione> transazioni = transazioneDAO.findByUtente(utente); 
			
			List<TransazioneDTO> transazioniDTO = null;
		
		return transazioniDTO;
	}
	
	
	

	@Override
	public void saveTransazione(TransazioneDTO transazioneDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TransazioneDTO> getTransazioniByOggetto(Oggetto oggetto) {
		// TODO Auto-generated method stub
		return null;
	}


}
