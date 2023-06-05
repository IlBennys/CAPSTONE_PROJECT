package com.gestione.negozio.commerce.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "azienda")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Azienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeAzienda = "ENERGY SHOES";
    private Long partitaIva = 06524670632l;
    private Long codiceFiscale = 06524670632l;
    private String pec = "energy.shoes@legalmail.it";
    private String citta = "Palermo, Zona Industriale N.71";

    @OneToMany
    private List<Corriere> lista_corrieri;

    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY, cascade = { CascadeType.MERGE, CascadeType.REMOVE,
	    CascadeType.REFRESH })
    @JsonIgnoreProperties({ "articoli", "azienda" })
    private List<Ordine> ordini;
}
