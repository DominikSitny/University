package com.example.jpa;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	private String vorname;
	
	private String nachname;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "adresse")
	private Adresse adresse;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<Vorlesung> vorlesungen = new HashSet<>();
	
	public Student() {
		super();
	}
	
	public Student(String vorname, String nachname, Adresse adresse) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Set<Vorlesung> getVorlesungen() {
		return vorlesungen;
	}

	public void setVorlesungen(Set<Vorlesung> vorlesungen) {
		this.vorlesungen = vorlesungen;
	}
	
	public String toString() {
		String text = "Vorname: " + vorname + " Nachname: " + nachname + " Adresse: " + adresse.toString() + "\nVorlesungen: ";
		Iterator<Vorlesung> it = this.vorlesungen.iterator();
		while(it.hasNext()) {
			text += "\n" + it.next().toString();
		}
		return text;
		
	}
	
}

