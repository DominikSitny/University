package com.example.observer.instance;

	public interface Fuehler {
	public void registriereBeobachter(Anzeige a);
	public void entferneBeobachter(Anzeige a);
	public String gibZustand();
	public void aktualisieren();
	
}
