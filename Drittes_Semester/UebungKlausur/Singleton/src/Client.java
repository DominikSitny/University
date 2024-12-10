
public class Client {

	public static void main(String[] args) {
		
		//Wichtig: Alles auf static setzen
		
		//synchronized: Kein asynchroner Aufruf --> Können nicht gleichtzeitig durchgeführt werden
		
		Transfermarkt.getInstance();
		
	}
	
}
