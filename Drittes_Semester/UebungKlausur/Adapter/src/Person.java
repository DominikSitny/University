
public class Person {

	String nachname;
	String vorname;
	
	public Person(String nachname, String vorname) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
	}
	
	public void print() {
		System.out.println("Person [nachname=" + nachname + ", vorname=" + vorname + "]");
	}
	
}
