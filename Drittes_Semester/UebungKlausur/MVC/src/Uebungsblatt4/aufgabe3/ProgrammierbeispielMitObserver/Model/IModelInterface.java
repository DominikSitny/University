package Uebungsblatt4.aufgabe3.ProgrammierbeispielMitObserver.Model;

public interface IModelInterface extends IObservableInterface{

	public double getRedPercentage(); 
	public double getBluePercentage(); 
	public double getGreenPercentage(); 
	public void setRedValue (int value); 
	public void setBlueValue (int value); 
	public void setGreenValue (int value); 

}
