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
	
	public synchronized void addObject(Object obj) {
		if(obj == null) {
			System.out.println("Object is null");
			return;
		}
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}
	
	public List<Student> readStudents(){
		TypedQuery<Student> query = em.createQuery("Select s From Student s", Student.class);
		List<Student> students = query.getResultList();
		
		return students;
	}
	
	public Student readStudent(String vorname, String nachname){
		TypedQuery<Student> query = em.createQuery("Select s From Student s where s.vorname Like :vorname And s.nachname Like :nachname", Student.class);
		query.setParameter("vorname", vorname);
		query.setParameter("nachname", nachname);
		if(query.getResultList().size() == 1) {
			Student s = query.getSingleResult();
			return s;
		}{
			return null;
		}
		
	}
	
	public Professor readProf(String name) {
		TypedQuery<Professor> query = em.createQuery("Select p from Professor p Where p.name Like :name",Professor.class);
		query.setParameter("name", name);
		return query.getSingleResult();
	}
	
}
