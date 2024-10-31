package de.DominikSitny.KompositumSpeisekarteMitAbstrakterKlasse;

public class Testklient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Darstellung einer Baumstruktur: Bsp Speiseplan 
		 * 			Speiseplan
		 * 			Vorspeise			    Hauptspeise			Nachspeise 		Getraenke
		 * 				- Suppe				- Schnitzel			- Eis           / (noch leer)
	 	 * 				- Toast				- Doener
	 	 * 				- Salat				Vegetarisch
	 	 * 									- Veggiburger
	 	 * 									- Pommes
		 * 
 * Nur Pfad Hauptspeise ist implementiert
		 */
		Speisekartenkomponente baum = new Speisekarte("Speisekarte", "Das ist die Speisekarte");
		
		Speisekartenkomponente vorspeise = new Speisekarte("Vorspeise", "Das ist die Vorspeise");
		Speisekartenkomponente hauptspeise = new Speisekarte("Hauptspeise", "Das ist die Haupspeise");
		Speisekartenkomponente nachspeise = new Speisekarte("Nachspeise", "Das ist die Nachspeise");
		
		Speisekartenkomponente schnitzel = new Speise("Schnitzel", "leckeres Schnitzel", 12.99, false);
		Speisekartenkomponente doener = new Speise("Doener", "leckere Doenerrr ", 3.00, false);
		Speisekartenkomponente vegetarisch = new Speisekarte("Vegetarisch", "Hier finden Sie vegetarische Speisen");
		vegetarisch.hinzufuegen(new Speise("VeggiBurger", "Hmmm Burger", 10.99, true));
		vegetarisch.hinzufuegen(new Speise("Pommes", "Hmmm Pommes", 2.99, true));
		
		
		hauptspeise.hinzufuegen(schnitzel);
		hauptspeise.hinzufuegen(doener);
		hauptspeise.hinzufuegen(vegetarisch);
		
		baum.hinzufuegen(hauptspeise);
		
		
		//Test
		schnitzel.ausgeben();
		vegetarisch.getKind();
		
		
		
		
		
		
	}

}
