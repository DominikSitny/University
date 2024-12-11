package Uebungsblatt4.aufgabe3.Programmierbeispiel.controller;

import Uebungsblatt4.aufgabe3.Programmierbeispiel.model.IModelInterface;
import Uebungsblatt4.aufgabe3.Programmierbeispiel.view.TableView;

public class TableViewController implements IControllerInterface{

	  private IModelInterface m_model; 
	   private TableView m_tableView; 
	   public TableViewController (IModelInterface model, TableView tableView) { 
	      m_tableView = tableView; 
	      m_model = model; 
	   }
	   public void setValues (String red, String green, String blue) 
	   { 
	      int r = 0; 
	      int b = 0; 
	      int g = 0; 
	  
	      b = Integer.parseInt(blue); 
	     
	      g = Integer.parseInt(green); 
	
	      r = Integer.parseInt(red); 

	      m_model.setBlueValue(b); 
	      m_model.setGreenValue(g); 
	      m_model.setRedValue(r); 

	   } 
	
}
