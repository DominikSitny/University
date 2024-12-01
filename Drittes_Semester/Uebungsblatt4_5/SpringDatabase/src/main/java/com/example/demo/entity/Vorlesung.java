package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Vorlesung {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String beschreibung;
	
	@ManyToMany(mappedBy = "vorlesungen")
	private Set<Student>studenten;

	public Vorlesung(String name, String beschreibung) {
		super();
		this.name = name;
		this.beschreibung = beschreibung;
	}

	public Vorlesung() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudenten() {
		return studenten;
	}

	public void addStudenten(Student student) {
		this.studenten.add(student);
	}
	
	
	
//	private Professor prof;
	
	
}
