import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe {

	public void aufgabe1Und2() {
		
		StdOut.println("Geben Sie eine Jahreszahl ein.");
		int jahr = StdIn.readInt();
		StdOut.println("Geben Sie eine Monatszahl ein.");
		int monat = StdIn.readInt();
		
		boolean schaltjahr = false;
		
		if(jahr % 400 == 0) {
			StdOut.print("Ihre Jahreszahl ist ein Schaltjahr.");
			schaltjahr = true;
		} else if(jahr % 100 == 0) {
			StdOut.print("Ihre Jahreszahl ist kein Schaltjahr.");			
		} else if(jahr % 4 == 0) {
			StdOut.print("Ihre Jahreszahl ist ein Schaltjahr.");
			schaltjahr = true;
		}
		
		
		int anzahlTage = 0;
		
		switch(monat) {
		
		case 1: anzahlTage = 31;
			break;
		case 2: 
			if(schaltjahr) {
				anzahlTage = 29;
			}
			else {
				anzahlTage = 28;
			}
			break;
		case 3: anzahlTage = 31;
			break;
		case 4: anzahlTage = 30;
			break;
		case 5: anzahlTage = 31;
			break;
		case 6: anzahlTage = 30;
			break;
		case 7: anzahlTage = 31;
			break;
		case 8: anzahlTage = 31;
			break;
		case 9: anzahlTage = 30;
			break;
		case 10: anzahlTage = 31;
			break;
		case 11: anzahlTage = 30;
			break;
		case 12: anzahlTage = 31;
			break;
		}
		StdOut.println("\nDie Anzahl der Tage beträgt " + anzahlTage + " Tage." );
	}
	
	
	public void aufgabe3() {
		
		StdOut.println("Geben Sie den Wert ein");
		double wert = StdIn.readDouble();
		double neuerWert = 0;
		StdOut.println("Um den Wert von Fahrenheit in Celsius umzurechnen, tippen Sie bitte auf C");
		StdOut.println("Um den Wert von Celsius in Fahrenheit umzurechnen, tippen Sie bitte auf F");
		String buchstabe = StdIn.readString();

		if(buchstabe.equalsIgnoreCase("C")) {
			neuerWert = 5.0 / 9.0 * (wert - 32.0);
			StdOut.print("Ihr Wert " + wert + " wurde in " + neuerWert +  " umgewandelt");
		}
		else if(buchstabe.equalsIgnoreCase("F")) {
			neuerWert = (wert * 9 / 5) + 32;
			StdOut.print("Ihr Wert " + wert + " wurde in " + neuerWert +  " umgewandelt");
		}
		else {
			System.out.println("Fehler");
		}
	}
	
}
