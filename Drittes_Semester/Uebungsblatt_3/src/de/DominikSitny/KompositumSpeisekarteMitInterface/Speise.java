package de.DominikSitny.KompositumSpeisekarteMitInterface;

public class Speise implements Speisekartenkomponente{

	String name;
	String beschreibung;
	double preis;
	boolean isVegetarisch;
	
	public Speise(String name, String beschreibung, double preis, boolean isVegetarisch) {
	
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.beschreibung = beschreibung;
		this.preis = preis;
		this.isVegetarisch = isVegetarisch;
	}

	public void ausgeben() {
		System.out.println( 
				"Name: " + name + "\n" +
				"Beschreibung: " + beschreibung + "\n" +
				"Preis: " + preis  + "\n" +
				"Ist vegetarisch: " + isVegetarisch + "\n"
		);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getName();
	}

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return this.getBeschreibung();
	}

	@Override
	public double getPreis() {
		// TODO Auto-generated method stub
		return this.getPreis();
	}

	@Override
	public boolean isVegetarisch() {
		// TODO Auto-generated method stub
		return this.isVegetarisch;
	}

	@Override
	public void hinzufuegen(Speisekartenkomponente sk) {
		// TODO Auto-generated method stub
		System.out.println("Ist in Kindmethode nicht implementiert");
	}

	@Override
	public void eintfernen(Speisekartenkomponente sk) {
		// TODO Auto-generated method stub
		System.out.println("Ist in Kindmethode nicht implementiert");
	}

	@Override
	public void getKind() {
		// TODO Auto-generated method stub
		System.out.println("Ist in Kindmethode nicht implementiert");
	}

}
