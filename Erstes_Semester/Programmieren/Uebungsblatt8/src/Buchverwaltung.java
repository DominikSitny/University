
public class Buchverwaltung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menge = 30;
		
		Buch[] arrBuch = new Buch[menge];
		for(int i=0;i<menge;i++) {
			Buch buch = new Buch("Name", i, 9.99, i);
			arrBuch[i] = buch;
		}
		
		arrBuch[0].setPreis(10); 
		
		for (int i=0;i<arrBuch.length;i++) {
			System.out.println(arrBuch[i].toString());
		}
	}
	
}
