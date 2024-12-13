
public class BefehlLichtDimmen implements IBefehl{

	@Override
	public String toString() {
		return "BefehlLichtDimmen []";
	}

	private Lichtquelle quelle;
	
	public BefehlLichtDimmen(Lichtquelle quelle) {
		super();
		this.quelle = quelle;
	}

	@Override
	public void fuehreAus() {
		// TODO Auto-generated method stub
		quelle.LichtDimmen();
	}

	@Override
	public IBefehl undo() {
		// TODO Auto-generated method stub
		return this;
	}

	
	
	
}
