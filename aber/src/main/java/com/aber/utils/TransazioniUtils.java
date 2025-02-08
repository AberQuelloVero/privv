package com.aber.utils;

import com.aber.DTO.TransazioneDTO;
import com.aber.entities.Transazione;

public final class TransazioniUtils {
	
	public static TransazioneDTO convertToDTO(Transazione transazione) {
		
		TransazioneDTO transazioneDTO = new TransazioneDTO();
		transazioneDTO.setAcquirenteID(transazione.getAcquirente().getId());
		transazioneDTO.setVenditoreID(transazione.getVenditore().getId());
		transazioneDTO.setOggettoId(transazione.getOggettoId());
		transazioneDTO.setQuantità(transazione.getQuantità());
		transazioneDTO.setSpesaTotale(transazione.getSpesaTotale());
		transazioneDTO.setDataTransazione(transazione.getDataTransazione());
		
		return transazioneDTO;
	}

}
