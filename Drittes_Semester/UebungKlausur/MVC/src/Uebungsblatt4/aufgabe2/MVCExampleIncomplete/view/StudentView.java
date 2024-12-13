package Uebungsblatt4.aufgabe2.MVCExampleIncomplete.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.controller.StudentController;
import Uebungsblatt4.aufgabe2.MVCExampleIncomplete.model.StudentModel;

public class StudentView extends JFrame implements Observer, ActionListener {
	private StudentController controller;
	private StudentModel model;
	
	JPanel viewPanel;
	JLabel semesterLabel;
	JLabel studentLabel;
	
	JFrame controlFrame;
	JPanel controlPanel;
	JButton increaseButton;

	
	public StudentView(StudentController scontroller, StudentModel smodel)
	{
		controller = scontroller;
		model = smodel;
		model.register(this);
	}
	
	public void createElements()
	{
		viewPanel = new JPanel(new GridLayout(1,2));
		studentLabel = new JLabel(model.getName());
		semesterLabel = new JLabel(model.getSemesterString());
		viewPanel.add(studentLabel);
		viewPanel.add(semesterLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(viewPanel,BorderLayout.CENTER);
		pack();
		setVisible(true);
		
	}
	
	
	public void createControlElements()
	{
		controlPanel = new JPanel(new GridLayout(1,2));
		increaseButton = new JButton("Increase");
		increaseButton.addActionListener(this);
		controlPanel.add(increaseButton);
		controlFrame = new JFrame("Control Panel");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.getContentPane().add(controlPanel,BorderLayout.CENTER);
		controlFrame.pack();
		controlFrame.setVisible(true);
	}
	
	public void update()
	{
		
		// Hier vervollst�ndigen
		createElements();
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == increaseButton)
		{
			// Hier vervollst�ndigen
			this.model.increaseSemester();
			update();
		}
		
	}
}