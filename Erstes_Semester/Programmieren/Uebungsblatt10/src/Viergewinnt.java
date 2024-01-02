import edu.princeton.cs.introcs.StdIn;

public class Viergewinnt {
	

	public static void main(String[] args) {
		
		boolean spiel = true;
		boolean rotIstAmZug = true;
		
		final int anzahlZeilen = 5;
		final int anzahlSpalten = 6;
		
		System.out.println("Hallo zum Spiel Vier gewinnt");
		Spielfeld spielfeld = new Spielfeld(anzahlSpalten, anzahlZeilen);
		
		while (spiel) {
			
			
		spielfeld.steinHinzufuegen(frageInt(rotIstAmZug), rotIstAmZug);
		
		spielfeld.zeichne();
		
		rotIstAmZug = !rotIstAmZug;
		
		}
    }
	
	public static int frageInt(boolean rotIstAmZug) {
		
		if(rotIstAmZug) {
			System.out.println("Rot ist am Zug");
		}else {
			System.out.println("Blau ist am Zug");
		}
		System.out.println("Setzen Sie einen Stein: ");
		
		return StdIn.readInt() - 1;
		
	}
	
}
