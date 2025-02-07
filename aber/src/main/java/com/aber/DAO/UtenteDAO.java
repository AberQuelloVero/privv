package com.aber.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aber.entities.Utente;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Long> {

}
