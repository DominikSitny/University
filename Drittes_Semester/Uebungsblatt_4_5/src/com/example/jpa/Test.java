package com.example.jpa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseService service = DatabaseService.getInstance();
		
		Student s = new Student();
		s.setVorname("Dominik");
		s.setNachname("Sitny");
		Student s2 = new Student();
		s2.setVorname("Jennifer");
		s2.setNachname("Sitny");
		Student s3 = new Student();
		s3.setVorname("Luke");
		s3.setNachname("Samarah");
		
		Adresse adresse = new Adresse();
		adresse.setPLZOrt("32139 Spenge");
		adresse.setStrasseHNr("Rabeneck 10");
		Adresse adresse2 = new Adresse();
		adresse2.setPLZOrt("12345 Heepen");
		adresse2.setStrasseHNr("Lutscher 69");
		
		s.setAdresse(adresse);	
		s2.setAdresse(adresse);
		s3.setAdresse(adresse2);
		
		service.addStudent(s);
		service.addStudent(s2);
		service.addStudent(s3); 	
		
		
		
	}

}
