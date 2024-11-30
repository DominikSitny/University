package com.example.jpa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.example.Factory.EntityFactory;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reihenfolge beim Speichern in die DB wichtig! Wenn Student mit Viorlesung gespeichert werden soll, muss voerst passende Professor Objekt in der DB sein
		
		DatabaseService service = DatabaseService.getInstance();
		
		EntityFactory ef = new EntityFactory(10, 5, 20);
		
		Iterator it1 = ef.getProfessoren().iterator();
		while(it1.hasNext()) {
			service.addObject(it1.next());
		}
		
		Iterator it2 = ef.getStudenten().iterator();
		while(it2.hasNext()) {
			service.addObject(it2.next());
		}
	
		for(Student s : service.readStudents()) {
			System.out.println(s.toString());
		}
		
		Student s = service.readStudent("Dominik", "Sitny");
		
		if(s == null) {
			System.out.println("Leider kein Glück gehabt. Diesmal wurde der Student nicht mit den Namen generiert");
		}else {
			System.out.println(s.toString());
		}
		
		System.out.println(service.readProf("Prof. Dirk Schuster").toString());
	}

}
