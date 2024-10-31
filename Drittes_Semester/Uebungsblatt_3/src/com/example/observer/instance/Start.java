package com.example.observer.instance;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TemperaturFuehler fuehler = new TemperaturFuehler();
		Anzeige anzeige = new TemperaturAnzeigeFahrenheit();
		
		fuehler.registriereBeobachter(anzeige);
		
		for (int i = 1; i<10; i++) {
			fuehler.aktualisieren();
			sleep();
		}
	}
		
	private static void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
