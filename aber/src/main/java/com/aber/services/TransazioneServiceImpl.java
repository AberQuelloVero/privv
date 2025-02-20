package com.aber.services;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.OggettoDAO;
import com.aber.DAO.TransazioneDAO;
import com.aber.DAO.UtenteDAO;
import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Transazione;
import com.aber.entities.Utente;
import com.aber.enums.MultiplierUSER;
import com.aber.utils.TransazioniUtils;
import com.aber.utils.UtenteUtils;

@Service
public class TransazioneServiceImpl implements TransazioneService {
	
	@Autowired
	TransazioneDAO transazioneDAO;
	@Autowired
	UtenteDAO utenteDAO;
	@Autowired
	OggettoDAO oggettoDAO;

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
	
	
	
	//inutilizzato
	@Override
	public void saveTransazione(TransazioneDTO transazioneDTO) {
	
		Transazione transazione = TransazioniUtils.convertDTOtoTransazione(transazioneDTO);
		transazione.setAcquirente(
						utenteDAO.findById(transazioneDTO.getAcquirenteID()).orElseThrow() //usiamo orElseThrow() per eliminare il problema di Optional<Utente>,
																					//se non c'è,throwerà comunque NoSuchElementException
				);
		transazione.setVenditore(
				utenteDAO.findById(transazioneDTO.getVenditoreID()).orElseThrow() 
				);
		
		transazioneDAO.save(transazione);
	}

	@Override
	public List<TransazioneDTO> getTransazioniByOggetto(Oggetto oggetto) {
		
		return transazioneDAO.findByOggettoId(oggetto.getId()).
				stream().
				map(TransazioniUtils::convertToDTO).
				collect(Collectors.toList());
	}
										//---------TRANSAZIONI TRA UTENTI----------------//
	@Override
	public void acquistaOggetto(Utente acquirente, Oggetto oggetto,Integer quantita) throws Exception{
		
		if(quantita>oggetto.getQuantità())
				throw new Exception("Quantità non disponibile");
		if(quantita==oggetto.getQuantità())
				oggetto.setInVendita(false);
			
		Transazione transazione = new Transazione();
		transazione.setDataTransazione(new Date(System.currentTimeMillis())); //utilizziamo questo per java.sql.date <c:otherwise> utilizzeremmo new Date() con java.util.date </c:otherwise>
		transazione.setOggettoId(oggetto.getId());
		transazione.setQuantità(quantita);
		transazione.setSpesaTotale(quantita*oggetto.getCosto());
		transazione.setAcquirente(acquirente);
		transazione.setVenditore(oggetto.getVenditore());
		
		transazioneDAO.save(transazione);
		
		oggetto.setQuantità(oggetto.getQuantità()-quantita);
		oggettoDAO.save(oggetto);
		if(acquirente.getMultiplier()==null)
				acquirente.setMultiplier(0.0);
		acquirente.setMultiplier(acquirente.getMultiplier()+UtenteUtils.getRandomValuesForMultiplier());
		//provo a non fare acquirente.getTransazioni().add(transazione),JPA dovrebbe rispettare la dipendenza automaticamente
		if(oggetto.getVenditore().getSaldo()==null)
				oggetto.getVenditore().setSaldo(0.0);
		oggetto.getVenditore().setSaldo(oggetto.getVenditore().getSaldo()+transazione.getSpesaTotale());

		utenteDAO.save(oggetto.getVenditore());
		utenteDAO.save(acquirente);
		
	}


}
