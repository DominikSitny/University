import edu.princeton.cs.introcs.StdDraw;

public class Spielstein {

	public boolean istRot;
	
	public Spielstein(boolean istRot) {
		
		this.istRot = istRot;
		
	}
	
	public void zeichne(double xpos, double ypos, double radius) {
		
		if(this.istRot) {
			StdDraw.setPenColor(StdDraw.RED);
		}else {
			StdDraw.setPenColor(StdDraw.BLUE);
		}
        StdDraw.filledCircle(xpos, ypos, radius);
        StdDraw.setPenColor(StdDraw.BLACK);
	}
	
}
