package com.example.Factory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.example.jpa.Adresse;
import com.example.jpa.Professor;
import com.example.jpa.Student;
import com.example.jpa.Vorlesung;

public class EntityFactory {

	private List<Student>studenten = new ArrayList<>();
	private List<Adresse>adressen = new ArrayList<>();
	private List<Professor>professoren = new ArrayList<>();
	private Set<Vorlesung>vorlesungen = new HashSet();
	private Random random = new Random();
	
	//Random Generator: random.nextInt(max - min) + min;
	
	public EntityFactory(int anzahlStudents, int anzahlAdressen, int anzahlVorlesungen) {
		if(anzahlVorlesungen <8) {
			System.out.println("Anzahl Vorlesungen muss größer als 8 sein, weil 4 Professoren generiert werden und jeweils 2 Vorlesungen zugewiesen bekommen");
		}
		
		generateStudents(anzahlStudents);
		generateProfessoren();
		generateVorlesungen(anzahlVorlesungen);
		
		
		for(Professor prof : this.professoren) {
			Object[] v = this.vorlesungen.toArray();
			int randomIntVorlesug = this.random.nextInt(this.vorlesungen.size() - 0) + 0;		
			int randomIntVorlesug2 = this.random.nextInt(this.vorlesungen.size() - 0) + 0;	
			prof.addVorlesung((Vorlesung)v[randomIntVorlesug]);
			prof.addVorlesung((Vorlesung)v[randomIntVorlesug2]);
			
			for(Student s : this.studenten) {
				s.getVorlesungen().add((Vorlesung)v[randomIntVorlesug]);
				s.getVorlesungen().add((Vorlesung)v[randomIntVorlesug2]);
				for(Adresse adr : this.adressen) {
					if(adr.equals(s.getAdresse())) {
						adr.setStudent(s);
					}
				}
			}
			
			this.vorlesungen.remove(v[randomIntVorlesug]);		
			this.vorlesungen.remove(v[randomIntVorlesug2]); 
			
		}
	
		
	/*	for(Vorlesung vorl : this.vorlesungen) {
			vorl.setProf(this.professoren.get(this.random.nextInt(this.professoren.size() - 0) + 0));
			System.out.println(vorl.getProf());
		} */
		
	}
	
	private void generateStudents(int anzahl){
		
		String[] vornamen = {
				"Dominik", 
				"Luke", 
				"Glen", 
				"Peter", 
				"Gunner", 
				"Lau", 
				"Peter",
				"Mario",
				"Sara",
				"Lara",
				"Tamarah",
				"Max",
				"Lukas",
				"David",
				"Jonas",
				"Niklas",
				"Gustav"
				};
		
		String[]nachnamen = {
				"Meyer",
				"SChmidt",
				"Neumann",
				"Herrmann",
				"Sitny",
				"Griesmann",
				"Kuhlmann",
				"Lenz",
				"Szymanski",
				"Lewandowski",
				"Neuer",
				"Mustermann"
		};
		
		for(int i=0;i<anzahl;i++) {
			int randomVornamen = this.random.nextInt(vornamen.length - 0) + 0;
			int randomNachnamen = this.random.nextInt(nachnamen.length - 0) + 0;
			this.studenten.add(
					new Student(
							vornamen[randomVornamen],
							nachnamen[randomNachnamen],
							generateAdresse()
							));
		}	
	}
	
	private Adresse generateAdresse() {
		
		String strasseHnr[] = {
				"Rabeneck 10",
				"Griesenbuchstr 1",
				"Feldweg 45",
				"Lange Str 3",
				"Jöllenbecker Str 221",
				"Detmolder Str 2",
				"Werther Str 98"
				
		};
	
		String[] PLZOrt = {
			"32139 Spenge",
			"34245 Thenhausen",
			"32130 Enger",
			"12345 Bielefeld"
		};
		
			int randomStrasseHnr = this.random.nextInt(strasseHnr.length - 0) + 0;
			int randomPLZOrt = this.random.nextInt(PLZOrt.length - 0) + 0;
	
				return	new Adresse(
							strasseHnr[randomStrasseHnr],
							PLZOrt[randomPLZOrt],
							null
							) ;	
	}
	
	private void generateProfessoren() {
			
			String name[] = {
					"Prof. Dirk Schuster",
					"Prof Maxim Schweizer",
					"Prof Dr Leonard Apelt",
					"Prof Dr Dr Dr med Konstantin Schwarzwald"		
			};
		
			for(int i=0;i<name.length;i++) {
				this.professoren.add(
						new Professor(
								name[i]
								)
				);
			}	
		}
	
	private void generateVorlesungen(int anzahl) {
	
		String[] namen = {"Informatik", "Bwl", "Mathe", "Projektmanagement", "Softwareprojekt"};
		
		for(int i=0;i<anzahl;i++) {		
			String name = namen[(this.random.nextInt(namen.length - 0) + 0)] + " " +(this.random.nextInt(4 - 1) + 1);
			String beschreibung = "Raum E0" + (this.random.nextInt(4 - 0) + 0) + "-" + (this.random.nextInt(100 - 0) + 0)  ;		
			this.vorlesungen.add(
					new Vorlesung(
							name,
							beschreibung,
							null,
							null
							)
			);
		}	
	}

	public List<Student> getStudenten() {
		return studenten;
	}

	public List<Adresse> getAdressen() {
		return adressen;
	}

	public List<Professor> getProfessoren() {
		return professoren;
	}

	public Set<Vorlesung> getVorlesungen() {
		return vorlesungen;
	}
	
	
	
}
