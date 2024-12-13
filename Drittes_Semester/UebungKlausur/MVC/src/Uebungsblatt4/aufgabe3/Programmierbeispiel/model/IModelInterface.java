package Uebungsblatt4.aufgabe3.Programmierbeispiel.model;

public interface IModelInterface extends IObservableInterface{

	public double getRedPercentage(); 
	public double getBluePercentage(); 
	public double getGreenPercentage(); 
	public void setRedValue (int value); 
	public void setBlueValue (int value); 
	public void setGreenValue (int value); 

}
