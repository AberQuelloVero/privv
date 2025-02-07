package com.aber.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aber.DAO.UtenteDAO;
import com.aber.DTO.UtenteRegDTO;
import com.aber.entities.Utente;
import com.aber.services.UtenteService;
import com.aber.utils.UtenteUtils;

@RestController
@RequestMapping("api/utente")
public class UtenteController {

	@Autowired
	UtenteService service;
	@Autowired
	UtenteDAO dao;
	
	@GetMapping("showUtente")
	public Optional<Utente> showUtente(@RequestParam(name = "id") Long utenteId) {
		
		return dao.findById(utenteId);
	}
	
	@GetMapping(value = "list")
	public List<Utente> getAllUtenti(){
		try {
			Double random = UtenteUtils.getRandomValuesForMultiplier();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return dao.findAll();
	}
	
	
	@PostMapping("addUtente")
	public Utente addUtente(@RequestBody UtenteRegDTO utente) throws Exception {
	
		if(!UtenteUtils.validateUtente(utente))
			throw new IllegalArgumentException("Anagrafica cliente NON valida");
		
		Utente utente2 = new Utente();
		
		utente2.setNome(utente.getNome());
		utente2.setCognome(utente.getCognome());
		utente2.setImmagineProfilo(utente.getImageURL());
		utente2.setMultiplier(0.0);
		utente2.setSaldo((long) 0);
		utente2.setScore(0);
		
		return dao.save(utente2);
}
	
}
