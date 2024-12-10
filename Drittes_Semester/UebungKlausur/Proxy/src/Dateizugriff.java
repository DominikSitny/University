
public class Dateizugriff implements IDateizugriff{

	private String name;
	
	public Dateizugriff(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getInhalt() {
		// TODO Auto-generated method stub
		return "Name von " + this.name;
	}

	
	
}
