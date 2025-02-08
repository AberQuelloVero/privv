package com.aber.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@GetMapping("addUtente")
	public String getAddUserFormPage() {
		return "Utente/addUtente";
	}
	
@GetMapping("user-list")
public String  getUserListPage() {
    return "Utente/list";
}

@GetMapping("aggiungi-oggetto")
public String aggiungiOggetto() {
	return "Oggetto/aggiungi_oggetto";
}

	
	
	
	
}
