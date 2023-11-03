import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe3 {

	public void aufgabe() {
		
		System.out.println(3 % 1000);
		
		StdOut.println("Wählen Sie die erste Uhzeit aus ");
		StdOut.println("Stunde: ");
		int firstHour = StdIn.readInt();
		StdOut.println("Minute");
		int firstMinutes = StdIn.readInt();
		
		StdOut.println("Wählen Sie die zweite Uhzeit aus ");
		StdOut.println("Stunde: ");
		int secondHour = StdIn.readInt();
		StdOut.println("Minute");
		int secondMinutes = StdIn.readInt();
		
		//Auf gesamte Minutenlänge umrechnen
		int firstTotalMinutes = firstHour * 60 + firstMinutes;
		int secondTotalMinutes = secondHour * 60 + secondMinutes;
		
		int differenceTotalMinutes =  secondTotalMinutes - firstTotalMinutes;
		
		StdOut.print("Der Unterschied beträgt " + (differenceTotalMinutes/60) + "Stunde und " + differenceTotalMinutes % 60 + " Minuten");
		
	}
	
}
