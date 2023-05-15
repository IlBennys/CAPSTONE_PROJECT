package com.gestione.negozio.commerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gestione.negozio.commerce.model.Articolo;

@Repository
public interface ArticoloDao extends JpaRepository<Articolo, Long>, PagingAndSortingRepository<Articolo, Long> {
    Optional<Articolo> findById(Long id);

    // Page<Articolo> findAll(Pageable pageable);

    // ordine range del prezzo
    @Query("SELECT a FROM Articolo a WHERE a.prezzo BETWEEN ?1 AND ?2")
    Optional<List<Articolo>> getAllArticoliByPrezzo(String s1, String s2);

    // filtro per ordinare gli articoli in base al loro nome
    @Query("SELECT a FROM Articolo a WHERE a.nomeArticoli LIKE :name")
    Optional<List<Articolo>> getAllArticoliByNome(String name);

    // filtro per ordinare gli articoli in base al loro colore
    @Query("SELECT a FROM Articolo a WHERE a.descrizioneArticolo LIKE :name")
    Optional<List<Articolo>> getAllArticoliByColore(String name);

}
