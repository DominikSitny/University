
public class Aufgabe2 {

	int wiederholung = 5;
	
	public void wiederholeZeichen(int wiederholung) {
		
		for(int i = 0; i<wiederholung;i++) {
			
			System.out.print("*");
			
		}
		
	}
	
	public void aufgabe2() {
		for(int i=0;i<this.wiederholung;i++) {
			wiederholeZeichen(this.wiederholung);
			System.out.println("");
		}
	}
	
}
