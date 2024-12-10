
public class Transfermarkt {

	private static Transfermarkt instance;
	
	private Transfermarkt() {
		
	}
	
	public static synchronized Transfermarkt getInstance() {
		
		if(instance == null) {
			instance = new Transfermarkt();
		}
		
		return instance;
	}
	
}
