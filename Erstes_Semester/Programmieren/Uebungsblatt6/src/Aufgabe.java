import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe {

	
	public void aufgabe1() {
		
		int anzahlPerson = StdIn.readInt();
		int[] arr = new int[anzahlPerson];
		
		for(int i=0; i<anzahlPerson;i++) {
			
			StdOut.print("Blutzuckerwert: ");
			arr[i] = StdIn.readInt();
			
		}
		
		int counterUnterzucker=0;
		int counterUeberzucker=0;
		
		for(int i = 0; i<anzahlPerson; i++) {
			
			if(arr[i]<80) {
				counterUnterzucker++;
			}
			if(arr[i]>120) {
				counterUeberzucker++;
			}
		}
		System.out.println("Anzahl der Unterzuckerten: " + counterUnterzucker);
		System.out.println("Anzahl der Überzuckerten: " + counterUeberzucker);
		
		
		//Erweiterung b
		System.out.println("Prozentueller Anteil der Unterzuckerten: " + counterUnterzucker/(double)anzahlPerson);
		System.out.println("Prozentueller Anteil der Überzuckerten: " + counterUeberzucker/(double)anzahlPerson);
	
		//Erweiterung c
		
		for(int i = 0; i<anzahlPerson;i++) {
			if(arr[i]<80) {
				System.out.println("Person Nr. " + i + " ist unterzuckert");
			}
			if(arr[i]>120) {
				System.out.println("Person Nr. " + i + " ist überzuckert");
			}
		}
	
	}
	
	public void aufgabe2() {
		
		System.out.println("Geben Sie die Größe des Arrays an.");
		int size = StdIn.readInt();
		double[] arr = new double[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Geben Sie einen  double Wert ein");
			arr[i] = StdIn.readDouble();
		}
		
		double kleinsterWert=arr[0];
		double groessterWert = arr[0];
		for(int i=1; i<size; i++) {
			
			if(arr[i]<kleinsterWert) {
				kleinsterWert = arr[i];
			}
			if(arr[i]>groessterWert) {
				groessterWert = arr[i];
			}
			
		}
		System.out.println("Kleinster Wert: " + kleinsterWert);
		System.out.println("Größter Wert: " + groessterWert);
	}
	
	public void aufgabe3() {
		System.out.println("Länge des Arrays");
		int anzahl = StdIn.readInt();
		
		int[][] arr = new int [anzahl][anzahl];
		
		for(int y=0;y<anzahl;y++) {
			for(int x=0;x<anzahl;x++) {
				if(y==x) {
					arr[y][x] = x+1;
				}else {
					arr[y][x] = 0;
				}
				System.out.print(arr[y][x]);
			}
			System.out.println("");
		}
	}
	
}
