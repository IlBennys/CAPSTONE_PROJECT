package com.gestione.negozio.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestione.negozio.commerce.model.Azienda;

@Repository
public interface AziendaDao extends JpaRepository<Azienda, Long> {

}
