import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Playerfield {

	Color colorLeft = StdDraw.BLUE;
	Color colorUp = StdDraw.GREEN;
	Color colorRight = StdDraw.RED;
	Color colorDown = StdDraw.YELLOW;
	Color colorDefault = StdDraw.GRAY;
	
	// private Player[] players;
	
	
	public void draw() {
		
		StdDraw.setCanvasSize(900, 700);
		
		StdDraw.line(0, 0.5, 1, 0.5);
		StdDraw.line(0.5, 0, 0.5, 1);
		
		double x=0.5;
		double y=0.5;
		
		for(int i=1;i<=4*2+1;i=i+2) {
			
			if(i == 4*2+1) {
				colorLeft = colorDefault ;
				colorUp = colorDefault;
				colorRight = colorDefault;
				colorDown = colorDefault;
			}
			
			x = x - 0.04 * i;
			
			generateInnerField(x, 0.5, colorLeft, 0.04);

			
			generateInnerField(x, 0.5 - 0.04, colorDefault, 0.05);
			
			generateInnerField(x, 0.5 + 0.04, colorDefault, 0.05);		
		
			x = x + 0.08 * i; 
		
			generateInnerField(x, 0.5, colorRight, 0.04);
			
			generateInnerField(x, 0.5 - 0.04, colorDefault, 0.05);
			
			generateInnerField(x, 0.5 + 0.04, colorDefault, 0.05);
			x = x - 0.04 * i;
			y = y - 0.04 * i;
			generateInnerField(0.5, y, colorDown, 0.04);
			
			generateInnerField(0.5 - 0.04, y, colorDefault, 0.05);
			
			generateInnerField(0.5 + 0.04, y, colorDefault, 0.05);
			
			y = y + 0.08 * i; 
	
			generateInnerField(0.5, y, colorUp, 0.04);
			
			generateInnerField(0.5 - 0.04, y, colorDefault, 0.05);
			
			generateInnerField(0.5 + 0.04, y, colorDefault, 0.05);
			y = y - 0.04 * i;

		}
		
	}
	
	public void generateInnerField(double x, double y, Color color, double size) {
		StdDraw.setPenRadius(size);
		StdDraw.setPenColor(color);
		StdDraw.point(x, y);
		
	}
	
}
