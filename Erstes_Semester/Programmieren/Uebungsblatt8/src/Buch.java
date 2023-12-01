
public class Buch {

	private String name;
	private int artikelnummer;
	private double preis;
	private int bestand;
	
	public Buch(double preis, int bestand) {
		
		this.name =  "Name";
		this.artikelnummer = 1;
		setBestand(bestand);
		setPreis(preis);
		
	}
	
	public String toString() {
		return "Name: " + getName() + ", Artikelnummer: " + getArtikelnummer() +
				", Preis: " + getPreis() + ", Bestand: " + getBestand() + ";";
	}

	public String getName() {
		return name;
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}


	public void setBestand(int bestand) {
		this.bestand = bestand;
	}
	
	public int getBestand() {
		return this.bestand;
	}
	
	
}
