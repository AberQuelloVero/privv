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
	public Utente setScore(Utente utente,int score) throws IllegalArgumentException {
		
		if (score < -100 ||score > 200) {
			throw new IllegalArgumentException("Valore dello score errato");
		}
		return dao.save(utente);
	}

}
