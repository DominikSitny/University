import java.util.Comparator;

public class StudentSortByFirstnames implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int compare = o1.getVorname().compareTo(o2.getVorname());
		if(compare==0) {
			o1.getNachname().compareTo(o2.getNachname());
		}
		return compare;
	}

	
	
}
