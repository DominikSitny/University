package Uebungsblatt4.aufgabe3.ProgrammierbeispielMitObserver.View;

import Uebungsblatt4.aufgabe3.ProgrammierbeispielMitObserver.Model.IModelInterface;

public class ConsoleView implements IObserverInterface {

	@Override
	public void update(IModelInterface model) {
		// TODO Auto-generated method stub
		System.out.println("Blue (Der Letzte): " + model.getBluePercentage());
		
	}


}
