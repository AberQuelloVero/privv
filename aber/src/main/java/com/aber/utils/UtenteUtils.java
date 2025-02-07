package com.aber.utils;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.random.RandomGenerator;

import org.apache.el.util.ExceptionUtils;


import com.aber.DTO.UtenteRegDTO;
import com.aber.entities.Utente;
import com.aber.enums.MultiplierUSER;


public final class UtenteUtils {
	
	
	
	//funzione per validare un utente,basta che abbia un nome ed un cognome,del resto frega un cazzo
		public static boolean validateUtente(UtenteRegDTO dto) {
			if(dto.getNome().isBlank() || dto.getCognome().isBlank())
				
				return false;
			
			return true;
		}
		
		public static Double getRandomValuesForMultiplier() throws Exception {
			
		    Set<Double> random = new HashSet<>();
		   
		    for(MultiplierUSER x : MultiplierUSER.values()) {
		    	
		    	random.add(x.getValore());
		    }
		    
		    if (random.isEmpty())
		    	throw new IllegalStateException("Il set di multiplierUSER è vuoto");
		    
		    return (Double) random.toArray()[RandomGenerator.getDefault().nextInt(MultiplierUSER.values().length)];
		}
		
		

		
		
		
		
		
		
		

}
