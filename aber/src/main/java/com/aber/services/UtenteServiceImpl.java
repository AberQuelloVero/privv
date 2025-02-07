package com.aber.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.UtenteDAO;
import com.aber.entities.Utente;
import com.aber.utils.UtenteUtils;
@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
	UtenteDAO dao;

	@Override
	public Utente setScore(Utente utente,int score) {
		
		if (score < -100 ||score > 200) {
			return utente;
		}
		
		if(UtenteUtils.validateUtente(utente)) {
			utente.setScore(score);
			return dao.save(utente);
	
		}else
			
			return utente;
		
	}

}
