package de.dominiksitny.aufgabe;

import java.util.Date;

public class Testprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseService service = DatabaseService.getInstance();
		Mitarbeiter m1 = new Mitarbeiter(new Date(), "email1", "Nachname1", "vorname1", "passwort1");
		Artikel a1 = new Kleidungsartikel("Das ist ein T-Shirt", "produziert", "Adidas" , 24.99, "Baumwolle");	
		Artikel a2 = new Schuhartikel("beschreibung", "status", "marke", 10.99, "Schuhart", "Obermaterial", "innenAMterial", "solen");
		m1.addArtikel(a1);
		m1.addArtikel(a2);
		Lieferant l1 = new Lieferant("DHL");
		a1.addLieferant(l1);
		
		service.addObject(m1);
		
	}

}
