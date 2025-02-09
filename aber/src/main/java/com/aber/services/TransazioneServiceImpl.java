package com.aber.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.TransazioneDAO;
import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Transazione;
import com.aber.entities.Utente;
import com.aber.utils.TransazioniUtils;

@Service
public class TransazioneServiceImpl implements TransazioneService {
	
	@Autowired
	TransazioneDAO transazioneDAO;
	

	@Override
	public List<TransazioneDTO> getTransazioniByUtenteVendite(Utente utente) {
		
			List<Transazione> transazioni = transazioneDAO.findByVenditore(utente); 
			
			List<TransazioneDTO> transazioniDTO = new ArrayList<TransazioneDTO>();

			for(Transazione transazione : transazioni) {
				
				transazioniDTO.add(TransazioniUtils.convertToDTO(transazione));
				
			}
			
			
		
		return transazioniDTO;
	}
	
	@Override
	public List<TransazioneDTO> getTransazioniByUtenteAcquisti(Utente utente) {
		
			List<Transazione> transazioni = transazioneDAO.findByAcquirente(utente); 
			
			List<TransazioneDTO> transazioniDTO = new ArrayList<TransazioneDTO>();

			for(Transazione transazione : transazioni) {
				
				transazioniDTO.add(TransazioniUtils.convertToDTO(transazione));
				
			}
		
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
