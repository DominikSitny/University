package Probeklausur_UebungZuProgrammierung;

import java.util.Random;

public class Wuerfel {

	private int augen;
	private boolean isImBecher;
	
	public Wuerfel() {
		this.augen = 0;
		this.isImBecher = true;
	}
	
	
	public void entferneWuerfel() {
		this.isImBecher = false;
	}
	public void hinzufuegeWuerfel() {
		this.isImBecher = true;
	}
	public void wurf() {
		this.isImBecher = false;
		Random r = new Random();
		this.augen = r.nextInt(6) + 1;
	}
	public int getAugen() {
		return this.augen;
	}
	public boolean isImBecher() {
		return this.isImBecher;
	}
	
}
