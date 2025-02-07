package com.aber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.TransazioneDAO;
import com.aber.DTO.TransazioneDTO;

@Service
public class TransazioneServiceImpl implements TransazioneService {
	
	@Autowired
	TransazioneDAO transazioneDAO;

	@Override
	public List<TransazioneDTO> getTransazioniByUtente(Long utenteId) {
			
		return transazioneDAO;
	}

	@Override
	public List<TransazioneDTO> getTransazioniByOggetto(Long oggettoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTransazione(TransazioneDTO transazioneDTO) {
		// TODO Auto-generated method stub

	}

}
