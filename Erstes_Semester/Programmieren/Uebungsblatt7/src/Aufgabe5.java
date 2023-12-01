
public class Aufgabe5 {

	public int frageInt(String frage, int min, int max, int eingabe) {
		
		System.out.println(frage);
		
		if(eingabe>=min && eingabe<=max) {
			return eingabe;
		}
		else {
			frageInt("", 0,10,7);
		}
		return eingabe;
		
	}
	
	
	public void aufgabe5() {
		
		
		
	}
	
}
