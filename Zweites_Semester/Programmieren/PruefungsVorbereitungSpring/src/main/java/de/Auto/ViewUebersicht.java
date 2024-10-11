package de.Auto;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.springframework.stereotype.Component;

import de.Verwaltung.Verwaltung;

@Component
public class ViewUebersicht extends JFrame{
	
	private Verwaltung<Auto> verwaltung;
	private AutoTableModel model;

	public ViewUebersicht(Verwaltung<Auto> verwaltung) {
		
		this.verwaltung = verwaltung;
		
		this.model = new AutoTableModel(this.verwaltung.getList());
		
		setTitle("Liste der Autos");
		
		JFrame mainWindow = new JFrame("Huhu");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainWindow.setBounds(0, 0, 500, 300);
		
		JScrollPane scrollPane = new JScrollPane();
		
		this.model = new AutoTableModel(verwaltung.getList());
		
		JTable table = new JTable(this.model);
		
		scrollPane.setViewportView(table);
		
		mainWindow.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JButton btnAddAuto = new JButton("neues Auto");
		
		btnAddAuto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			//	new ViewCreateAuto(verwaltung, model);
		
			}
		
			
		});
		
		mainWindow.getContentPane().add(btnAddAuto, BorderLayout.SOUTH);
		
		mainWindow.setVisible(true);
	
		
	}
	
}
