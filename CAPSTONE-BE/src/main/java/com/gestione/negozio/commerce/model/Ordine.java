package com.gestione.negozio.commerce.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ordini")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroOrdine; // 4 CIFRE
    private String riepilogoOrdine; // IL TUO PACCO SI TROVA PRESSO...
    private LocalDate dataConsegna; // DATA DI CONSEGNA DEL PACCO
    private LocalDate dataOrdine; // DATA DI PARTENZA DEL PACCO
    @Enumerated(EnumType.STRING)
    private StatoOrdine statoOrdine;

    @OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE,
	    CascadeType.REFRESH })
    @JsonIgnoreProperties({ "ordine" })
    private Fattura fattura;

    // AZIENDA TABELLA A PARTE
    @ManyToOne
    @JoinColumn(name = "azienda_id")
    @JsonIgnoreProperties("ordini")
    private Azienda azienda;

    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH })
    private List<Articolo> articolo;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

}
