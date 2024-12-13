
public class BefehlLichtAus implements IBefehl{

	@Override
	public String toString() {
		return "BefehlLichtAus []";
	}


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


	@Override
	public IBefehl undo() {
		// TODO Auto-generated method stub
		return this;
	}

}
