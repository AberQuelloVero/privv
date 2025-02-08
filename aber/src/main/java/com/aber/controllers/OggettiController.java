package com.aber.controllers;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aber.DTO.OggettoDTO;
import com.aber.services.OggettoService;

@RestController
@RequestMapping("api/oggetti")
public class OggettiController {
	
	@Autowired
	OggettoService oggettoService;
	
	
	@PostMapping("aggiungi-oggetto")
	public ResponseEntity<?> aggiungiOggetto(@RequestBody OggettoDTO oggettoDTO){
		
		try {
			oggettoService.salvaOggetto(oggettoDTO);
			return ResponseEntity.ok().body("Oggetto aggiunto");	
		}catch (Error e) {
			throw new RuntimeErrorException(e, "C'è stato un errore durante l'aggiunta dell'oggetto :" + e.getMessage());
		}
		
	}
	
	
}
