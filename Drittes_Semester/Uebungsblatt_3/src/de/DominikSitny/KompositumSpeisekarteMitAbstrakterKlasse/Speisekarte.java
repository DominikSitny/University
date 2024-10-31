package de.DominikSitny.KompositumSpeisekarteMitAbstrakterKlasse;

public class Speisekarte extends Speisekartenkomponente{

	public Speisekarte(String name, String beschreibung) {
		super(name, beschreibung, 0, false);
		// TODO Auto-generated constructor stub
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
	
}

