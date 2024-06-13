import java.util.Comparator;

public class StudentSortMatrnr implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

		if(o1.getMatrikelNr() > o2.getMatrikelNr()) {
			return 1;
		}
		else if(o1.getMatrikelNr() == o2.getMatrikelNr()) {
			return 0;
		}
		else {
			return -1;
		}
	}

	

}
