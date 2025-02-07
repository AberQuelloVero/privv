package com.aber.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.DAO.UtenteDAO;
import com.aber.entities.Utente;

@Service
public interface UtenteService {
	
	public Utente setScore(Utente utente,int score);

	
	
}
