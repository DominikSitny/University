import java.util.Comparator;

public class StudentSortByTelefonnumbers implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getTelefonNr()[1].compareTo(o2.getTelefonNr()[1]);
	}
	
}
