import java.util.Comparator;

public class StudentSortByNames implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub	
		int compare = o1.getNachname().compareTo(o2.getNachname());	
		if(compare == 0) {
			compare =  o1.getVorname().compareTo(o2.getVorname());
		}
		return compare;
	}

}
