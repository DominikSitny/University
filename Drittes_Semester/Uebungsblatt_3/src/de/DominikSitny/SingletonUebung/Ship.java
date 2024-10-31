package de.DominikSitny.SingletonUebung;

public class Ship {

	private static int anzahl = 0;
	private int id = 0;
	private String name;
	private double preis;
	private ShipOwner owner;
	
	public Ship(String name, double preis) {
		this.id = anzahl;
		this.name = name;
		this.preis = preis;
		anzahl++;
	}

	
	public int getId() {
		return this.id;
	}

	public void setOwner(ShipOwner owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public double getPreis() {
		return preis;
	}

	public ShipOwner getOwner() {
		return owner;
	}
	
	public String toString() {
		return 	"Id: " + id + "\n" +
				"Name: " + name + "\n" +
				"Preis: " + preis + "\n" +
				"Owner: " + owner + "\n";
	}
	
	
}
