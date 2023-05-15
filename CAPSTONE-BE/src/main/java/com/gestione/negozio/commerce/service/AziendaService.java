package com.gestione.negozio.commerce.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestione.negozio.commerce.model.Azienda;
import com.gestione.negozio.commerce.model.Corriere;
import com.gestione.negozio.commerce.repository.AziendaDao;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AziendaService {
    @Autowired
    private AziendaDao aziendaDao;
    @Autowired
    private CorriereService corriereService;

    @Autowired
    @Qualifier("FakeAzienda")
    private ObjectProvider<Azienda> objAzienda;

    public void createAzienda() {
	List<Corriere> listaCorrieri = corriereService.findAll();
	Azienda a = objAzienda.getObject();
	a.setLista_corrieri(listaCorrieri);
	aziendaDao.save(a);
    }

    public String updateAzienda(Azienda a) {
	if (aziendaDao.existsById(a.getId())) {
	    aziendaDao.save(a);
	    return "azienda correctly updated on Database";
	} else {
	    throw new EntityNotFoundException("azienda with ID --> " + a.getId() + " doesn't exists on Database!");
	}
    }

    public String deleteAzienda(Azienda a) {
	if (aziendaDao.existsById(a.getId())) {
	    aziendaDao.delete(a);
	    return "azienda correctly deleted from Database";
	} else {
	    throw new EntityNotFoundException("azienda with ID --> " + a.getId() + " doesn't exists on Database!");
	}
    }

    public String deleteAzienda(Long id) {
	if (aziendaDao.existsById(id)) {
	    aziendaDao.deleteById(id);
	    return "azienda correctly deleted from Database";
	} else {
	    throw new EntityNotFoundException("azienda with ID --> " + id + " doesn't exists on Database!");
	}
    }

    public String postAzienda(Azienda a) {
	aziendaDao.save(a);
	return "Azienda correctly persisted on Database!";
    }

    public Azienda FindAziendaById(Long id) {
	if (aziendaDao.existsById(id)) {
	    return aziendaDao.findById(id).get();
	} else {
	    throw new EntityNotFoundException("azienda with ID --> " + id + " doesn't exists on Database!");
	}
    }

    public List<Azienda> findAll() {
	return aziendaDao.findAll();
    }
}