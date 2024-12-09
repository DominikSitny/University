
public class KonkreterFuehler implements IFuehler{

	private int stand = 0;
	private IAnzeige anzeige;
	

	@Override
	public void entferneAnzeige() {
		// TODO Auto-generated method stub
		this.anzeige = null;
	}

	@Override
	public void aktualisiereStand() {
		// TODO Auto-generated method stub
		this.stand++;
		
	}

	@Override
	public void registriereAnzeige(IAnzeige anzeige) {
		// TODO Auto-generated method stub
		this.anzeige = anzeige;
	}

	@Override
	public int getAnzeige() {
		// TODO Auto-generated method stub
		return this.stand;
	}

}
