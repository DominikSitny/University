package de.Auto;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import de.Verwaltung.Verwaltung;

public class AutoTableModel extends AbstractTableModel{

	Verwaltung<Auto> verwaltung = new Verwaltung<Auto>();
	
	String[] columnNames = {"Id", "Marke", "Bezeichnung"};
	
	public AutoTableModel(List<Auto> list) {
		this.verwaltung.listToArray(list);
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return verwaltung.getList().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub	
		switch(columnIndex) {
		case 0: return verwaltung.getList().get(rowIndex).getId();
		case 1: return verwaltung.getList().get(rowIndex).getMarke();
		case 2: return verwaltung.getList().get(rowIndex).getBezeichnung();
		default: return null;
		}
	}
	
	public void setValueAt(Object object, int row, int col) {
		Auto auto = this.verwaltung.getList().get(row);
		switch(col) {
		case 1: if(object instanceof String) {
			auto.setMarke((String)object);
			break;
		}
		case 2: if(object instanceof String) {
			auto.setBezeichnung((String)object);
			break;
		}
		default:break;
		}
		this.verwaltung.addElement(auto, col);
	}

}
