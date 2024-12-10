
public class KonkretesProduktSchraube implements AbstraktesProdukt {

	private String name;
	
	public KonkretesProduktSchraube(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
