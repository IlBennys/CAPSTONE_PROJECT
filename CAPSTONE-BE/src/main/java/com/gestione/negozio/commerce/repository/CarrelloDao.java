package com.gestione.negozio.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.negozio.commerce.model.Carrello;

public interface CarrelloDao extends JpaRepository<Carrello, Long> {

}
