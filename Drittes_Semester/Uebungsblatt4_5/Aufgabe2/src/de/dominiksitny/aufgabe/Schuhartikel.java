package de.dominiksitny.aufgabe;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Schuhartikel")
public class Schuhartikel extends Artikel{

	public Schuhartikel(String beschreibung, String status, String marke, double preis,
			String schuhart, String obermaterial, String innenmaterial, String sohlenmaterial) {
		super(beschreibung, status, marke, preis);
		this.schuhart = schuhart;
		this.obermaterial = obermaterial;
		this.innenmaterial = innenmaterial;
		this.sohlenmaterial = sohlenmaterial;
	}
	
	public Schuhartikel() {
		
	}

	private String schuhart;
	
	private String obermaterial;
	
	private String innenmaterial;
	
	private String sohlenmaterial;

	public String getSchuhart() {
		return schuhart;
	}

	public void setSchuhart(String schuhart) {
		this.schuhart = schuhart;
	}

	public String getObermaterial() {
		return obermaterial;
	}

	public void setObermaterial(String obermaterial) {
		this.obermaterial = obermaterial;
	}

	public String getInnenmaterial() {
		return innenmaterial;
	}

	public void setInnenmaterial(String innenmaterial) {
		this.innenmaterial = innenmaterial;
	}

	public String getSohlenmaterial() {
		return sohlenmaterial;
	}

	public void setSohlenmaterial(String sohlenmaterial) {
		this.sohlenmaterial = sohlenmaterial;
	}
	
	
	
}
