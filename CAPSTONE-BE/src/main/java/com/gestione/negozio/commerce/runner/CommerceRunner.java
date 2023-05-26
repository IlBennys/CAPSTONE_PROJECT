package com.gestione.negozio.commerce.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.gestione.negozio.commerce.service.ArticoloService;
import com.gestione.negozio.commerce.service.AziendaService;
import com.gestione.negozio.commerce.service.CorriereService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CommerceRunner implements ApplicationRunner {

    @Autowired
    private ArticoloService articoloService;
    @Autowired
    private AziendaService aziendaService;

    @Autowired
    private CorriereService corriereService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
	if (corriereService.findAll().isEmpty()) {
	    for (int i = 0; i < 10; i++) {
		corriereService.createCorriere();
	    }
	    log.info("Corrieri creati!");
	}

	if (aziendaService.findAll().isEmpty()) {
	    for (int i = 0; i < 1; i++) {
		aziendaService.createAzienda();
	    }
	    log.info("Azienda creata!");
	}

	if (articoloService.findAll().isEmpty()) {
	    for (int i = 0; i < 1; i++) {
		articoloService.createArticolo1();
		articoloService.createArticolo2();
		articoloService.createArticolo3();
		articoloService.createArticolo4();
		articoloService.createArticolo5();
		articoloService.createArticolo6();
		articoloService.createArticolo7();
		articoloService.createArticolo8();
		articoloService.createArticolo9();
		articoloService.createArticolo10();
		articoloService.createArticolo11();
		articoloService.createArticolo12();
		articoloService.createArticolo13();
		articoloService.createArticolo14();
		articoloService.createArticolo15();
		articoloService.createArticolo16();
		articoloService.createArticolo17();
		articoloService.createArticolo18();
		articoloService.createArticolo19();
		articoloService.createArticolo20();

	    }
	    log.info("Articoli creati!");
	}

    }

}
