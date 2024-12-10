
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lichtquelle quelle = new Lichtquelle();
		
		Lichtschalter schalter = new Lichtschalter();
		
		IBefehl befehl = new BefehlLichtAn(quelle);
		IBefehl befehl2 = new BefehlLichtAus(quelle);
		
		schalter.speichern(befehl);
		schalter.aktivieren();
		
		schalter.speichern(befehl2);
		schalter.aktivieren();
		
	}

}
