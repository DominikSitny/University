import java.util.Comparator;

public class StudentSortByTelefonart implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int compare = o1.getTelefonNr()[0].compareTo(o2.getTelefonNr()[0]);
	    if (compare == 0) {
	        compare = o1.getTelefonNr()[1].compareTo(o1.getTelefonNr()[1]);
	    }
	    return compare;
	}

}
