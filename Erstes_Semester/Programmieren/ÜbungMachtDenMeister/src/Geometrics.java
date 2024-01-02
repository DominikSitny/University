
public class Geometrics {
	
	private int x;
	private int y;

	public Geometrics(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void createFilledCircle() {

		for(int i=0;i<this.y;i++) {
			for(int z=0;z<this.x;z++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}
	public void createOutlineCircle() {
		
		for(int i=0;i<this.y;i++) {
			for(int z=0;z<this.x;z++) {
				if(z==0 || z==x-1 || i==0 || i==y-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
	}
	public void createOutlineTriangleRight(int reihen) {	
		int counter = 0;
		for(int i=0;i<reihen*2-1;i++) {
			if(i>=reihen) {
				counter--;
			}else {
				counter++;
			}
			for(int z=0;z<reihen;z++) {
				if((z==0 || z==i) && i<reihen) {
					System.out.print("*");
				}			
				else if(i>=reihen && (z==0||z==counter-1)) {
					System.out.print("*");
				}		
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");		
		}
	}
	public void createFilledTriangleRight(int reihen) {	
		int counter = 0;
		for(int i=0;i<reihen*2-1;i++) {
			if(i>=reihen) {
				counter--;
			}else {
				counter++;
			}
			for(int z=0;z<reihen;z++) {
				if(z<=i && i<reihen) {
					System.out.print("*");
				}			
				if(i>=reihen && z < counter) {
					System.out.print("*");
				}		
			}
			System.out.println("");		
		}
	}
	
	
	
}
