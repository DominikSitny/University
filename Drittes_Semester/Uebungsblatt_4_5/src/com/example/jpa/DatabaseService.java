package com.example.jpa;


import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class DatabaseService {

	private EntityManager em;
	private EntityManagerFactory emf;
	private static DatabaseService instance;
	
	private DatabaseService() {
		emf = Persistence.createEntityManagerFactory("test");
		em = emf.createEntityManager();	
	}
	public static DatabaseService getInstance() {	
		if(instance == null) {
			return new DatabaseService();
		}
		return instance;	
	}
	
	public synchronized void addStudent(Student stud) {
		if(stud == null) {
			System.out.println("student is null");
			return;
		}
		em.getTransaction().begin();
		em.persist(stud);
		em.getTransaction().commit();
	}
	
	public List<Student> readStudents(){
		TypedQuery<Student> query = em.createQuery("Select s From Student s", Student.class);
		List<Student> students = query.getResultList();
		return students;
	}
}
