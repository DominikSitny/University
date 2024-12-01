package com.example.demo;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Adresse;
import com.example.demo.entity.Student;
import com.example.demo.entity.Vorlesung;
import com.example.demo.repo.StudentRepository;


@SpringBootApplication
public class DatabaseApplication {

	@Autowired
    private StudentRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}
		
	@PostConstruct
	private void initDB()
	{
		
	 	Student student = new Student("Markus", "Müller");

    	Adresse adress1 = new Adresse();
    	adress1.setStrasseHNr("Hauptstrasse 4");
    	adress1.setPLZOrt("33619 Bielefeld");
    	
    	Vorlesung v = new Vorlesung("Informatik 1", "Informatik Vorlesung für Anfänger");
		Vorlesung v2 = new Vorlesung("Informatik 2", "Informatik Vorlesung für Fortgeschrittene");

    	student.setAdresse(adress1);
    	adress1.setStudent(student);
    	
    	student.addVorlesung(v);
    	student.addVorlesung(v2);

    	student = repository.save(student);

    	List<Student> allstudents = repository.findAll();
    	
    	Student student2 = new Student("Michael", "Meier");
    	
    	student2 = repository.save(student2);
    	
    	allstudents = repository.findAll();
	}

}
