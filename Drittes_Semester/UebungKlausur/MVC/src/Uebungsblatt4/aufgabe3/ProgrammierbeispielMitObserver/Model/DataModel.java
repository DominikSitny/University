package Uebungsblatt4.aufgabe3.ProgrammierbeispielMitObserver.Model;

import java.util.ArrayList;

import Uebungsblatt4.aufgabe3.ProgrammierbeispielMitObserver.View.IObserverInterface;


public class DataModel implements IModelInterface{

	private int m_redValue = 0; 
    private int m_greenValue = 0; 
    private int m_blueValue = 0;    
    private ArrayList<IObserverInterface> m_observers = new ArrayList<IObserverInterface>(); 
	
	@Override
	public void registerObserver(IObserverInterface o) {
		// TODO Auto-generated method stub
		 m_observers.add (o); 
	}

	@Override
	public void removeObserver(IObserverInterface o) {
		// TODO Auto-generated method stub
		if (m_observers.contains (o)) 
	         m_observers.remove (o); 
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < m_observers.size(); ++i) {
			m_observers.get(i).update(this);
		}
	}

	@Override
	public double getRedPercentage() {
		// TODO Auto-generated method stub
		double total = m_redValue + m_greenValue + m_blueValue; 
	      if (total > 0)  
	         return m_redValue / total; 
	      return 0; 
	}

	@Override
	public double getBluePercentage() {
		// TODO Auto-generated method stub
		double total = m_redValue + m_greenValue + m_blueValue;       
	      if (total > 0)  
	         return m_blueValue / total; 
	      return 0; 
	}

	@Override
	public double getGreenPercentage() {
		// TODO Auto-generated method stub
		double total = m_redValue + m_greenValue + m_blueValue; 
	      if (total > 0)  
	         return m_greenValue / total;       
	      return 0;
	}

	@Override
	public void setRedValue(int value) {
		// TODO Auto-generated method stub
	     m_redValue = value; 
	     notifyObservers(); 
	}

	@Override
	public void setBlueValue(int value) {
		// TODO Auto-generated method stub
		m_blueValue = value; 
	      notifyObservers(); 
	}

	@Override
	public void setGreenValue(int value) {
		// TODO Auto-generated method stub
		m_greenValue = value; 
		notifyObservers(); 
	}

}
