package com.aber.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aber.DAO.OggettoDAO;
import com.aber.DAO.UtenteDAO;
import com.aber.entities.Oggetto;
import com.aber.entities.Utente;
import com.aber.services.TransazioneService;
import com.aber.services.UtenteService;

@RestController
@RequestMapping(value = "api/transazioni")
public class TransazioniController {
	
	@Autowired
	TransazioneService transazioneService;
	@Autowired
	OggettoDAO oggettoDAO;
	@Autowired
	UtenteDAO utenteDAO;
	

    @PostMapping("/acquisto")
    public ResponseEntity<?> acquistaOggetto(@RequestParam Long utenteID, 
                                             @RequestParam Long oggettoID, 
                                             @RequestParam Integer quantita) {
        try {
            Utente utente = utenteDAO.findById(utenteID)
                    .orElseThrow(() -> new RuntimeException("Utente non trovato"));

            Oggetto oggetto = oggettoDAO.findById(oggettoID)
                    .orElseThrow(() -> new RuntimeException("Oggetto non trovato"));

            transazioneService.acquistaOggetto(utente, oggetto, quantita);

            String messaggio = (quantita > 1) ? "Oggetti acquistati correttamente" : "Oggetto acquistato correttamente"; //nella prima stringa va il true
            return ResponseEntity.ok(messaggio);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Errore durante la transazione: " + e.getMessage());
        }
    }
	
	
}
