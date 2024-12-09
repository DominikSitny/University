import java.util.Vector;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPersonenLeser personenLeser = new CSVLeserAdapter("pfad");
		Vector<Person>personen = personenLeser.lesePerson();
	}

}
