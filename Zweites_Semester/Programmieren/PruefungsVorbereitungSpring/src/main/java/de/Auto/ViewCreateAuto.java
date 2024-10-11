package de.Auto;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.Verwaltung.Verwaltung;

public class ViewCreateAuto extends JFrame{
	
	JTextField tfMarke = new JTextField("", 15);
	JTextField tfBez = new JTextField("", 15);
	
	private Verwaltung<Auto> verwaltung;
	private AutoTableModel model;

	public ViewCreateAuto(Verwaltung<Auto> verwaltung, AutoTableModel model) {
		
		this.verwaltung = verwaltung;
		this.model = model;
		
		JFrame frame = new JFrame("Auto hinzufügen");
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3,2));
		
		panel.add(new JLabel("Marke"));
		
		panel.add(tfMarke);
		
		panel.add(new JLabel("Bezeichnung"));
		
		panel.add(tfBez);
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		
		JButton btn = new JButton("Erstellen");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Auto car = new Auto();		
				car.setMarke(tfMarke.getText());
				car.setBezeichnung(tfBez.getText());
				
				verwaltung.addElement(car);
				
				update(verwaltung, model);
				
				new ViewUebersicht(verwaltung);
				
			}
		});
		
		frame.getContentPane().add(btn, BorderLayout.SOUTH);	
		frame.pack();	
		frame.setVisible(true);
		
	}
	
	public void update(Verwaltung<Auto> verwaltung, AutoTableModel model) {

		model = new AutoTableModel(verwaltung.getList());
		model.fireTableDataChanged();
	}
	
}
