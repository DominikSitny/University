import java.util.Vector;

public class CSVLeserAdapter implements IPersonenLeser{

	private String file;
	
	public CSVLeserAdapter(String file) {
		super();
		this.file = file;
	}

	@Override
	public Vector<Person> lesePerson() {
		// TODO Auto-generated method stub
		CSVLeser csv = new CSVLeser();
		return csv.lesePersonenDatei(file);
	}
	
	

}
