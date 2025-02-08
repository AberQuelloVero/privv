package com.aber.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aber.entities.Oggetto;
import com.aber.entities.Transazione;
import com.aber.entities.Utente;

@Repository
public interface TransazioneDAO extends JpaRepository<Transazione,Long> {
	
	public List<Transazione> findByAcquirente(Utente utente);
	
	public List<Transazione> findByVenditore(Utente utente);
	
	public List<Transazione> findByOggettoId(Long oggettoId);

}
