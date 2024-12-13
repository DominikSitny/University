package Uebungsblatt4.aufgabe3.Programmierbeispiel.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import Uebungsblatt4.aufgabe3.Programmierbeispiel.controller.IControllerInterface;
import Uebungsblatt4.aufgabe3.Programmierbeispiel.controller.TableViewController;
import Uebungsblatt4.aufgabe3.Programmierbeispiel.model.IModelInterface;

public class TableView implements IObserverInterface{

	private IControllerInterface m_controller; 
	private IModelInterface m_model; 
	private JTextField m_redTextField = new JTextField(10);
	private JTextField m_greenTextField = new JTextField(10);
	private JTextField m_blueTextField = new JTextField(10);
	
	
	public TableView(IModelInterface m_model) {
		
		createComponents();
		this.m_model = m_model;
		m_model.registerObserver(this); 
		m_controller = new TableViewController(m_model, this); 
	     
	}

	// Update-Methode wird nach erfolgter Datenaenderung vom  
	   // Model aufgerufen. Da die Datenaenderung nach Eingabe vom  
	   // Benutzer ueber die TableView-Klasse erfolgt, und – in    
	   // unserem Beispiel – von nirgendwo sonst, muessen die    
	   // angezeigten Daten hier nicht nochmal aktualisiert werden.
	@Override
	public void update() {
		// TODO Auto-generated method stub
		// Beipiel für eine Änderung 
		
	}

	public void createComponents(){   
		JFrame frame = new JFrame("TableView");
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 500, 300);

		JButton m_setButton = new JButton ("Set"); 
		m_setButton.addActionListener(new ActionListener() { 
    	  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 m_controller.setValues( m_redTextField.getText(), m_greenTextField.getText(),  m_blueTextField.getText()); 
			} 
		}); 
	      
		panel.add(m_redTextField);
		panel.add(m_greenTextField);
		panel.add(m_blueTextField);
		panel.add(m_setButton);
		frame.add(panel);
      frame.setVisible(true);
      
	      
	      
	   } 
	
}
