package de.DominikSitny.KompositumSpeisekarteMitAbstrakterKlasse;

public class Speise extends Speisekartenkomponente{

	
	
	public Speise(String name, String beschreibung, double preis, boolean isVegetarisch) {
		super(name, beschreibung, preis, isVegetarisch);
		// TODO Auto-generated constructor stub
	}

	public void ausgeben() {
		System.out.println( 
				"Name: " + name + "\n" +
				"Beschreibung: " + beschreibung + "\n" +
				"Preis: " + preis  + "\n" +
				"Ist vegetarisch: " + isVegetarisch + "\n"
		);
				
	}

}
