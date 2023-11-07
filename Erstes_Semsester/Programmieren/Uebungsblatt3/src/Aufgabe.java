import edu.princeton.cs.introcs.StdDraw;

public class Aufgabe {

	public void aufgabe2() {
		
		
		final int x = 100;
		final int y = 100;
		final int size = 5;
		final int mittelPunktX = 20;
		final int mittelPunktY = 40;
		
		StdDraw.setXscale(0, x);
		StdDraw.setYscale(0, y);
		StdDraw.line(mittelPunktX, y, mittelPunktX, 0);
		StdDraw.square(mittelPunktX, mittelPunktY-size, size);
		StdDraw.circle(mittelPunktX, mittelPunktY+size, size);
		StdDraw.square(mittelPunktX, mittelPunktY+size*3, size);
		StdDraw.circle(mittelPunktX, mittelPunktY-size*3, size);
	}
	
}
