package com.example.observer.instance;

public class TemperaturAnzeigeFahrenheit implements Anzeige{

	@Override
	public void aktualisieren(Fuehler fuehler) {
		// TODO Auto-generated method stub
		System.out.print(fuehler.gibZustand() + " Grad Celsius");
		System.out.println("    Umrechnung in Fahrenheit:" + umrechnen(fuehler.gibZustand()));
	}

	public double umrechnen(String celsius) {
		
		
		return (Double.parseDouble(celsius) * 9.0 / 5.0) + 32.0;
	}
}
