package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Adresse {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private long id;
	
	private String strasseHNr;
	private String PLZOrt;
	
	@JsonIgnore
	@OneToOne(mappedBy="adresse")
	
	private Student student;
	
	public Adresse()
	{
		super();
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

}
