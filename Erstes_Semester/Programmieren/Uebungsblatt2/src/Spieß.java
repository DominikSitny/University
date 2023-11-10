import edu.princeton.cs.introcs.StdDraw;

public class Spieß {

	public void draw() {
		int x = 100;
		int y = 100;
		int size = 10;
		
		StdDraw.setXscale(0, x);
		StdDraw.setYscale(0, y);
		StdDraw.line(x/2, y, x/2, 0);
		StdDraw.square(x/2, y-size*2, size);
		StdDraw.circle(x/2, y-size*4, size);
		StdDraw.square(x/2, y-size*6, size);
		StdDraw.circle(x/2, y-size*8, size);
	}
	
}
