
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StartFrame extends JFrame{

	/**
	 * Aufgabe 1 übersprungen
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField textfield = new JTextField(10);

	public StartFrame() {
		setTitle("Anfangsbildschirm");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Laden");
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e ) {
				// TODO Auto-generated method stub
				File f = getFileChooser();
				ArrayList<String> list = readFile(f);
				textfield.setText(Integer.toString(getRows(list)));

			}
		});
		JLabel label = new JLabel("Anzahl Zeilen: ");
		this.textfield.setEditable(false);
		final var flowLayout = new FlowLayout();
		getContentPane().setLayout(flowLayout);
		add(label);
		add(textfield);
		add(btn);
		pack();
	}
	
	
	public File getFileChooser() {
	 			
		 final JFileChooser fc = new JFileChooser("/Users/dominiksitny/Development/University/Zweites_Semester/Programmieren/Uebungsblatt_5/src/");;
		 fc.showSaveDialog(null);
		 return fc.getSelectedFile();
		 
	}
	
	public ArrayList<String> readFile(File f) {
		try(FileReader fr = new FileReader(f)){
			 BufferedReader br = new BufferedReader(fr);
			 String zeile;
			 ArrayList<String>list = new ArrayList<String>();
			 while( (zeile = br.readLine()) != null) {
				 list.add(zeile);
			 }	 
			 return list;
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int getRows(ArrayList<String>list) {
		
		int counter = 0;
		for(String zeile : list) {
			counter++;
		}
		return counter;
	}

}
