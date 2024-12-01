package com.example.demo.entity;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;



/**
 * Student class.
 * 
 */


@Entity
public class Student {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	
	private String vorname;
	private String nachname;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "adresse")
	private Adresse adresse;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<Vorlesung>vorlesungen;
	
	public Student()
	{
		super();
	
	}
	
	public Student(String vorname, String nachname, Adresse adresse) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(String f, String l)
	{
		vorname = f;
		nachname = l;
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

	public String getData() {
		
		return "Student: " + this.getVorname() + " " + this.getNachname();
	}
	
	public Set<Vorlesung> getVorlesungen() {
		return Collections.unmodifiableSet(vorlesungen);
	}

	public void addVorlesung(Vorlesung vorlesung) {
		if(this.vorlesungen == null) {
			this.vorlesungen = new HashSet<>();
		}
		this.vorlesungen.add(vorlesung);	
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + "]";
	}
	
}
