package de.Auto.Sortieren;

import java.util.Comparator;

import de.Auto.Auto;

public class SortierId implements Comparator<Auto>{

	@Override
	public int compare(Auto o1, Auto o2) {
		// TODO Auto-generated method stub
		if(o1.getId() > o2.getId()) {
			return 1;
		}
		else if(o1.getId() < o2.getId()){
			return -1;
		}else {
			return 0;
		}
	}

}
