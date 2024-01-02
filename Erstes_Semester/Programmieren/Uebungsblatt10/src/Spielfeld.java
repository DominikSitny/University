import edu.princeton.cs.introcs.StdDraw;

public class Spielfeld {
	
	private final double border = 0.7;

    private final double MAX_X = 100.0;
    private final double MAX_Y = 100.0;
    
    private int anzZeilen;
    private int anzSpalten;
    
    public Spielfeld(int spalten, int zeilen) {
    	this.anzSpalten = spalten;
    	this.anzZeilen = zeilen;
    	this.figuresArr = new Spielstein[spalten][zeilen];
    }
	
	public Spielstein [][] figuresArr;

    public void zeichne() {
        
        StdDraw.setXscale(0.0, MAX_X);
        StdDraw.setYscale(0.0, MAX_Y);

        final double breite = MAX_X / anzSpalten;
        final double hoehe = MAX_Y / anzZeilen;

        final double radius = Math.min(breite, hoehe) / 2.0 * border;

        for(int spalte=0; spalte<anzSpalten; ++spalte) {
            for (int zeile = 0; zeile < anzZeilen; ++zeile) {
                StdDraw.circle(spalte * breite + breite / 2.0,
                        zeile * hoehe + hoehe / 2.0,
                        radius);
            }

        }
        for(int spalte=0; spalte<anzSpalten;spalte++) {
        	
        	for(int zeile=0;zeile<anzZeilen;zeile++) {
        		
        		if(figuresArr[spalte][zeile] == null) {
        			
        		}else {
        	
        		figuresArr[spalte][zeile].zeichne(spalte * breite + breite / 2.0,
                        zeile * hoehe + hoehe / 2.0,
                        radius);
        		}
        	}
        }
    }
    public boolean steinHinzufuegen(int spalte, boolean istRot) {
    	
    	for(int i=0;i<figuresArr[spalte].length;i++) {
    		if(figuresArr[spalte][i] == null) {
    			Spielstein s = new Spielstein(istRot);
    			figuresArr[spalte][i] = s;
    			return true;
    		}
    	}  	
    	return false;
    }
    
}
