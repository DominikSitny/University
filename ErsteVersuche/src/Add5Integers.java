import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Add5Integers {

	public static void main(String[] args) {
	
		StdOut.print("Dieses Programm addiert zwei ganze Zahlen.");
		StdOut.print("Bitte erste Zahl eingeben: ");
		int n1 = StdIn.readInt();
		StdOut.print("Bitte zweite Zahl eingeben: ");
		int n2 = StdIn.readInt();
		
		//Erweiterung 
		StdOut.print("Bitte dritte Zahl eingeben: ");
		int n3 = StdIn.readInt();
		StdOut.print("Bitte vierte Zahl eingeben: ");
		int n4 = StdIn.readInt();
		StdOut.print("Bitte fünfte Zahl eingeben: ");
		int n5 = StdIn.readInt();	
		int sum = n1 + n2 + n3 + n4 + n5;
		StdOut.print("Die Summe ist " + sum);

	}

}
