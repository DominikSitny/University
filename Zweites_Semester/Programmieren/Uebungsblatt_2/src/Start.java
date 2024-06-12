import java.util.TreeSet;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> set = new TreeSet<Student>(); //sortierte Liste; HashSet nicht sortiert
		
		for(int i=0; i<20; i++) {
			Student s = new Student();
			System.out.println(s.getTelefonNr()[0] + ": \n"
					+ "	" + 
					s.getTelefonNr()[1]);
			set.add(s);
		}
		
		//Test, ob Sortierung klappt
		System.out.println("-------------------------------------");
		for(Student s : set) {
			System.out.println(s.getTelefonNr()[0] + ": \n"
					+ "	" + 
					s.getTelefonNr()[1]);
		}
		
		
	}

}
