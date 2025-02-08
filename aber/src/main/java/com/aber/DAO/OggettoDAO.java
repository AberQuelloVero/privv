package com.aber.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aber.DTO.OggettoDTO;
import com.aber.entities.Oggetto;
import com.aber.entities.Utente;

@Repository
public interface OggettoDAO extends JpaRepository<Oggetto,Long>{

	public List<Oggetto> findByVenditore(Utente venditore);
	
	
}
