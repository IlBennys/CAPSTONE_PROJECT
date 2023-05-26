package com.gestione.negozio.commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestione.negozio.commerce.model.Azienda;
import com.gestione.negozio.commerce.service.AziendaService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/azienda")
public class AziendaController {

    @Autowired
    AziendaService aziendaService;

    @GetMapping
    public ResponseEntity<?> findAllAzienda() {
	return new ResponseEntity<>(aziendaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findaziendaById(@PathVariable Long id) {
	return new ResponseEntity<>(aziendaService.FindAziendaById(id), HttpStatus.OK);
    }

    // NON SI POSSONO AGGIUNGERE NUOVE AZIENDE
    @PostMapping
    public ResponseEntity<?> addNewazienda(@RequestBody Azienda a) {
	return new ResponseEntity<String>(aziendaService.postAzienda(a), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateazienda(@RequestBody Azienda a) {
	return new ResponseEntity<String>(aziendaService.updateAzienda(a), HttpStatus.OK);
    }

    @DeleteMapping // NON SI POSSONO ELIMINARE AZIENDE
    public ResponseEntity<?> deleteazienda(@RequestBody Azienda a) {
	return new ResponseEntity<>(aziendaService.deleteAzienda(a), HttpStatus.OK);
    }

    @DeleteMapping("/{id}") // NON SI POSSONO ELIMINARE AZIENDE
    public ResponseEntity<?> deleteazienda(@PathVariable Long id) {
	return new ResponseEntity<>(aziendaService.deleteAzienda(id), HttpStatus.OK);
    }

}
