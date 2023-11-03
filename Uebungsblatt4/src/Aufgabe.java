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
		StdOut.print("\nDie Monatsanzahl beträgt " + monatsanzahl + " Tage." );
	}
	
}
