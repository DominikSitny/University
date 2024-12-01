package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Adresse;
import com.example.demo.entity.Student;
import com.example.demo.entity.Vorlesung;
import com.example.demo.repo.StudentRepository;

@SpringBootTest
class DatabaseApplicationTests {
	
	@Autowired
	StudentRepository repository;
	
	List<Student> studenten;
	
	@BeforeEach
	public void genereateObjects() {
		repository.deleteAll();
		this.studenten = new ArrayList<Student>();
		for(int i = 0; i<100; i++) {
			Student student = new Student("Markus"+i, "Müller"+i);
			Adresse adress1 = new Adresse();
	    	adress1.setStrasseHNr("Hauptstrasse" + i);
	    	adress1.setPLZOrt("33619 Bielefeld");
	    	adress1.setStudent(student);
	    	student.setAdresse(adress1);
	    	for(int x = 0;x<30;x++) {
	    	Vorlesung v = new Vorlesung("name"+ i + " " + x,"beschreibung"+  i + " " + x);
	    	student.addVorlesung(v);
	    	}
	    	this.studenten.add(student);
	    	this.repository.save(student);
		}
	}
	
	
	@Test
	void insertOfStudent() {
		for(int i=0;i<100;i++) {
			Student studentLocal = this.studenten.get(i);
	    	Student s1 = this.repository.findAll().get(i);
	    	assertThat(s1.getNachname()).isEqualTo(studentLocal.getNachname());
		}
	}
	
	@Test
	void deleteOfStudent() {
		for(int i=99; i>=0;i--) {
			Student student = repository.findAll().get(i);
			this.repository.delete(student);
			List<Student> studentList = this.repository.findAll();
			assertThat(studentList.contains(student)).isFalse();
		}
	} 
	
	@Test
	@Transactional //getVorlesungen werden lazy geladen, damit kein Fehler mehr
	void testRelationStudent_Vorlesung() {
		
		List<Student> studListRepo = repository.findAll();
		
		for(int i=0;i<studListRepo.size();i++) {
			
			System.out.println(studListRepo.get(i).getVorlesungen().size());
			assertThat(studListRepo.get(i).getVorlesungen()).isEqualTo(this.studenten.get(i).getVorlesungen());
			
		}

    	
		
	}
	

}
