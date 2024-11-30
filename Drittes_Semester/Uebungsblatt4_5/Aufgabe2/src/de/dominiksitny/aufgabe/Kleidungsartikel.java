package de.dominiksitny.aufgabe;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Kleidungsartikel")
public class Kleidungsartikel extends Artikel{

	public Kleidungsartikel(String beschreibung, String status, String marke, double preis, String material) {
		super(beschreibung,status, marke, preis);
		// TODO Auto-generated constructor stub
		this.material = material;
	}

	public Kleidungsartikel() {
		
	}
	
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}
