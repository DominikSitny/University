
public class ProxyDateizugriff implements IDateizugriff{

	private IDateizugriff zugriff;
	private String name;
	
	
	public ProxyDateizugriff(String name) {
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
		if(this.zugriff == null) {
			this.zugriff = new Dateizugriff(name);
		}
		return this.zugriff.getInhalt();
	}

}
