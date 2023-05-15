package com.gestione.negozio.commerce.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gestione.negozio.commerce.model.Utente;

@Repository
public interface UtenteDao extends JpaRepository<Utente, Long> {
    // ordine di data ultimo contatto dalla più recente
    @Query("SELECT u FROM Utente u WHERE u.dataNascita BETWEEN ?1 AND ?2")
    Optional<List<Utente>> getAllUtentiOrderByDataNascita(LocalDate l1, LocalDate l2);

}
