package de.DominikSitny.KompositumSpeisekarteMitInterface;

import java.util.ArrayList;
import java.util.List;

public class Speisekarte implements Speisekartenkomponente{

	String name;
	String beschreibung;
	List<Speisekartenkomponente> kindList = new ArrayList<Speisekartenkomponente>();
	
	public Speisekarte(String name, String beschreibung) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.beschreibung = beschreibung;
	}

	public void hinzufuegen(Speisekartenkomponente sk) {
		this.kindList.add(sk);
	}
	
	public void eintfernen(Speisekartenkomponente sk) {
		this.kindList.remove(sk);
	}
	
	public void getKind() {
		for(Speisekartenkomponente sk : this.kindList) {
			sk.ausgeben();
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return this.beschreibung;
	}

	@Override
	public double getPreis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isVegetarisch() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ausgeben() {
		System.out.println( 
				"Name: " + name + "\n" +
				"Beschreibung: " + beschreibung + "\n"
		);
	}
	
}

