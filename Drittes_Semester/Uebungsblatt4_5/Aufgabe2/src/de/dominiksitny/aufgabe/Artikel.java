package de.dominiksitny.aufgabe;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
@Inheritance(strategy=InheritanceType.JOINED )
@DiscriminatorColumn(name = "Disc", discriminatorType = DiscriminatorType.STRING)
public class Artikel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String beschreibung;
	
	private String status;
	
	private String marke;
	
	private double preis;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<Lieferant> lieferanten;
	
	@ManyToMany(mappedBy = "artikel")
	@JoinColumn( nullable = false )
	private Set<Mitarbeiter>mitarbeiter;

	public Artikel(String beschreibung, String status, String marke, double preis) {
		super();
		this.beschreibung = beschreibung;
		this.status = status;
		this.marke = marke;
		this.preis = preis;
		this.lieferanten = new HashSet<Lieferant>();
	}
	
	public Artikel() {
		
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public void addLieferant(Lieferant lieferant) {
		this.lieferanten.add(lieferant);
	}

	public Set<Lieferant> getLieferanten() {
		return  Collections.unmodifiableSet(this.lieferanten);
	}

	public Set<Mitarbeiter> getMitarbeiter() {
		return  Collections.unmodifiableSet(this.mitarbeiter);
	}
	
	public void addMitarbeiter(Mitarbeiter mitarbeiter) {
		if(this.mitarbeiter == null) {
			this.mitarbeiter = new HashSet<Mitarbeiter>();
		}
		this.mitarbeiter.add(mitarbeiter);
	}
	
	
	
	
	
}
