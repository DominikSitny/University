package Probeklausur_PfA;

public class Auto {
	private String marke;
	private int ps;
	private static int anzahl;
	
	public Auto() {
		Auto.anzahl++;
	}
	
	public String toString() {
		return "Marke: " + marke + " PS: " + ps + " Anzahl: " + anzahl; 
	}
	
	public int getAnzahl() {
		return Auto.anzahl;
	}
	
	public void setMarke(String marke) {
		this.marke = marke;
	}
	
	public String getMarke() {
		return this.marke;
	}
	
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	public int getPs() {
		return this.ps;
	}
}
