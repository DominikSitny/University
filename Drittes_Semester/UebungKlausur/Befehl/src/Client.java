
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lichtquelle quelle = new Lichtquelle();
		Befehlshistorie bh = new Befehlshistorie();
		Lichtschalter schalter = new Lichtschalter(bh);
		
		IBefehl befehl = new BefehlLichtAn(quelle);
		IBefehl befehl2 = new BefehlLichtAus(quelle);
		IBefehl befehl3 = new BefehlLichtDimmen(quelle);
		
		schalter.speichern(befehl);
		schalter.aktivieren();
		
		schalter.speichern(befehl2);
		schalter.aktivieren();
		
		schalter.speichern(befehl3);
		schalter.aktivieren();
		
		bh.getAllBefehle();
		
		bh.undo(befehl2); // Wird nicht funktionieren, weil nicht der letzte
		bh.undo(befehl3); 
		
		bh.getAllBefehle();
		
		
	}

}
