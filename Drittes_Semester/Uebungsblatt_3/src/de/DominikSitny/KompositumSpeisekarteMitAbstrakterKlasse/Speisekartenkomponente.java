package de.DominikSitny.KompositumSpeisekarteMitAbstrakterKlasse;

import java.util.ArrayList;
import java.util.List;

public abstract class Speisekartenkomponente {

	String name;
	String beschreibung;
	double preis;
	boolean isVegetarisch;
	
	List<Speisekartenkomponente> kindList = new ArrayList<Speisekartenkomponente>();
	
	public Speisekartenkomponente(String name, String beschreibung, double preis, boolean isVegetarisch) {
		this.name = name;
		this.beschreibung = beschreibung;
		this.preis = preis;
		this.isVegetarisch = isVegetarisch;
	}
	
	
	public String getName() {
		return name;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public double getPreis() {
		return preis;
	}
	public boolean isVegetarisch() {
		return isVegetarisch;
	}
	
	public void ausgeben() {
		System.out.println( 
				"Name: " + name + "\n" +
				"Beschreibung: " + beschreibung + "\n"
		);
				
	}
	
	public void hinzufuegen(Speisekartenkomponente sk) {
		System.out.println("Ist in Kindmethode nicht implementiert");
	}
	
	public void eintfernen(Speisekartenkomponente sk) {
		System.out.println("Ist in Kindmethode nicht implementiert");
	}
	
	public void getKind() {
		System.out.println("Ist in Kindmethode nicht implementiert");
	}
	
	
}
