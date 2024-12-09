
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFuehler fuehler = new KonkreterFuehler();
		IAnzeige anzeige = new KonkreteAnzeige();
		
		anzeige.registriereFuehler(fuehler);
		
		fuehler.registriereAnzeige(anzeige);
		
		for(int i = 0; i<10;i++) {
			fuehler.aktualisiereStand();
			anzeige.showData();
		}
		
	}

}
