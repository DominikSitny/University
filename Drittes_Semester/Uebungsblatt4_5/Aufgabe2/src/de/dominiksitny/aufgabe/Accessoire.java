package de.dominiksitny.aufgabe;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Accessoire")
public class Accessoire extends Artikel{
	
	private boolean eineGroesse;
	private double breite;
	private double laenge;
	private double hoehe;
	
	
	
	public Accessoire(String beschreibung, String status, String marke, double preis,
			boolean eineGroesse, double breite, double laenge, double hoehe) {
		super(beschreibung, status, marke, preis);
		this.eineGroesse = eineGroesse;
		this.breite = breite;
		this.laenge = laenge;
		this.hoehe = hoehe;
	}
	
	public Accessoire() {
		
	}

	public boolean isEineGroesse() {
		return eineGroesse;
	}
	public void setEineGroesse(boolean eineGroesse) {
		this.eineGroesse = eineGroesse;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	public double getLaenge() {
		return laenge;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	
	
}
