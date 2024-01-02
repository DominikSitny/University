public class SpielfeldVierGewinnt {
    public static void main(String[] args) {
        zeichneSpielfeld(7, 6);
    }

    public static void zeichneSpielfeld(int anzZeilen, int anzSpalten) {
        final double border = 0.7;

        final double MAX_X = 100.0;
        final double MAX_Y = 100.0;
        StdDraw.setXscale(0.0, MAX_X);
        StdDraw.setYscale(0.0, MAX_Y);

        final double breite = MAX_X / anzSpalten;
        final double hoehe = MAX_Y / anzZeilen;

        final double radius = Math.min(breite, hoehe) / 2.0 * border;

        for(int zeile=0; zeile<anzZeilen; ++zeile) {
            for (int spalte = 0; spalte < anzSpalten; ++spalte) {
                StdDraw.circle(spalte * breite + breite / 2.0,
                        zeile * hoehe + hoehe / 2.0,
                        radius);
            }

        }
    }
}
