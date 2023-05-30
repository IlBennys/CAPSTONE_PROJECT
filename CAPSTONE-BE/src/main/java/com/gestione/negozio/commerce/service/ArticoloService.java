package com.gestione.negozio.commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestione.negozio.commerce.model.Articolo;
import com.gestione.negozio.commerce.repository.ArticoloDao;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ArticoloService {
    // private Faker fake = Faker.instance(new Locale("it-IT"));
    @Autowired
    private ArticoloDao articoloDao;
    // @Autowired
    // private OrdineService ordineService;

    @Autowired
    @Qualifier("FakeArticolo1")
    private ObjectProvider<Articolo> objArticolo1;
    @Autowired
    @Qualifier("FakeArticolo2")
    private ObjectProvider<Articolo> objArticolo2;

    @Autowired

    @Qualifier("FakeArticolo3")
    private ObjectProvider<Articolo> objArticolo3;

    @Autowired

    @Qualifier("FakeArticolo4")
    private ObjectProvider<Articolo> objArticolo4;

    @Autowired

    @Qualifier("FakeArticolo5")
    private ObjectProvider<Articolo> objArticolo5;

    @Autowired

    @Qualifier("FakeArticolo6")
    private ObjectProvider<Articolo> objArticolo6;

    @Autowired

    @Qualifier("FakeArticolo7")
    private ObjectProvider<Articolo> objArticolo7;

    @Autowired

    @Qualifier("FakeArticolo8")
    private ObjectProvider<Articolo> objArticolo8;

    @Autowired

    @Qualifier("FakeArticolo9")
    private ObjectProvider<Articolo> objArticolo9;

    @Autowired

    @Qualifier("FakeArticolo10")
    private ObjectProvider<Articolo> objArticolo10;

    @Autowired

    @Qualifier("FakeArticolo11")
    private ObjectProvider<Articolo> objArticolo11;

    @Autowired

    @Qualifier("FakeArticolo12")
    private ObjectProvider<Articolo> objArticolo12;

    @Autowired

    @Qualifier("FakeArticolo13")
    private ObjectProvider<Articolo> objArticolo13;

    @Autowired

    @Qualifier("FakeArticolo14")
    private ObjectProvider<Articolo> objArticolo14;

    @Autowired

    @Qualifier("FakeArticolo15")
    private ObjectProvider<Articolo> objArticolo15;

    @Autowired

    @Qualifier("FakeArticolo16")
    private ObjectProvider<Articolo> objArticolo16;

    @Autowired

    @Qualifier("FakeArticolo17")
    private ObjectProvider<Articolo> objArticolo17;

    @Autowired

    @Qualifier("FakeArticolo18")
    private ObjectProvider<Articolo> objArticolo18;

    @Autowired

    @Qualifier("FakeArticolo19")
    private ObjectProvider<Articolo> objArticolo19;

    @Autowired

    @Qualifier("FakeArticolo20")
    private ObjectProvider<Articolo> objArticolo20;

    @Autowired

    @Qualifier("FakeArticolo21")
    private ObjectProvider<Articolo> objArticolo21;

    @Autowired

    @Qualifier("FakeArticolo22")
    private ObjectProvider<Articolo> objArticolo22;

    @Autowired

    @Qualifier("FakeArticolo23")
    private ObjectProvider<Articolo> objArticolo23;
    @Autowired

    @Qualifier("FakeArticolo24")
    private ObjectProvider<Articolo> objArticolo24;
    @Autowired

    @Qualifier("FakeArticolo25")
    private ObjectProvider<Articolo> objArticolo25;
    @Autowired

    @Qualifier("FakeArticolo26")
    private ObjectProvider<Articolo> objArticolo26;
    @Autowired

    @Qualifier("FakeArticolo27")
    private ObjectProvider<Articolo> objArticolo27;
    @Autowired

    @Qualifier("FakeArticolo28")
    private ObjectProvider<Articolo> objArticolo28;
    @Autowired

    @Qualifier("FakeArticolo29")
    private ObjectProvider<Articolo> objArticolo29;
    @Autowired

    @Qualifier("FakeArticolo30")
    private ObjectProvider<Articolo> objArticolo30;
    @Autowired

    @Qualifier("FakeArticolo31")
    private ObjectProvider<Articolo> objArticolo31;
    @Autowired

    @Qualifier("FakeArticolo32")
    private ObjectProvider<Articolo> objArticolo32;
    @Autowired

    @Qualifier("FakeArticolo33")
    private ObjectProvider<Articolo> objArticolo33;
    @Autowired

    @Qualifier("FakeArticolo34")
    private ObjectProvider<Articolo> objArticolo34;
    @Autowired

    @Qualifier("FakeArticolo35")
    private ObjectProvider<Articolo> objArticolo35;
    @Autowired

    @Qualifier("FakeArticolo36")
    private ObjectProvider<Articolo> objArticolo36;
    @Autowired

    @Qualifier("FakeArticolo37")
    private ObjectProvider<Articolo> objArticolo37;
    @Autowired

    @Qualifier("FakeArticolo38")
    private ObjectProvider<Articolo> objArticolo38;
    @Autowired

    @Qualifier("FakeArticolo39")
    private ObjectProvider<Articolo> objArticolo39;
    @Autowired

    @Qualifier("FakeArticolo40")
    private ObjectProvider<Articolo> objArticolo40;
    @Autowired

    @Qualifier("FakeArticolo41")
    private ObjectProvider<Articolo> objArticolo41;
    @Autowired

    @Qualifier("FakeArticolo42")
    private ObjectProvider<Articolo> objArticolo42;
    @Autowired

    @Qualifier("FakeArticolo43")
    private ObjectProvider<Articolo> objArticolo43;
    @Autowired

    @Qualifier("FakeArticolo44")
    private ObjectProvider<Articolo> objArticolo44;
    @Autowired

    @Qualifier("FakeArticolo45")
    private ObjectProvider<Articolo> objArticolo45;
    @Autowired

    @Qualifier("FakeArticolo46")
    private ObjectProvider<Articolo> objArticolo46;
    @Autowired

    @Qualifier("FakeArticolo47")
    private ObjectProvider<Articolo> objArticolo47;
    @Autowired

    @Qualifier("FakeArticolo48")
    private ObjectProvider<Articolo> objArticolo48;
    @Autowired

    @Qualifier("FakeArticolo49")
    private ObjectProvider<Articolo> objArticolo49;
    @Autowired

    @Qualifier("FakeArticolo50")
    private ObjectProvider<Articolo> objArticolo50;
    @Autowired

    @Qualifier("FakeArticolo51")
    private ObjectProvider<Articolo> objArticolo51;
    @Autowired

    @Qualifier("FakeArticolo52")
    private ObjectProvider<Articolo> objArticolo52;
    @Autowired

    @Qualifier("FakeArticolo53")
    private ObjectProvider<Articolo> objArticolo53;
    @Autowired

    @Qualifier("FakeArticolo54")
    private ObjectProvider<Articolo> objArticolo54;
    @Autowired

    @Qualifier("FakeArticolo55")
    private ObjectProvider<Articolo> objArticolo55;
    @Autowired

    @Qualifier("FakeArticolo56")
    private ObjectProvider<Articolo> objArticolo56;
    @Autowired

    @Qualifier("FakeArticolo57")
    private ObjectProvider<Articolo> objArticolo57;
    @Autowired

    @Qualifier("FakeArticolo58")
    private ObjectProvider<Articolo> objArticolo58;
    @Autowired

    @Qualifier("FakeArticolo59")
    private ObjectProvider<Articolo> objArticolo59;
    @Autowired

    @Qualifier("FakeArticolo60")
    private ObjectProvider<Articolo> objArticolo60;

    public void createArticolo1() {
	Articolo a = objArticolo1.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);

    }

    public void createArticolo2() {
	Articolo a = objArticolo2.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo3() {
	Articolo a = objArticolo3.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo4() {
	Articolo a = objArticolo4.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo5() {
	Articolo a = objArticolo5.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo6() {
	Articolo a = objArticolo6.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo7() {
	Articolo a = objArticolo7.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo8() {
	Articolo a = objArticolo8.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo9() {
	Articolo a = objArticolo9.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo10() {
	Articolo a = objArticolo10.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo11() {
	Articolo a = objArticolo11.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo12() {
	Articolo a = objArticolo12.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo13() {
	Articolo a = objArticolo13.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo14() {
	Articolo a = objArticolo14.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo15() {
	Articolo a = objArticolo15.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo16() {
	Articolo a = objArticolo16.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo17() {
	Articolo a = objArticolo17.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo18() {
	Articolo a = objArticolo18.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo19() {
	Articolo a = objArticolo19.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo20() {
	Articolo a = objArticolo20.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo21() {
	Articolo a = objArticolo21.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo22() {
	Articolo a = objArticolo22.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo23() {
	Articolo a = objArticolo23.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo24() {
	Articolo a = objArticolo24.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo25() {
	Articolo a = objArticolo25.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo26() {
	Articolo a = objArticolo26.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo27() {
	Articolo a = objArticolo27.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo28() {
	Articolo a = objArticolo28.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo29() {
	Articolo a = objArticolo29.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo30() {
	Articolo a = objArticolo30.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo31() {
	Articolo a = objArticolo31.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo32() {
	Articolo a = objArticolo32.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo33() {
	Articolo a = objArticolo33.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo34() {
	Articolo a = objArticolo34.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo35() {
	Articolo a = objArticolo35.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo36() {
	Articolo a = objArticolo36.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo37() {
	Articolo a = objArticolo37.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo38() {
	Articolo a = objArticolo38.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo39() {
	Articolo a = objArticolo39.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo40() {
	Articolo a = objArticolo40.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo41() {
	Articolo a = objArticolo41.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo42() {
	Articolo a = objArticolo42.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo43() {
	Articolo a = objArticolo43.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo44() {
	Articolo a = objArticolo44.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo45() {
	Articolo a = objArticolo45.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo46() {
	Articolo a = objArticolo46.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo47() {
	Articolo a = objArticolo47.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo48() {
	Articolo a = objArticolo48.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo49() {
	Articolo a = objArticolo49.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo50() {
	Articolo a = objArticolo50.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo51() {
	Articolo a = objArticolo51.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo52() {
	Articolo a = objArticolo52.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo53() {
	Articolo a = objArticolo53.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo54() {
	Articolo a = objArticolo54.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo55() {
	Articolo a = objArticolo55.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo56() {
	Articolo a = objArticolo56.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo57() {
	Articolo a = objArticolo57.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo58() {
	Articolo a = objArticolo58.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo59() {
	Articolo a = objArticolo59.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

    public void createArticolo60() {
	Articolo a = objArticolo60.getObject();
	/*
	 * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
	 * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
	 * listaOrdini.get(random); a.setOrdine(o);
	 */
	articoloDao.save(a);
    }

//------------------------------------------------------------------------------------------------------
    public void insertArticolo(Articolo a) {
	articoloDao.save(a);
    }

    public String updateArticolo(Articolo a) {
	if (articoloDao.existsById(a.getId())) {
	    articoloDao.save(a);
	    return "Articolo correctly updated on Database";
	} else {
	    throw new EntityNotFoundException("Articolo with ID --> " + a.getId() + " doesn't exists on Database!");
	}
    }
    /*
     * public void createArticolo() { Articolo a = objArticolo.getObject();
     * List<Ordine> listaOrdini = ordineService.findAll(); Integer random =
     * fake.number().numberBetween(0, listaOrdini.size() - 1); Ordine o =
     * listaOrdini.get(random); a.setOrdine(o); articoloDao.save(a); }
     */

    public String postArticolo(Articolo a) {
	articoloDao.save(a);
	return "Articolo correctly persisted on Database!";
    }

    public String deleteArticolo(Articolo a) {
	if (articoloDao.existsById(a.getId())) {
	    articoloDao.delete(a);
	    return "Articolo correctly deleted from Database";
	} else {
	    throw new EntityNotFoundException("Articolo with ID --> " + a.getId() + " doesn't exists on Database!");
	}
    }

    public String deleteArticolo(Long id) {
	if (articoloDao.existsById(id)) {
	    articoloDao.deleteById(id);
	    return "Articolo correctly deleted from Database";
	} else {
	    throw new EntityNotFoundException("Articolo with ID --> " + id + " doesn't exists on Database!");
	}
    }

    public Articolo FindArticoloById(Long id) {
	if (articoloDao.existsById(id)) {
	    return articoloDao.findById(id).get();
	} else {
	    throw new EntityNotFoundException("Articolo with ID --> " + id + " doesn't exists on Database!");
	}
    }

    public List<Articolo> findAll() {
	return articoloDao.findAll();
    }

    public Optional<List<Articolo>> findAllByPrezzo(String s1, String s2) {
	return articoloDao.getAllArticoliByPrezzo(s1, s2);
    }

    public Optional<List<Articolo>> findAllByName(String name) {
	return articoloDao.getAllArticoliByNome(name);
    }

    public Optional<List<Articolo>> findAllByColor(String name) {
	return articoloDao.getAllArticoliByColore(name);
    }

}
