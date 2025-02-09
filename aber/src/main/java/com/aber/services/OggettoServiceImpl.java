package com.aber.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.OggettoDAO;
import com.aber.DAO.UtenteDAO;
import com.aber.DTO.OggettoDTO;
import com.aber.entities.Oggetto;
import com.aber.utils.OggettoUtils;

@Service
public class OggettoServiceImpl implements OggettoService {
	
	@Autowired
	OggettoDAO oggettoDAO;
	@Autowired
	UtenteDAO utenteDAO;

	
	
	//convertDTOToOggetto non converte completamente 
	@Override
	public void salvaOggetto(OggettoDTO oggettoDTO) {
		Oggetto oggetto = OggettoUtils.convertDTOToOggetto(oggettoDTO);
	
		System.out.print("ID DEL OGGETTO DTO VENDITORE : " + oggettoDTO.getVenditoreID());
		
		oggetto.setVenditore(utenteDAO.findById(oggettoDTO.getVenditoreID())
				.orElseThrow());
		oggettoDAO.save(oggetto);						
	}



	@Override
	public void updateQuantitàOggetto(OggettoDTO oggettoDTO,Integer oggettiVenduti) throws Exception {
		
		Oggetto oggetto = oggettoDAO.findById(oggettoDTO.getId()).orElseThrow();
		
		oggetto.setQuantità(oggetto.getQuantità()-oggettiVenduti);
		
		if(oggetto.getQuantità()<0)
			throw new Exception("La quantità rimanente non può essere minore di zero");
		
		oggettoDAO.save(oggetto);
	}
		
		

}
