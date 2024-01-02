package Uebung9Und10;

import edu.princeton.cs.introcs.StdDraw;

public class Spielstein {

	private boolean istRot;
	private Spielfeld sf;
	
	public Spielstein(Spielfeld sf, boolean istRot) {
		this.sf = sf;
		this.istRot = istRot;
	}
	
	public void draw(int x, int y) {
			
			if(istRot) {
				StdDraw.setPenColor(StdDraw.RED);
			}else {
				StdDraw.setPenColor(StdDraw.BLUE);
			}
			StdDraw.filledCircle((sf.xScale/sf.spalten)* (x-1) + (sf.xScale/sf.spalten) * 0.5 , (sf.yScale/sf.zeilen)* (y-1) + (sf.yScale/sf.zeilen) * 0.5, sf.radius);
	}
	
}
