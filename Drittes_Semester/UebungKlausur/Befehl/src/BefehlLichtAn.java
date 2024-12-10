
public class BefehlLichtAn implements IBefehl{

	Lichtquelle quelle;
	
	public BefehlLichtAn(Lichtquelle quelle) {
		super();
		this.quelle = quelle;
	}



	@Override
	public void fuehreAus() {
		// TODO Auto-generated method stub	
		quelle.LichtAn();
	}
}
