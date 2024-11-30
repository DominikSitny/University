package com.example.jpa;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	private String strasseHNr;
	private String PLZOrt;
	
	@OneToOne(mappedBy = "adresse")
	private Student student;
	
	public Adresse() {
		super();
	}
	

	public Adresse(String strasseHNr, String pLZOrt, Student student) {
		super();
		this.strasseHNr = strasseHNr;
		PLZOrt = pLZOrt;
		this.student = student;
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


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String toString() {
		return "StrHnr: " + strasseHNr + " PLZOrt: " + PLZOrt;
	}
	
}

