package de.Auto;

public class Auto implements Comparable<Auto>{

	private int id;
	private String bezeichnung;
	private String marke;
	private String farbe;
	private int ps;
	private static int counter;
	
	public Auto() {
		setId();
	}
	
	// Es wird nach marke und danach nach bezeichnung sortiert
	@Override
	public int compareTo(Auto o) {
		// TODO Auto-generated method stub	
		int compare = this.marke.compareTo(o.getMarke());
		
		if(compare == 0) {
			compare = this.bezeichnung.compareTo(o.getBezeichnung());
		}	
		return compare;
	}


	public int getId() {
		return id;
	}


	public void setId() {
		this.id = counter++;
	}


	public String getBezeichnung() {
		return bezeichnung;
	}


	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}


	public String getMarke() {
		return marke;
	}


	public void setMarke(String marke) {
		this.marke = marke;
	}


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	public int getPs() {
		return ps;
	}


	public void setPs(int ps) {
		this.ps = ps;
	}
	
	
	
}
