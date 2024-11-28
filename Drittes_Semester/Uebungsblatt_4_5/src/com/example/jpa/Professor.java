package com.example.jpa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
}
