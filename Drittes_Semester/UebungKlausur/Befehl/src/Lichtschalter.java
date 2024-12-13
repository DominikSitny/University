
public class Lichtschalter {
	
	private Befehlshistorie historie;
	private IBefehl befehl;
	
	public Lichtschalter(Befehlshistorie historie) {
		super();
		this.historie = historie;
	}

	public void speichern(IBefehl befehl) {
		this.befehl = befehl;
		this.historie = historie;
		historie.addBefehl(befehl);
	}
	
	public void aktivieren() {
		befehl.fuehreAus();
	}
	
}
