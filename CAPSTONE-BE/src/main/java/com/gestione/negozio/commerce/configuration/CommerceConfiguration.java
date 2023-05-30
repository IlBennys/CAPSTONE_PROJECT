package com.gestione.negozio.commerce.configuration;

import java.time.LocalDate;
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

    // ------------------------------------------------SCARPE----------------------------------------------

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

//------------------------------------------------FELPE----------------------------------------------
    @Bean("FakeArticolo21")
    @Scope("prototype")
    public Articolo Articolo21() {
	return Articolo.builder().nomeArticoli("GIACCA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113129741487181834/kisspng-hoodie-nike-jacket-t-shirt-clothing-5b9a4b0ec25408.992834561536838414796-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo22")

    @Scope("prototype")
    public Articolo Articolo22() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113139376336150678/ODA0MzQ2LTA2Mw___1_1620916589-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo23")

    @Scope("prototype")
    public Articolo Articolo23() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113139940532944986/download-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo24")

    @Scope("prototype")
    public Articolo Articolo24() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO E NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113154614108377270/png-clipart-nike-air-full-zip-hoodie-boys-nike-air-full-zip-hoodie-boys-air-jordan-clothing-nike-adidas-hoodie-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo25")

    @Scope("prototype")
    public Articolo Articolo25() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO E NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113154998101086278/felpa-zip-e-cappuccio-nike-sportswear-tech-fleece-multicolor-uomo-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo26")

    @Scope("prototype")
    public Articolo Articolo26() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113155278909755462/BV4124-677-PHSFH001-1000-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo27")

    @Scope("prototype")
    public Articolo Articolo27() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113155775901220944/nike-felpa-m-nsw-hoodie-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo28")

    @Scope("prototype")
    public Articolo Articolo28() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE X BLM")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113156063416549497/NKDK-00A-PTB-0LJ_FF1-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo29")

    @Scope("prototype")
    public Articolo Articolo29() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("VERDE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113156761348747264/felpa-nike-club-fleece-olive-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo30")

    @Scope("prototype")
    public Articolo Articolo30() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO E NERO").brand("NIKE X JORDAN")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113156950914502726/png-clipart-hoodie-air-jordan-jacket-nike-hoodie-hoodie-black-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo31")

    @Scope("prototype")
    public Articolo Articolo31() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO E GRIGIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113157238710870107/felpa-zip-e-cappuccio-nike-sportswear-tech-fleece-bianco-beige-uomo-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo32")

    @Scope("prototype")
    public Articolo Articolo32() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("VERDEACQUA").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113157611446079498/felpa-leggera-girocollo-uomo-sportswear-trend-fleece-crew-malachite-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo33")

    @Scope("prototype")
    public Articolo Articolo33() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU NOTTE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113158017224020030/png-clipart-hoodie-nike-air-force-jacket-polar-fleece-nike-hoodies-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo34")

    @Scope("prototype")
    public Articolo Articolo34() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113158306354184232/felpa-girocollo-grigio-chiaro-nike-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo35")

    @Scope("prototype")
    public Articolo Articolo35() {
	return Articolo.builder().nomeArticoli("COMPLETO DI TUTA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU E ARANCIONE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113158981368684554/felpa-nike-club-fleece-olive-removebg-preview_1.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo36")

    @Scope("prototype")
    public Articolo Articolo36() {
	return Articolo.builder().nomeArticoli("COMPLETO DI TUTA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSA").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113159312215396423/P23---nike---DX5071623-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo37")

    @Scope("prototype")
    public Articolo Articolo37() {
	return Articolo.builder().nomeArticoli("COMPLETO DI TUTA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("VERDE PISTACCHIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113160637133115402/felpa-pullover-con-cappuccio-sportswear-club-fleece-tz1kGP-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo38")

    @Scope("prototype")
    public Articolo Articolo38() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ARANCIONE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113161084652769322/s-l500-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo39")

    @Scope("prototype")
    public Articolo Articolo39() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GIALLO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113161856895430656/s-l1600-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo40")

    @Scope("prototype")
    public Articolo Articolo40() {
	return Articolo.builder().nomeArticoli("FELPA").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO E GIALLO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113162258042867853/Nike-Felpa-c-cappuccio-Nike-Air-Donna-Art-CU5442-011-Nero-Giallo-Fluo--removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    // ------------------------------------------------CAPPELLI----------------------------------------------

    @Bean("FakeArticolo41")

    @Scope("prototype")
    public Articolo Articolo41() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113162535336681503/cappello-da-golf-dri-fit-legacy91-HV7sVp-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo42")

    @Scope("prototype")
    public Articolo Articolo42() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113163036430184498/cappello-sportswear-6Tp3RW-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo43")

    @Scope("prototype")
    public Articolo Articolo43() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113163214402883604/cappello-regolabile-pro-hH1h36-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo44")

    @Scope("prototype")
    public Articolo Articolo44() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113163451288784926/png-clipart-air-force-1-baseball-cap-nike-hat-baseball-cap-white-hat-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo45")

    @Scope("prototype")
    public Articolo Articolo45() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113163590376099951/cappello-sportswear-heritage-86-bcTRld-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo46")

    @Scope("prototype")
    public Articolo Articolo46() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113163848258687028/cappello-regolabile-heritage86-QpVFhK-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo47")

    @Scope("prototype")
    public Articolo Articolo47() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113163989715791872/cappello-regolabile-sportswear-heritage86-GhHJFR-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo48")

    @Scope("prototype")
    public Articolo Articolo48() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU E ARANCIONE").brand("NIKE X PARIS")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113164501735440434/nike-cappello-paris-saint-germain-adulto-unisex-916574-410-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo49")

    @Scope("prototype")
    public Articolo Articolo49() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ARANCIONE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113164981777735790/images-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo50")

    @Scope("prototype")
    public Articolo Articolo50() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("MILITARE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113165173029621881/P22---nike---DC3996222-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo51")

    @Scope("prototype")
    public Articolo Articolo51() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSA").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113165444921180280/nike-cappello-sportswear-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo52")

    @Scope("prototype")
    public Articolo Articolo52() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113165613620281454/2ec48ae2-8644-414c-89a2-a397dffdb388__L-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo53")

    @Scope("prototype")
    public Articolo Articolo53() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE X SB")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113165821791961148/s-l1600-removebg-preview_1.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo54")

    @Scope("prototype")
    public Articolo Articolo54() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("MARRONE").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113166067511083078/51oGn2hF4AL._AC_SR175_263_QL70_-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo55")

    @Scope("prototype")
    public Articolo Articolo55() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BLU").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113166289809190962/cappello-snapback-air-true-eos-royal-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo56")

    @Scope("prototype")
    public Articolo Articolo56() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSSO").brand("NIKE X JORDAN")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113166602670714900/cappello-jordan-jumpman-classic99-metal-lVhFGK-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo57")

    @Scope("prototype")
    public Articolo Articolo57() {
	return Articolo.builder().nomeArticoli("CAPPELLO").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("BIANCO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113166803603038258/nike-cappello-court-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo58")

    @Scope("prototype")
    public Articolo Articolo58() {
	return Articolo.builder().nomeArticoli("CAPPELLO DA NEVE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("NERO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113167031676706966/kisspng-beanie-nike-skateboarding-knit-cap-hat-nike-sb-surplus-beanie-photo-blueobsidian-5b6d9973ba7006.5935342015339093637637-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo59")

    @Scope("prototype")
    public Articolo Articolo59() {
	return Articolo.builder().nomeArticoli("CAPPELLO DA NEVE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("GRIGIO").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113167191827812502/kisspng-knit-cap-nike-skateboarding-hat-5b1002b77665b7.118007341527775927485-removebg-preview.png")
		.quantita(fake.number().numberBetween(5, 100)).build();
    }

    @Bean("FakeArticolo60")

    @Scope("prototype")
    public Articolo Articolo60() {
	return Articolo.builder().nomeArticoli("CAPPELLO DA NEVE").prezzo((double) fake.number().numberBetween(50, 200))
		.descrizioneArticolo("ROSA").brand("NIKE")
		.img("https://cdn.discordapp.com/attachments/1054326724164337695/1113167480244928623/berretto-sportswear-utility-SmHBDm-removebg-preview.png")
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
	int sum = fake.number().numberBetween(0, 4);
	LocalDate currentDate = LocalDate.now();
	LocalDate consegnaDate = currentDate.plusDays(3);
	return Ordine.builder().numeroOrdine(fake.number().numberBetween(1000, 10000))
		.riepilogoOrdine(statoRiepilogoOrdine(sum)).dataOrdine(currentDate).dataConsegna(consegnaDate)
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

    private String statoRiepilogoOrdine(int i) {
	String type = null;
	switch (getStatoOrdine(i)) {
	case ANNULLATO -> type = "L'ordine è stato annullato!";
	case SPEDITO -> type = "L'ordine è andato a buon fine! Sarà consegnato in data " + LocalDate.now().plusDays(3);
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
