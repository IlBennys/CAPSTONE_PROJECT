package com.gestione.negozio.commerce.configuration;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gestione.negozio.commerce.model.Articolo;
import com.gestione.negozio.commerce.model.Azienda;
import com.gestione.negozio.commerce.model.Corriere;
import com.gestione.negozio.commerce.model.Fattura;
import com.gestione.negozio.commerce.model.Ordine;
import com.gestione.negozio.commerce.model.StatoOrdine;
import com.gestione.negozio.commerce.model.TipoCorriere;
import com.gestione.negozio.commerce.model.Utente;
import com.github.javafaker.Faker;

@Configuration
public class CommerceConfiguration {

    private Faker fake = Faker.instance(new Locale("it-IT"));

    @Bean("FakeArticolo1")
    @Scope("prototype")
    public Articolo Articolo1() {
	return Articolo.builder().nomeArticoli("AIR FORCE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("VERDE").brand("NIKE")
		.img("https://e7.pngegg.com/pngimages/415/691/png-clipart-sneakers-skate-shoe-nike-dunk-nike-skateboarding-nike-dunk-white-outdoor-shoe-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo2")
    @Scope("prototype")
    public Articolo Articolo2() {
	return Articolo.builder().nomeArticoli("AIR FORCE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://www.google.com/url?sa=i&url=https%3A%2F%2Fit.cleanpng.com%2Fpng-p9fy4s%2F&psig=AOvVaw2evZ-zFBgrabkhh05vAvMu&ust=1683820289750000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC_icSN6_4CFQAAAAAdAAAAABAN")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo3")
    @Scope("prototype")
    public Articolo Articolo3() {
	return Articolo.builder().nomeArticoli("FREE AIR FORCE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO E NERO").brand("NIKE")
		.img("https://www.google.com/url?sa=i&url=https%3A%2F%2Fit.cleanpng.com%2Fpng-p9fy4s%2F&psig=AOvVaw2evZ-zFBgrabkhh05vAvMu&ust=1683820289750000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC_icSN6_4CFQAAAAAdAAAAABAN")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo4")
    @Scope("prototype")
    public Articolo Articolo4() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO E NERO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/732/999/png-transparent-air-jordan-nike-air-max-shoe-sneakers-nike-white-outdoor-shoe-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo5")
    @Scope("prototype")
    public Articolo Articolo5() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/326/173/png-transparent-nike-air-max-97-sneakers-shoe-nike-white-outdoor-shoe-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo6")
    @Scope("prototype")
    public Articolo Articolo6() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO E BIANCO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/30/966/png-transparent-nike-air-max-sneakers-nike-free-shoe-tenis-shoes-white-outdoor-shoe-running-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo7")
    @Scope("prototype")
    public Articolo Articolo7() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("VERDE ACQUA").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/494/400/png-transparent-sneakers-shoe-nike-basketball-blue-basketball-shoes-white-sport-basketballschuh-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo8")
    @Scope("prototype")
    public Articolo Articolo8() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO E NERO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/483/759/png-transparent-nike-air-max-nike-free-air-force-shoe-nike-white-outdoor-shoe-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo9")
    @Scope("prototype")
    public Articolo Articolo9() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU E NERO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/594/312/png-transparent-air-jordan-shoe-nike-sneakers-clothing-jordan-blue-white-outdoor-shoe-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo10")
    @Scope("prototype")
    public Articolo Articolo10() {
	return Articolo.builder().nomeArticoli("VANDAL HIGHT SUPREME")
		.prezzo((double) fake.number().numberBetween(50, 200)).descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/279/138/png-transparent-sneakers-nike-mag-nike-air-max-shoe-nike-white-outdoor-shoe-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo11")
    @Scope("prototype")
    public Articolo Articolo11() {
	return Articolo.builder().nomeArticoli("DA PASSEGGIO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO E ROSSO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/844/595/png-transparent-sneakers-nike-cortez-shoe-white-nike-white-leather-outdoor-shoe-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo12")
    @Scope("prototype")
    public Articolo Articolo12() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO CON LOGO ARGENTO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/820/630/png-transparent-air-force-1-nike-air-max-shoe-air-jordan-nike-white-orange-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo13")
    @Scope("prototype")
    public Articolo Articolo13() {
	return Articolo.builder().nomeArticoli("DA CALCIO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GOLD").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/970/779/png-transparent-european-golden-shoe-football-boot-cleat-nike-football-football-boot-outdoor-shoe-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo14")
    @Scope("prototype")
    public Articolo Articolo14() {
	return Articolo.builder().nomeArticoli("AIR FORCE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/642/571/png-transparent-nike-air-max-air-force-1-shoe-sneakers-nike-white-leather-outdoor-shoe-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo15")
    @Scope("prototype")
    public Articolo Articolo15() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GIALLO NERO E ROSSO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/450/972/png-transparent-sneakers-nike-basketball-shoe-sport-nike-sport-orange-outdoor-shoe-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo16")
    @Scope("prototype")
    public Articolo Articolo16() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ARANCIONE").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/89/158/png-transparent-nike-air-max-air-force-1-air-jordan-shoe-nike-white-orange-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo17")
    @Scope("prototype")
    public Articolo Articolo17() {
	return Articolo.builder().nomeArticoli("DA GINNASTICA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSA E NERO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/957/887/png-transparent-sneakers-nike-free-shoe-adidas-pink-2018-blue-white-outdoor-shoe-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo18")
    @Scope("prototype")
    public Articolo Articolo18() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/787/848/png-transparent-nike-air-max-97-air-force-1-shoe-sneakers-nike-white-outdoor-shoe-sneakers-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo19")
    @Scope("prototype")
    public Articolo Articolo19() {
	return Articolo.builder().nomeArticoli("ZOOM").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/395/413/png-transparent-white-and-gray-nike-zoom-sneaker-nike-free-air-force-sneakers-shoe-men-shoes-white-outdoor-shoe-navy-blue-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo20")
    @Scope("prototype")
    public Articolo Articolo20() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO E VIOLA").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/325/240/png-transparent-sneakers-nike-air-max-basketball-shoe-nike-purple-white-sport-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo")
    @Scope("prototype")
    public Articolo Articolo() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO E VIOLA").brand("NIKE")
		.img("https://w7.pngwing.com/pngs/325/240/png-transparent-sneakers-nike-air-max-basketball-shoe-nike-purple-white-sport-thumbnail.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

//----------------------------------------------------------------------------------------------------
    @Bean("FakeAzienda")
    @Scope("prototype")
    public Azienda fakeAzienda() {
	Azienda a = new Azienda();
	return a;
    }

    @Bean("FakeCorriere")
    @Scope("prototype")
    public Corriere fakeCorriere() {
	return Corriere.builder().corriere(getCorriere(fake.number().numberBetween(0, 3))).build();
    }

    private TipoCorriere getCorriere(int random) {
	TipoCorriere type = null;
	switch (random) {
	case 0 -> type = TipoCorriere.DHL;
	case 1 -> type = TipoCorriere.GLS;
	case 2 -> type = TipoCorriere.UPS;
	}
	return type;
    }

    @Bean("FakeOrdine")
    @Scope("prototype")
    public Ordine fakeOrdine() {
	Date to = new Date();
	return Ordine.builder().numeroOrdine(fake.number().numberBetween(1000, 10000))
		.riepilogoOrdine("IL TUO PACCO SI TROVA PRESSO:   " + "LAT: " + fake.address().latitude() + "°" + ", "
			+ "LON: " + fake.address().longitude() + "°")
		.dataOrdine(LocalDate.of(to.getYear(), to.getMonth(), to.getDate())) // 00 PRIMA DELLA DATA
		.dataConsegna(LocalDate.of(to.getHours(), to.getMonth(), to.getDate() + 3)) // 01 PRIMA DELLA DATA
		.statoOrdine(getStatoOrdine(fake.number().numberBetween(0, 4))).build();
    }

    private StatoOrdine getStatoOrdine(int random) {
	StatoOrdine type = null;
	switch (random) {
	case 0 -> type = StatoOrdine.ANNULLATO;
	case 1 -> type = StatoOrdine.CONSEGNATO;
	case 2 -> type = StatoOrdine.IN_CONSEGNA;
	case 3 -> type = StatoOrdine.SPEDITO;
	}
	return type;
    }

    @Bean("FakeFattura")
    @Scope("prototype")
    public Fattura fakeFattura() {
	// Articolo a = a.getPrezzo("");
	return Fattura.builder().quantitaArticolo(fake.number().numberBetween(1, 10))
		.importoTotale((double) fake.number().numberBetween(55, 400)).prezzoConsegna("€ " + 2.99).build();
    }

    @Bean("FakeUtente")
    @Scope("prototype")
    public Utente fakeUtente() {
	Date from = new Date(100, 0, 1); // aggiunge 1900 all'anno
	Date to = new Date();
	Date insertDate = fake.date().between(from, to);
	return Utente.builder().indirizzo(fake.address().streetAddress())
		.dataNascita(LocalDate.of(insertDate.getYear() + 1900, insertDate.getMonth() + 1, insertDate.getDate()))
		.numeroTelefono(fake.phoneNumber().cellPhone()).build();
    }

}
