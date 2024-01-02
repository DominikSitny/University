package Uebung9Und10;

public class VierGewinnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hallo zum Spiel Vier Gewinnt!");
		
		Spielfeld s = new Spielfeld();
		
		s.spArr[2][3] = new Spielstein(s,false);
		s.spArr[1][2] = new Spielstein(s,true);
		s.spArr[1][1] = new Spielstein(s,false);
		
		s.draw();
		
	}

}
