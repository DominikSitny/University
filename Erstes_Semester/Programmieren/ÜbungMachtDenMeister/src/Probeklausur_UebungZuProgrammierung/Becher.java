package Probeklausur_UebungZuProgrammierung;

import edu.princeton.cs.introcs.StdIn;

public class Becher {
	
	private Wuerfel[] wuerfelArr = new Wuerfel[5];
	private String name;
	
	public Becher(String name) {
		for(int i=0;i<wuerfelArr.length;i++) {
			wuerfelArr[i] = new Wuerfel();
		}
		this.name = name;
	}
	
	public void werfen() {
		for(Wuerfel wuerfel : wuerfelArr) {
			wuerfel.wurf();
		}
	}
	
	public void zeigeWuerfel() {
		System.out.println(this.name + "deine Würfel zeigen folgende Werte: ");
		int counter=1;
		for(Wuerfel wuerfel : this.wuerfelArr) {
			System.out.println("Wuerfel " + counter + ": " + wuerfel.getAugen());
			counter++;
		}
	}
	
	public int bewerten() {
		System.out.println(this.name + ", bitte gib an, welche Wuerfel du Du nochmal werfen möchtest");
		int counter=1;
		int anzahlAugen=0;
		for(Wuerfel wuerfel : wuerfelArr) {
			System.out.println("Wuerfel" + counter + " noch einmal werfen?");
			System.out.println("Ihre Eingabe (j/n)");
			String antwort = StdIn.readString();
			if(antwort.equalsIgnoreCase("y")) {
				wuerfel.wurf();
			}
			anzahlAugen += wuerfel.getAugen();
		}
		return anzahlAugen;
	}
	
	public void spielen() {
		System.out.println("Hallo " + this.name);
		System.out.println("Viel Spass beim Spiel");
		int anzahlAugen = 0;
		for(int i=1;i<=3;i++) {
			System.out.println("Wurf" + i);
			werfen();
			zeigeWuerfel();
			anzahlAugen += bewerten();
		}
		System.out.println("Spieler " + this.name + " hat die maximale Summe von " + anzahlAugen + " erreicht!");
		System.out.println("Spielrunde beendet!");
	}
	
	
}
