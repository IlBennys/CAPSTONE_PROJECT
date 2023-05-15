package com.gestione.negozio.commerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gestione.negozio.commerce.model.Fattura;

@Repository
public interface FatturaDao extends JpaRepository<Fattura, Long> {
    // ordine decrescente del prezzo
    @Query("SELECT f FROM Fattura f WHERE f.importoTotale BETWEEN ?1 AND ?2")
    Optional<List<Fattura>> getAllFatturaByImporto(Double d1, Double d2);
}
