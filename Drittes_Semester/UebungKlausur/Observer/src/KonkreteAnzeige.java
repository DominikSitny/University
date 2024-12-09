
public class KonkreteAnzeige implements IAnzeige{

	private IFuehler fuehler;
	
	@Override
	public void registriereFuehler(IFuehler fuehler) {
		// TODO Auto-generated method stub
		this.fuehler = fuehler;
	}

	@Override
	public void entferneFuehler() {
		// TODO Auto-generated method stub
		this.fuehler = null;
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("Anzeige: " + this.fuehler.getAnzeige());
	}

}
