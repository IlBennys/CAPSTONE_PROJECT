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
		articoloService.createArticolo21();
		articoloService.createArticolo22();
		articoloService.createArticolo23();
		articoloService.createArticolo24();
		articoloService.createArticolo25();
		articoloService.createArticolo26();
		articoloService.createArticolo27();
		articoloService.createArticolo28();
		articoloService.createArticolo29();
		articoloService.createArticolo30();
		articoloService.createArticolo31();
		articoloService.createArticolo32();
		articoloService.createArticolo33();
		articoloService.createArticolo34();
		articoloService.createArticolo35();
		articoloService.createArticolo36();
		articoloService.createArticolo37();
		articoloService.createArticolo38();
		articoloService.createArticolo39();
		articoloService.createArticolo40();
		articoloService.createArticolo41();
		articoloService.createArticolo42();
		articoloService.createArticolo43();
		articoloService.createArticolo44();
		articoloService.createArticolo45();
		articoloService.createArticolo46();
		articoloService.createArticolo47();
		articoloService.createArticolo48();
		articoloService.createArticolo49();
		articoloService.createArticolo50();
		articoloService.createArticolo51();
		articoloService.createArticolo52();
		articoloService.createArticolo53();
		articoloService.createArticolo54();
		articoloService.createArticolo55();
		articoloService.createArticolo56();
		articoloService.createArticolo57();
		articoloService.createArticolo58();
		articoloService.createArticolo59();
		articoloService.createArticolo60();

	    }
	    log.info("Articoli creati!");
	}

    }

}
