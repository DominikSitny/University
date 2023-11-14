import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe {

	public void aufgabe1() {
		
		int anzahlSternchen = 10;
		int counter = 1;
		while(counter<=anzahlSternchen) {
			StdOut.print("*");
			counter++;
		}
		
	}
	
	public void aufgabe2() {
		
		int anzahlSternchen = 6;
		
		for(int y = 0; y<anzahlSternchen; y++) {
			
			for(int x=0; x<anzahlSternchen;x++) {
				StdOut.print("*");
			}
			StdOut.println("");
		}
		
	}
	
	public void aufgabe3a() {
		
		int anzahlSternchen = 5;
		
		for(int y = 0;y<anzahlSternchen;y++) {
			
			for(int x=0; x<=y;x++) {
				
				StdOut.print("*");
				
			}
			StdOut.println();
		}
		
	}
	
	public void aufgabe3b() {
		
		int anzahlSternchen = 8;
		
		for(int y=1; y<=anzahlSternchen;y++) {	
			if(y==1 || y==anzahlSternchen) {
				for(int i = 0; i<anzahlSternchen;i++) {
					StdOut.print("*");
				}
			}else {
				for(int z=1; z<=anzahlSternchen;z++) {
					if (z==1 || z==anzahlSternchen) {
						StdOut.print("*");
					}
					else {
						StdOut.print(" ");
					}
				}
			}
			StdOut.println();
			
		}
		
	}
	
	public void aufgabe3c() {
		
		int zeilen = 2;
		
		for(int y=0;y<zeilen;y++) {
			
			for(int x=0; x<zeilen*2-1;x++) {
				
				if(x<=(zeilen*2-2)/2+y  && x>=(zeilen*2-2)/2-y) {
					StdOut.print("*");
				}else {
					StdOut.print(" ");
				}
					
			}
			StdOut.println();
		}
		
	}
	
	
	//Zusatzaufgabe: Die Spitze des Dreiecks zeigt nun nach oben
	public void aufgabe3d() {	
		int zeilen = 6;	
		for(int y=0; y<zeilen;y++) {			
			for(int x=1; x<=zeilen*2-1;x++) {			
				if(x>=zeilen-y && x<=zeilen+y) {
					StdOut.print("*");
				}
				else {
					StdOut.print(" ");
				}			
			}
			StdOut.println();			
		}
		
	}
	
	//Zusatzaufgabe: Die Spitze zeigt nach rechts
	public void aufgabe3e() {
	
		int zeilen = 4;
		for(int i=0;i<zeilen;i++) {
			
			
		}
		
	}
	
}
