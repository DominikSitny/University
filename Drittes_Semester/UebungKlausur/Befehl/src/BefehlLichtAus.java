
public class BefehlLichtAus implements IBefehl{

	Lichtquelle quelle;

	
	public BefehlLichtAus(Lichtquelle quelle) {
		super();
		this.quelle = quelle;
	}


	@Override
	public void fuehreAus() {
		// TODO Auto-generated method stub
		this.quelle.LichtAus();
	}


	

}
