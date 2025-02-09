package com.aber.utils;

import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Transazione;

public final class TransazioniUtils {
	
	public static TransazioneDTO convertToDTO(Transazione transazione) {
		
		TransazioneDTO transazioneDTO = new TransazioneDTO();
		transazioneDTO.setId(transazione.getId());
		transazioneDTO.setAcquirenteID(transazione.getAcquirente().getId());
		transazioneDTO.setVenditoreID(transazione.getVenditore().getId());
		transazioneDTO.setOggettoId(transazione.getOggettoId());
		transazioneDTO.setQuantità(transazione.getQuantità());
		transazioneDTO.setSpesaTotale(transazione.getSpesaTotale());
		transazioneDTO.setDataTransazione(transazione.getDataTransazione());
		
		return transazioneDTO;
	}
	
	//no acquirente o venditore
	public static Transazione convertDTOtoTransazione(TransazioneDTO transazioneDTO) {
	    Transazione transazione = new Transazione();
	    
	    transazione.setId(transazioneDTO.getId());
	    transazione.setOggettoId(transazioneDTO.getOggettoId());
	    transazione.setQuantità(transazioneDTO.getQuantità());
	    transazione.setSpesaTotale(transazioneDTO.getSpesaTotale());
	    transazione.setDataTransazione(transazioneDTO.getDataTransazione());
	    
	    return transazione;
	}


}
