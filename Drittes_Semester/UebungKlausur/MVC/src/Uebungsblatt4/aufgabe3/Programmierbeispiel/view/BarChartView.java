package Uebungsblatt4.aufgabe3.Programmierbeispiel.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Uebungsblatt4.aufgabe3.Programmierbeispiel.model.IModelInterface;

public class BarChartView implements IObserverInterface{

   IModelInterface m_model; 
   JFrame m_viewFrame; 
   JPanel m_viewPanel; 
   public BarChartView (IModelInterface model) {
	   	  createComponents(); 
	      m_model = model; 
	      model.registerObserver (this); 
	  
   }
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		double red = m_model.getRedPercentage(); 
	    double green = m_model.getGreenPercentage(); 
	    double blue = m_model.getBluePercentage(); 
	    m_viewPanel = createChartPanel(red, green, blue); 
	}

	public void createComponents() 
	   { 
	      
	   } 
	
	private JPanel createChartPanel (final double red,  
		      final double green, final double blue) 
		   {
			return m_viewPanel; 
		    
		   } 
	
}
