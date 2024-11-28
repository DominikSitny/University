package com.example.jpa;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	private String strasseHNr;
	private String PLZOrt;
	
	public Adresse() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStrasseHNr() {
		return strasseHNr;
	}

	public void setStrasseHNr(String strasseHNr) {
		this.strasseHNr = strasseHNr;
	}

	public String getPLZOrt() {
		return PLZOrt;
	}

	public void setPLZOrt(String pLZOrt) {
		PLZOrt = pLZOrt;
	}
	
	
}

