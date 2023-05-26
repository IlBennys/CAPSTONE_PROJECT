package com.gestione.negozio.commerce.configuration;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gestione.negozio.commerce.model.Articolo;
import com.gestione.negozio.commerce.model.Azienda;
import com.gestione.negozio.commerce.model.Carrello;
import com.gestione.negozio.commerce.model.Corriere;
import com.gestione.negozio.commerce.model.Ordine;
import com.gestione.negozio.commerce.model.StatoOrdine;
import com.gestione.negozio.commerce.model.TipoCorriere;
import com.github.javafaker.Faker;

@Configuration
public class CommerceConfiguration {

    private Faker fake = Faker.instance(new Locale("it-IT"));

    @Bean("FakeArticolo1")
    @Scope("prototype")
    public Articolo Articolo1() {
	return Articolo.builder().nomeArticoli("AIR FORCE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("VERDE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1111309410422226964/png-clipart-sneakers-skate-shoe-nike-dunk-nike-skateboarding-nike-dunk-white-outdoor-shoe-thumbnail_1_-removebg-preview_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo2")
    @Scope("prototype")
    public Articolo Articolo2() {
	return Articolo.builder().nomeArticoli("HUARACHE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1111310008815198290/png-transparent-shoe-sneakers-sportswear-nike-air-jordan-nike-white-outdoor-shoe-sneakers-thumbnail_1_-removebg-preview_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo3")
    @Scope("prototype")
    public Articolo Articolo3() {
	return Articolo.builder().nomeArticoli("FREE AIR FORCE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1111310865170436186/png-transparent-nike-free-nike-air-max-sneakers-shoe-red-shoes-thumbnail_1_-removebg-preview_1_-removebg-preview_1.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo4")
    @Scope("prototype")
    public Articolo Articolo4() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO E NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110956620936134716/png-transparent-air-jordan-nike-air-max-shoe-sneakers-nike-white-outdoor-shoe-sneakers-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo5")
    @Scope("prototype")
    public Articolo Articolo5() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1111312530799857744/png-transparent-nike-air-max-97-sneakers-shoe-nike-white-outdoor-shoe-sneakers-thumbnail_1_-removebg-preview_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo6")
    @Scope("prototype")
    public Articolo Articolo6() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO E BIANCO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110979596620402841/png-transparent-nike-air-max-sneakers-nike-free-shoe-tenis-shoes-white-outdoor-shoe-running-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo7")
    @Scope("prototype")
    public Articolo Articolo7() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("VERDE ACQUA").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110980004965257347/png-transparent-sneakers-shoe-nike-basketball-blue-basketball-shoes-white-sport-basketballschuh-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo8")
    @Scope("prototype")
    public Articolo Articolo8() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO E NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110980149849108571/png-transparent-nike-air-max-nike-free-air-force-shoe-nike-white-outdoor-shoe-sneakers-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo9")
    @Scope("prototype")
    public Articolo Articolo9() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU E NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110980333609951282/png-transparent-air-jordan-shoe-nike-sneakers-clothing-jordan-blue-white-outdoor-shoe-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo10")
    @Scope("prototype")
    public Articolo Articolo10() {
	return Articolo.builder().nomeArticoli("VANDAL HIGHT SUPREME")
		.prezzo((double) fake.number().numberBetween(50, 200)).descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110980474261741628/png-transparent-sneakers-nike-mag-nike-air-max-shoe-nike-white-outdoor-shoe-sneakers-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo11")
    @Scope("prototype")
    public Articolo Articolo11() {
	return Articolo.builder().nomeArticoli("NIKE DA PASSEGGIO")
		.prezzo((double) fake.number().numberBetween(50, 200)).descrizioneArticolo("BIANCO E ROSSO")
		.brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110980665798819911/png-transparent-sneakers-nike-cortez-shoe-white-nike-white-leather-outdoor-shoe-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo12")
    @Scope("prototype")
    public Articolo Articolo12() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO LOGO ARGENTO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110980828923707412/png-transparent-air-force-1-nike-air-max-shoe-air-jordan-nike-white-orange-sneakers-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo13")
    @Scope("prototype")
    public Articolo Articolo13() {
	return Articolo.builder().nomeArticoli("NIKE DA CALCIO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GOLD").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110981190602727454/png-transparent-european-golden-shoe-football-boot-cleat-nike-football-football-boot-outdoor-shoe-sneakers-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo14")
    @Scope("prototype")
    public Articolo Articolo14() {
	return Articolo.builder().nomeArticoli("AIR FORCE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110981345439662141/png-transparent-nike-air-max-air-force-1-shoe-sneakers-nike-white-leather-outdoor-shoe-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo15")
    @Scope("prototype")
    public Articolo Articolo15() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GIALLO NERO E ROSSO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110981755244138506/png-transparent-sneakers-nike-basketball-shoe-sport-nike-sport-orange-outdoor-shoe-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo16")
    @Scope("prototype")
    public Articolo Articolo16() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ARANCIONE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110981883023593472/png-transparent-nike-air-max-air-force-1-air-jordan-shoe-nike-white-orange-sneakers-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo17")
    @Scope("prototype")
    public Articolo Articolo17() {
	return Articolo.builder().nomeArticoli("NIKE DA GINNASTICA")
		.prezzo((double) fake.number().numberBetween(50, 200)).descrizioneArticolo("ROSA E NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110982083641348196/png-transparent-sneakers-nike-free-shoe-adidas-pink-2018-blue-white-outdoor-shoe-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo18")
    @Scope("prototype")
    public Articolo Articolo18() {
	return Articolo.builder().nomeArticoli("AIR MAX").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110982229137576006/png-transparent-nike-air-max-97-air-force-1-shoe-sneakers-nike-white-outdoor-shoe-sneakers-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo19")
    @Scope("prototype")
    public Articolo Articolo19() {
	return Articolo.builder().nomeArticoli("NIKE ZOOM").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1110982504854331442/png-transparent-white-and-gray-nike-zoom-sneaker-nike-free-air-force-sneakers-shoe-men-shoes-white-outdoor-shoe-navy-blue-thumbnail_1_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo20")
    @Scope("prototype")
    public Articolo Articolo20() {
	return Articolo.builder().nomeArticoli("AIR JORDAN").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1062713292226830409/1111313058485244055/png-transparent-air-force-nike-air-max-shoe-sneakers-men-shoes-blue-white-outdoor-shoe-thumbnail_1_-removebg-preview.png")
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

    @SuppressWarnings("deprecation")
    @Bean("FakeOrdine")
    @Scope("prototype")
    public Ordine fakeOrdine() {
	Date to = new Date();
	int sum = fake.number().numberBetween(0, 4);
	return Ordine.builder().numeroOrdine(fake.number().numberBetween(1000, 10000))
		.riepilogoOrdine(statoRiepilogoOrdine(sum))
		.dataOrdine(LocalDate.of(to.getYear() + 1900, to.getMonth() + 1, to.getDate()))
		.dataConsegna(LocalDate.of(to.getYear() + 1900, to.getMonth() + 1, to.getDate() + 3))
		.statoOrdine(getStatoOrdine(sum)).prezzoConsegna(2.99).build();
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

    @SuppressWarnings("deprecation")
    private String statoRiepilogoOrdine(int i) {
	Date to = new Date();
	String type = null;
	switch (getStatoOrdine(i)) {
	case ANNULLATO -> type = "L'ordine è stato annullato!";
	case SPEDITO -> type = "L'ordine è andato a buon fine! Sarà consegnato in data "
		+ LocalDate.of(to.getYear() + 1900, to.getMonth() + 1, to.getDate() + 3);
	case IN_CONSEGNA -> type = "Il tuo ordine si trova presso: " + "LAT : " + fake.address().latitude() + "° , "
		+ "LON: " + fake.address().longitude() + " °";
	case CONSEGNATO -> type = "Il tuo ordine è stato consegnato correttamente!";

	}
	return type;
    }

    @Bean("FakeCarrello")
    @Scope("prototype")
    public Carrello fakeCarrello() {
	return Carrello.builder().build();
    }

}
