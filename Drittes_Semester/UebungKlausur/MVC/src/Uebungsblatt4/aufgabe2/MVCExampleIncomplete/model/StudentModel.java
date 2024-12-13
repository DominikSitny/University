package Uebungsblatt4.aufgabe2.MVCExampleIncomplete.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.controller.RoleChecker;
import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.view.Observer;

public class StudentModel implements Observable {
	Role[] roles = { Role.Sachbearbeiter };
	private String name;
	private String number;
	private int semester=0;

	private Observer view;
	
	public StudentModel(String sname, String snumber, int ssemester, Role role) throws Exception
	{
		if(RoleChecker.isAuthorized(roles, role)) {
		name = sname;
		number = snumber;
		semester = ssemester;
		}
		else {
			throw new Exception("Falsche Rolle :(");
		}
	}
	
	public void increaseSemester()
	{
		
		// Hier vervollst�ndigen
		semester++;
		
	}
	
	public void register(Observer view) {
		this.view = view;
	}

	
	public void notifyObservers() {
		view.update();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	public String getSemesterString()
	{
		String semesterString = String.valueOf(this.semester);
		return semesterString;
	}
}