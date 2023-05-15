package com.gestione.negozio.commerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "articoli")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Articolo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeArticoli;
    private Double prezzo;
    private String descrizioneArticolo; // COLORE - MISURA ECC..
    private String img;
    private String brand; // NIKE- ADIDAS - JORDAN - PUMA ECC..
    private int quantita;

}
