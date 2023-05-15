package com.gestione.negozio.commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestione.negozio.commerce.model.Articolo;
import com.gestione.negozio.commerce.service.ArticoloService;

@RestController
@RequestMapping("/api/articolo")
public class ArticoloController {

    @Autowired
    ArticoloService articoloService;

    @GetMapping
    public ResponseEntity<?> findAllArticolo() {
	return new ResponseEntity<>(articoloService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/prezzo/{s1}&{s2}")
    public ResponseEntity<?> findAllArticoloByPrezzo(@PathVariable String s1, @PathVariable String s2) {
	return new ResponseEntity<>(articoloService.findAllByPrezzo(s1, s2), HttpStatus.FOUND);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> findAllArticoloByName(@PathVariable String name) {
	return new ResponseEntity<>(articoloService.findAllByName(name), HttpStatus.FOUND);
    }

    @GetMapping("/colors/{name}")
    public ResponseEntity<?> findAllArticoloByColor(@PathVariable String name) {
	return new ResponseEntity<>(articoloService.findAllByColor(name), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findArticoloById(@PathVariable Long id) {
	return new ResponseEntity<>(articoloService.FindArticoloById(id), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<?> addNewArticolo(@RequestBody Articolo a) {
	return new ResponseEntity<String>(articoloService.postArticolo(a), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateArticolo(@RequestBody Articolo a) {
	return new ResponseEntity<String>(articoloService.updateArticolo(a), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteArticolo(@RequestBody Articolo a) {
	return new ResponseEntity<>(articoloService.deleteArticolo(a), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteArticolo(@PathVariable Long id) {
	return new ResponseEntity<>(articoloService.deleteArticolo(id), HttpStatus.OK);
    }

}
