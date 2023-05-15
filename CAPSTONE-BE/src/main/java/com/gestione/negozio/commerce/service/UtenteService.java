package com.gestione.negozio.commerce.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestione.negozio.auth.entity.User;
import com.gestione.negozio.commerce.model.Ordine;
import com.gestione.negozio.commerce.model.Utente;
import com.gestione.negozio.commerce.repository.UtenteDao;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UtenteService {
    @Autowired
    private UtenteDao utenteDao;
    @Autowired
    private OrdineService ordineService;

    @Autowired
    @Qualifier("FakeUtente")
    private ObjectProvider<Utente> objUtente;

    public Utente createUtente(User user) {
	Utente u = objUtente.getObject();
	List<Ordine> listaOrdini = ordineService.findAll();
	u.setUser(user);
	u.setOrdini(listaOrdini);
	utenteDao.save(u);
	return u;
    }

    public String postUtente(Utente u) {
	utenteDao.save(u);
	return "Utente correctly persisted on Database!";
    }

    public String updateUtente(Utente u) {
	if (utenteDao.existsById(u.getId())) {
	    utenteDao.save(u);
	    return "Utente correctly updated on Database";
	} else {
	    throw new EntityNotFoundException("Utente with ID --> " + u.getId() + " doesn't exists on Database!");
	}
    }

    public String deleteUtente(Utente u) {
	if (utenteDao.existsById(u.getId())) {
	    utenteDao.delete(u);
	    return "Utente correctly deleted from Database";
	} else {
	    throw new EntityNotFoundException("Utente with ID --> " + u.getId() + " doesn't exists on Database!");
	}
    }

    public String deleteUtente(Long id) {
	if (utenteDao.existsById(id)) {
	    utenteDao.deleteById(id);
	    return "Utente correctly deleted from Database";
	} else {
	    throw new EntityNotFoundException("Utente with ID --> " + id + " doesn't exists on Database!");
	}
    }

    public Utente FindUtenteById(Long id) {
	if (utenteDao.existsById(id)) {
	    return utenteDao.findById(id).get();
	} else {
	    throw new EntityNotFoundException("Utente with ID --> " + id + " doesn't exists on Database!");
	}
    }

    public List<Utente> findAll() {
	return utenteDao.findAll();
    }

    public Optional<List<Utente>> findAllByDataNascita(LocalDate l1, LocalDate l2) {
	return utenteDao.getAllUtentiOrderByDataNascita(l1, l2);
    }
}