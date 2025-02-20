package com.aber.controllers;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.DAO.OggettoDAO;
import com.aber.DAO.UtenteDAO;
import com.aber.services.UtenteService;
import com.aber.utils.OggettoUtils;
import com.aber.utils.UtenteUtils;



@Controller
@RequestMapping("jsp")
public class JspController {
	
	@Autowired
	OggettoDAO oggettoDAO;
		
	@GetMapping("prova")
	public String showProva(Model model) {
		
		model.addAttribute("risultati",oggettoDAO.findAll().stream()
							.map(o -> OggettoUtils.convertOggettoToDTO(o))
							.collect(Collectors.toList())									
							);
		
		return "JSP/prova/prova.jsp";
	}
	
}
