package Uebungsblatt4.aufgabe3.Programmierbeispiel;

import Uebungsblatt4.aufgabe3.Programmierbeispiel.model.DataModel;
import Uebungsblatt4.aufgabe3.Programmierbeispiel.view.TableView;

public class MVCTestDrive {

	public static void main(String[] args) {
        DataModel model = new DataModel();       
        TableView tableView = new TableView (model); 
	}
	
}
