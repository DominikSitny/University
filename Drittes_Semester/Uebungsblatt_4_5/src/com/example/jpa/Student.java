package com.example.jpa;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String vorname;
	
	private String nachname;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "adresse")
	private Adresse adresse;
	
	private Set<Vorlesung> vorlesungen;
	
	public Student() {
		super();
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
	
	
	
}

