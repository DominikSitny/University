
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class StudentenTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public final static String[]columnNames = {"Matrikelnr", "Vorname", "Nachname", "TelefonArt", "Telefonnr"};
	private List<Student>students = new ArrayList<Student>();
	
	public StudentenTableModel(List<Student>students) {
		this.students = students;
	}
	
	public String getColumnName(int col) {
		return columnNames[col];
		
	}
	
	public boolean isCellEditable(int row, int column) {
		if(column == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.students.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return StudentenTableModel.columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch(columnIndex){
		case 0: return this.students.get(rowIndex).getMatrikelNr();
		case 1: return this.students.get(rowIndex).getVorname();
		case 2:	return this.students.get(rowIndex).getNachname();
		case 3: return this.students.get(rowIndex).getTelefonNr()[0];
		case 4: return this.students.get(rowIndex).getTelefonNr()[1];
		
		}
		return null;
	}
	
	public void setValueAt(Object o, int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0: this.students.get(rowIndex).setMatrikelNr((Integer)o);
			break;
		case 1: this.students.get(rowIndex).setVorname((String)o);
			break;
		case 2:	this.students.get(rowIndex).setNachname((String)o);
			break;
		case 3:
		case 4: 
			String[]telefon = {this.students.get(rowIndex).getTelefonNr()[0],this.students.get(rowIndex).getTelefonNr()[1]};
			this.students.get(rowIndex).setTelefonNr(telefon);
			break;
		default: System.out.println("Fehler: setValue unerwarteter columnIndex. Index= " + columnIndex);
		}
		
	}
	
	public void deleteStudent(int index) {
		this.students.remove(index);
	}

	public List<Student> getStudents() {
		return students;
	}	
	
}
