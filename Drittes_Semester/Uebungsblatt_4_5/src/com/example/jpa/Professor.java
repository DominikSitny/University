package com.example.jpa;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "prof")
	private Set<Vorlesung> vorlesungen = new HashSet<>();;
	
	public Professor() {
		super();
		this.vorlesungen = new HashSet<>();
	}

	
	
	public Professor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Vorlesung> getVorlesungen() {
		return vorlesungen;
	}

	public void setVorlesungen(Set<Vorlesung> vorlesungen) {
		this.vorlesungen = vorlesungen;
	}
	
	public void addVorlesung(Vorlesung vorlesung) {
		this.vorlesungen.add(vorlesung);
		vorlesung.setProf(this);
	}



	public long getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Professor [name=" + name + "]";
	}
	
	
	
}
