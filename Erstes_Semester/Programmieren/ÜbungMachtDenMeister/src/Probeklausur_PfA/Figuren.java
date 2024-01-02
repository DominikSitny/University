package Probeklausur_PfA;

public class Figuren {

	public static void draw() {
		int zahl=5;
		for(int y=0;y<zahl;y++) {
			for(int x=0;x<zahl;x++) {
				if(x<y) {
					System.out.print("-");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
	}
	
}
