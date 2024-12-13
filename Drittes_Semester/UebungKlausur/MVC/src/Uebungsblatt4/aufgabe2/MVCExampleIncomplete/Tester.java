package Uebungsblatt4.aufgabe2.MVCExampleIncomplete;
import java.util.Vector;

import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.controller.StudentController;
import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.model.Role;
import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.model.StudentModel;
import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.view.StudentView;


public class Tester {

	public static void main(String[] args)
	{
		StudentModel studentModel = null;
		try {
			studentModel = new StudentModel("Meier", "432843", 3, Role.Sachbearbeiter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StudentController studentController = new StudentController(studentModel);
		StudentView studentView = new StudentView(studentController, studentModel);
		studentView.createControlElements();
		studentView.createElements();
	}
}
