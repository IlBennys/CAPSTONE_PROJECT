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
