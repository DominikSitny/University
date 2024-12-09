
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Komponente speiseplan = new Kompositum("Spieseplan");
		Komponente getraenkeliste = new Kompositum("Getränkeliste");
		Komponente speiseliste = new Kompositum("Speiseliste");
		speiseliste.add(new Blatt("Döner", 16.99f));
		
		Komponente cola = new Blatt("Cola", 1.99f);
		speiseplan.add(getraenkeliste);
		speiseplan.add(speiseliste);
		getraenkeliste.add(cola);
		System.out.println(speiseplan.toString());
		
	}

}
