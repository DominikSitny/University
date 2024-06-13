import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentTableView {
	private JFrame jframe = new JFrame("Studententabelle");
	private JTable table;
	private JButton btnLoeschen = new JButton("Löschen");
	private JButton btnHinzufügen = new JButton("Hinzufügen");
	private JScrollPane scrollPane = new JScrollPane();
	private List<Student>list = new ArrayList<Student>();
	private StudentenTableModel tableModel;
	
	public void openView(List<Student>list) {
			this.list = list;
			tableModel = new StudentenTableModel(list);
			table = new JTable(tableModel);
			jframe.setVisible(true);
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jframe.setBounds(0, 0, 500, 300);
			jframe.getContentPane().add(scrollPane, BorderLayout.CENTER);
			scrollPane.setViewportView(table);
			setBottomView();
			setTopView();		
			jframe.setJMenuBar(setMenue());
	}
	private void setBottomView() {
		JPanel group = new JPanel();
		this.btnHinzufügen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				list.add(new Student(true));
				tableModel.fireTableDataChanged();
			}
		});	
		this.btnLoeschen.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				deleteRow();
			}
		});		
		group.add(btnLoeschen);
		group.add(btnHinzufügen);
		jframe.getContentPane().add(group,BorderLayout.SOUTH);
	}
	
	private void setTopView() {
		JComboBox<String> dropDown = new JComboBox<String>();
		for(String columnName : StudentenTableModel.columnNames) {
			dropDown.addItem(columnName);
		}
		dropDown.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				switch(dropDown.getSelectedIndex()) {
				case 0: 
					Collections.sort(list);
					tableModel.fireTableDataChanged();
					break;
				case 1: 
					Collections.sort(list, new StudentSortByFirstnames());
					tableModel.fireTableDataChanged();
					break;
				case 2: 
					Collections.sort(list, new StudentSortByNames());
					tableModel.fireTableDataChanged();
					break;
				case 3: 
					Collections.sort(list, new StudentSortByTelefonart());
					tableModel.fireTableDataChanged();
					break;
				case 4: 
					Collections.sort(list, new StudentSortByTelefonnumbers());
					tableModel.fireTableDataChanged();
					break;
				default: System.out.println("Fehler: Ungültiges Feld im DropDown eingegeben.");
				}			
			}
		});
		jframe.getContentPane().add(dropDown,BorderLayout.NORTH);
	}
	
	public JMenuBar setMenue() {
		JMenuBar menue = new JMenuBar();
		JMenu filemenu = new JMenu("Datei");
		JMenuItem oeffnen = new JMenuItem("Öffnen");
		oeffnen.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(Student s : StudentenTableController.readDataFromText(getFileChooser())) {
					if(s instanceof Student) {
						list.add(s);
					}
				}
				tableModel.fireTableDataChanged();
			}
		});
		JMenuItem speichern = new JMenuItem("Speichern");
		speichern.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentenTableController.saveDataInTxt(getFileChooser(), list);
			}
		});
		JMenuItem zuruecksetzen = new JMenuItem("Zurücksetzen");
		zuruecksetzen.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentenTableController.saveDataInTxt(getFileChooser(), Student.getNames());
			}
		});
		JMenuItem beenden = new JMenuItem("Beenden");
		beenden.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});		
		JMenu helpmenu = new JMenu("Hilfe");
		JMenuItem ueber = new JMenuItem("Über...");	
		ueber.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Dominik Sitny");
			}
		});	
		filemenu.add(oeffnen);
		filemenu.add(speichern);
		filemenu.add(zuruecksetzen);
		filemenu.add(beenden);	
		helpmenu.add(ueber);
		menue.add(filemenu);
		menue.add(helpmenu);
		return menue;
	}
	
	public File getFileChooser() {	
		 final JFileChooser fc = new JFileChooser("/Users/dominiksitny/Development/University/Zweites_Semester/Programmieren/Uebungsblatt_7_8/src/");
		 fc.showSaveDialog(null);
		 return fc.getSelectedFile();	 
	}
	
	public void deleteRow() {
		if(this.table.getSelectedRow()>-1) {
			StudentenTableModel model = new StudentenTableModel(this.list);
			model.deleteStudent(this.table.getSelectedRow());
			this.list = model.getStudents();
			this.tableModel.fireTableDataChanged();
		}
	}

}
