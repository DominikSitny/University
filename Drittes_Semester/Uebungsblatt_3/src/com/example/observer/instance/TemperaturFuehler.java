package com.example.observer.instance;

public class TemperaturFuehler implements Fuehler{

	private int temperature = 30;
	private Anzeige anzeige;
	
	@Override
	public void registriereBeobachter(Anzeige a) {
		// TODO Auto-generated method stub
		this.anzeige = a;
	}
	@Override
	public void entferneBeobachter(Anzeige a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String gibZustand() {
		// TODO Auto-generated method stub
		return Integer.toString(temperature);
	}
	@Override
	public void aktualisieren() {
		// TODO Auto-generated method stub
		temperature ++;
		
		anzeige.aktualisieren(this);
	}
	
	
	
	

}
