package Uebung9Und10;

import edu.princeton.cs.introcs.StdDraw;

public class Spielfeld {
	
	public final int xScale = 100;
	public final int yScale = 100;
	
	public final int zeilen = 4;
	public final int spalten = 8;
	
	public double radius;	
	
	public Spielstein[][] spArr = new Spielstein[zeilen][spalten];
	
	public Spielfeld() {
		if(this.zeilen>this.spalten) {
			this.radius =  this.yScale / this.zeilen * 0.35;
		}else {
			this.radius =  this.xScale / this.spalten * 0.35 ;
		}
	}
	
	public void draw() {
		
		StdDraw.setXscale(0, xScale);
		StdDraw.setYscale(0,yScale);
		
		for(int y = 0; y<zeilen;y++) {
			for(int x=0;x<spalten;x++) {
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.circle((xScale/spalten)* x + (xScale/spalten) * 0.5 , (yScale/zeilen)* y + (yScale/zeilen) * 0.5, this.radius);
				if (spArr[y][x] != null) {
					spArr[y][x].draw(x, y);
				}
			}
		}
		
	}

}
