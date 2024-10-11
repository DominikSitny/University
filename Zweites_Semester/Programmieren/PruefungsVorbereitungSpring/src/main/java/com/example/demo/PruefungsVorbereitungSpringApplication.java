package com.example.demo;

import java.awt.EventQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import de.Auto.Auto;
import de.Auto.ViewUebersicht;
import de.Verwaltung.Verwaltung;

@SpringBootApplication
public class PruefungsVorbereitungSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PruefungsVorbereitungSpringApplication.class, args);
		ConfigurableApplicationContext context = new SpringApplicationBuilder(PruefungsVorbereitungSpringApplication.class).headless(false).run(args);
		ViewUebersicht view = context.getBean(ViewUebersicht.class);
		
	/*	Auto car1 = new Auto();
		car1.setMarke("Audi");
		car1.setBezeichnung("A4");
		
		Auto car2 = new Auto();
		car2.setMarke("BMW");
		car2.setBezeichnung("3er");
		
		Auto car3 = new Auto();
		car3.setMarke("Audi");
		car3.setBezeichnung("A1");
		
		Verwaltung<Auto> verwaltung = new Verwaltung<Auto>();
		verwaltung.addElement(car1);
		verwaltung.addElement(car2);
		verwaltung.addElement(car3);
		verwaltung.sortieren_Auto_Marke_Bezeichnung();
		verwaltung.sortieren_Auto_Standard();
		*/
		
	}

}
