import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe {

	public void aufgabe1Und2() {
		
		StdOut.println("Geben Sie eine Jahreszahl ein.");
		int jahr = StdIn.readInt();
		StdOut.println("Geben Sie eine Monatszahl ein.");
		int monat = StdIn.readInt();
		
		boolean schaltjahr = false;
		
		if(jahr % 4 == 0 && !(jahr % 100 == 0)) {
			StdOut.print("Ihre Jahreszahl ist ein Schaltjahr.");
			schaltjahr = true;
		}
		else if(jahr % 100 == 0 && !(jahr % 400 == 0)) {
			StdOut.print("Ihre Jahreszahl ist kein Schaltjahr.");
		}
		else if(jahr % 400 == 0) {
			StdOut.print("Ihre Jahreszahl ist ein Schaltjahr.");
			schaltjahr = true;
		}
		else {
			StdOut.print("Bei der Jahreszahl ist ein Fehler aufgetaucht.");
		}
		
		int monatsanzahl = 0;
		
		switch(monat) {
		
		case 1: monatsanzahl = 31;
			break;
		case 2: 
			if(schaltjahr) {
				monatsanzahl = 29;
			}
			else {
				monatsanzahl = 28;
			}
			break;
		case 3: monatsanzahl = 31;
			break;
		case 4: monatsanzahl = 30;
			break;
		case 5: monatsanzahl = 31;
			break;
		case 6: monatsanzahl = 30;
			break;
		case 7: monatsanzahl = 31;
			break;
		case 8: monatsanzahl = 31;
			break;
		case 9: monatsanzahl = 30;
			break;
		case 10: monatsanzahl = 31;
			break;
		case 11: monatsanzahl = 30;
			break;
		case 12: monatsanzahl = 31;
			break;
		}
		StdOut.println("\nDie Monatsanzahl beträgt " + monatsanzahl + " Tage." );
	}
	
	
	public void aufgabe3() {
		
		StdOut.println("Geben Sie den Wert ein");
		double wert = StdIn.readDouble();
		double neuerWert = 0;
		StdOut.println("Um den Wert von Fahrenheit in Celsius umzurechnen, tippen Sie bitte auf C");
		StdOut.println("Um den Wert von Celsius in Fahrenheit umzurechnen, tippen Sie bitte auf F");
		String buchstabe = StdIn.readString();

		if(buchstabe.equalsIgnoreCase("C")) {
			neuerWert = (wert-32) * 5 / 9;
			StdOut.print("Ihr Wert " + wert + " wurde in " + neuerWert +  " umgewandelt");
		}
		else if(buchstabe.equalsIgnoreCase("F")) {
			neuerWert = (wert * 9 / 5) + 32;
			StdOut.print("Ihr Wert " + wert + " wurde in " + neuerWert +  " umgewandelt");
		}
	}
	
}
