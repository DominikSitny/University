package de.Verwaltung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import de.Auto.Auto;
import de.Auto.Sortieren.SortierId;

public class Verwaltung<T> {

	private T[] array;
	
	public Verwaltung() {
		this.array = (T[]) (new Object[0]);
	}
	
	public Verwaltung(int size) {
		this.array = (T[]) (new Object[size]);
	}
	
	public void addElement(T data) {
		
		T[] copyArray = (T[]) (new Object[this.array.length + 1]);	
		for(int i = 0; i<this.array.length;i++) {
			copyArray[i] = this.array[i];
		}	
		copyArray[copyArray.length -1 ] = data ; 	
		this.array = copyArray;		
	}
	
	public String toStringAutos() {	
		String text = "";
		for(T data : this.array) {
			Auto auto = (Auto) data;
			text += auto.getId() + ";" + auto.getMarke() + ";" + auto.getBezeichnung() + "\n";
		}
		return text;
	}
	
	public void sortieren_Auto_Standard() {
		List<Auto>list = (List<Auto>)getList();
		Collections.sort(list, new SortierId());
		listToArray((List<T>)list);
	}
	public void sortieren_Auto_Marke_Bezeichnung() {
		TreeSet<T> map = new TreeSet<T>();
		for(T data : this.array) {
			map.add(data);
		}
		this.array = (T[]) (new Object[this.array.length]); 
		int i = 0;
		for(T data : map) {
			this.array[i] = data;
			i++;
		}
	}
	public List<T> getList(){
		List<T>list = new ArrayList<T>();
		for(T data : this.array) {
			list.add(data);
		}
		return list;
	}
	public void listToArray(List<T>list) {
		this.array = (T[]) (new Object[list.size()]); 
		int i = 0;
		for(T data : list) {
			this.array[i] = data;
			i++;
		}
	}
	
	public void addElement(T data, int index) {
		
		try {
			this.array[index] = data;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
