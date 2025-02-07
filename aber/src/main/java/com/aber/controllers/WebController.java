package com.aber.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@GetMapping("addUtente")
	public String getAddUserFormPage() {
		return "addUtente";
	}
	
@GetMapping("user-list")
public String  getUserListPage() {
    return "list";
}

	
	
	
	
}
