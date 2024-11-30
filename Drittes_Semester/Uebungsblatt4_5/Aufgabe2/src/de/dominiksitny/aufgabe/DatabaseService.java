package de.dominiksitny.aufgabe;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class DatabaseService {

	private EntityManager em;
	private EntityManagerFactory emf;
	private static DatabaseService instance;
	
	private DatabaseService() {
		emf = Persistence.createEntityManagerFactory("mode");
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
	
	
}
