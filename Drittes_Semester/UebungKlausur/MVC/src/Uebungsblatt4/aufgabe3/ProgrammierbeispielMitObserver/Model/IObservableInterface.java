package Uebungsblatt4.aufgabe3.ProgrammierbeispielMitObserver.Model;

import Uebungsblatt4.aufgabe3.ProgrammierbeispielMitObserver.View.IObserverInterface;

public interface IObservableInterface {
	
	public void registerObserver (IObserverInterface o); 
	public void removeObserver (IObserverInterface o); 
	public void notifyObservers(); 
	
}
