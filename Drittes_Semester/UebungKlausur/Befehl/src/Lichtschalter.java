
public class Lichtschalter {
	
	private IBefehl befehl;
	
	public void speichern(IBefehl befehl) {
		this.befehl = befehl;
	}
	
	public void aktivieren() {
		befehl.fuehreAus();
	}
}
