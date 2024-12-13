package Uebungsblatt4.aufgabe3.Programmierbeispiel.model;

import Uebungsblatt4.aufgabe3.Programmierbeispiel.view.IObserverInterface;

public interface IObservableInterface {
	
	public void registerObserver (IObserverInterface o); 
	public void removeObserver (IObserverInterface o); 
	public void notifyObservers(); 
	
}
