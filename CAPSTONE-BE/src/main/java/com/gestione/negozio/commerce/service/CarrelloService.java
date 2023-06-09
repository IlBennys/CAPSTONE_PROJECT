package com.gestione.negozio.commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestione.negozio.commerce.model.Carrello;
import com.gestione.negozio.commerce.repository.ArticoloDao;
import com.gestione.negozio.commerce.repository.CarrelloArticoliDao;
import com.gestione.negozio.commerce.repository.CarrelloDao;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CarrelloService {

    @Autowired
    private CarrelloDao carrelloDao;
    @Autowired
    private ArticoloDao articoloDao;
    @Autowired
    private CarrelloArticoliDao carrelloArticoliDao;

    public String updateArticoliByCarrello(Long articoloId, Long carrelloId) {
	if (articoloDao.existsById(articoloId) & carrelloDao.existsById(carrelloId)) {
	    carrelloArticoliDao.aggiungiArticoloAlCarrello(articoloId, carrelloId);
	    return "Articolo aggiunto al carrello";
	} else {
	    throw new EntityNotFoundException("Carrello with ID --> " + carrelloId + " or Articoli with ID --> "
		    + articoloId + " doesn't exists on Database!");
	}
    }

    public String deleteArticoliByCarrello(Long articoloId, Long carrelloId) {
	if (articoloDao.existsById(articoloId) & carrelloDao.existsById(carrelloId)) {
	    carrelloArticoliDao.rimuoviArticoloDalCarrello(articoloId, carrelloId);
	    return "Articolo rimosso dal carrello";
	} else {
	    throw new EntityNotFoundException("Carrello with ID --> " + carrelloId + " or Articoli with ID --> "
		    + articoloId + " doesn't exists on Database!");
	}
    }

    public Carrello FindCarrelloById(Long id) {
	if (carrelloDao.existsById(id)) {
	    return carrelloDao.findById(id).get();
	} else {
	    throw new EntityNotFoundException("Carrello with ID --> " + id + " doesn't exists on Database!");
	}
    }

    public List<Carrello> findAll() {
	return carrelloDao.findAll();
    }

}