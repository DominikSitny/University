import java.util.Iterator;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentlist liste = new Studentlist();
		for(int i =0; i<10;i++) {
			liste.addStudent(new Student());
		}
		Iterator it = liste.createIterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}
