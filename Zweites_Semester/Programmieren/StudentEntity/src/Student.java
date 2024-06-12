import java.util.Random;

public class Student implements Comparable<Student>{

	private int matrikelNr;
	private String vorname;
	private String nachname;
	private String[]telefonNr;
	private Random rand = new Random();
	private static final String[] telefonNrArt = {"Mobil", "Privat", "Fax"};
	
	
	public Student() {
		this.matrikelNr = hashValue();	
		this.telefonNr= new String[]{
				telefonNrArt[
				             this.rand.nextInt(this.telefonNrArt.length-0)+0
				             ],
				"+49" + this.rand.nextInt(9999 - 1000 + 1) + 1
				};
	}
	
	public int getMatrikelNr() {
		return matrikelNr;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String[] getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(String[] telefonNr) {
		this.telefonNr = telefonNr;
	}

	public int hashValue() {
		return this.hashCode();
	}


	

	/*Sortierung nach MatrikelNr; Ue 2 Aufgabe 2 
	@Override
	public int compareTo(Student o) {
		
		if(this.matrikelNr > o.matrikelNr) {
			return 1;
		}
		else if(this.matrikelNr == o.matrikelNr) {
			return 0;
		}
		else {
			return -1;
		}
	}*/
	
	// Sortierung nach TelefonNr; Ue 2 Aufgabe 3c
	@Override
	public int compareTo(Student o) {
		int compare = this.getTelefonNr()[0].compareTo(o.getTelefonNr()[0]);
	    if (compare == 0) {
	        compare = this.getTelefonNr()[1].compareTo(o.getTelefonNr()[1]);
	    }
	    return compare;
				
	}
	
	
	
}
