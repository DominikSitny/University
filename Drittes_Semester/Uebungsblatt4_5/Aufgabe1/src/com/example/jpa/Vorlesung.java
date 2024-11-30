package com.example.jpa;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Vorlesung {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String beschreibung;
	
	@ManyToMany(mappedBy = "vorlesungen")
	private Set<Student> studenten;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Professor prof;
	
	public Vorlesung() {
		this.studenten = new HashSet<Student>();
	}
	
	public Vorlesung(String name, String beschreibung, Set<Student> studenten, Professor prof) {
		super();
		this.name = name;
		this.beschreibung = beschreibung;
		this.studenten = studenten;
		this.prof = prof;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Set<Student> getStudenten() {
		return studenten;
	}

	public void setStudenten(Set<Student> studenten) {
		this.studenten = studenten;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "Vorlesung [name=" + name + ", beschreibung=" + beschreibung + ", prof=" + prof.toString() + "]";
	}
	
	
}
