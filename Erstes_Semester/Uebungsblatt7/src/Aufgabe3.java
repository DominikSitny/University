
public class Aufgabe3 {
	
	public static void main(String[] args) {
		int groesse = HilfsMethoden.frageInt("Größe?");
		pyramide(groesse);
	}

	public static void pyramide(int groesse) {
		int anzSternchen = 1;
		for(int i=groesse; i>0; i--) {
			wiederholeZeichen(' ', i);
			wiederholeZeichen('*', anzSternchen);
			
			System.out.println();
			anzSternchen += 2;
		}		
	}
	
	public static void wiederholeZeichen(char c, int wiederholung) {
		for(int i = 0; i<wiederholung;i++)
			System.out.print(c);
	}
}
