package de.dominiksitny.aufgabe;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Mitarbeiter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Date einstelllungsdatum;
	
	private String email;
	
	private String nachname;
	
	private String vorname;
	
	private String passwort;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<Artikel>artikel;
	
	public Mitarbeiter() {
		
	}
	
	

	public Mitarbeiter(Date einstelllungsdatum, String email, String nachname, String vorname, String passwort) {
		super();
		this.einstelllungsdatum = einstelllungsdatum;
		this.email = email;
		this.nachname = nachname;
		this.vorname = vorname;
		this.passwort = passwort;
		this.artikel = new HashSet<Artikel>();
	}

	public Date getEinstelllungsdatum() {
		return einstelllungsdatum;
	}

	public void setEinstelllungsdatum(Date einstelllungsdatum) {
		this.einstelllungsdatum = einstelllungsdatum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
	public void addArtikel(Artikel artikel) {
		this.artikel.add(artikel);
	}
	
	public Set<Artikel> getArtikel() {
		return Collections.unmodifiableSet(artikel);
	}
	
	
}
