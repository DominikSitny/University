
public class BefehlLichtAn implements IBefehl{

	@Override
	public String toString() {
		return "BefehlLichtAn []";
	}



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



	@Override
	public IBefehl undo() {
		// TODO Auto-generated method stub
		return this;
	}
}
