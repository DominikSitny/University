import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> sortedList = new ArrayList<Student>();
		
		for(int i = 0; i<20; i++) {
			Student s = new Student();
			sortedList.add(s);
			System.out.println(s.getMatrikelNr());
		}
		
		Collections.sort(sortedList, new StudentSortMatrnr());
		
		System.out.println("-------------------------");
		for(Student s : sortedList) {
			System.out.println(s.getMatrikelNr());
			try {
				// Irgendeine Funktion soll aufgerufen werden, um eine NullPointer zu erzwingen
				s.getNachname().charAt(0); 
			}catch(NullPointerException ne) {
				System.out.println("Nachname: leer");
			}
		}
	}

}
