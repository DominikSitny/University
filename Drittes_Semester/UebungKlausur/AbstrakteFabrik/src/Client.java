
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Vorteil Abstrakte fabrik: Client hat nur Abhängigkeit zur Konkreten Fabrik
		
		AbstrakteFabrik fabrik = new KonkreteFabkrikSchraube();
		AbstraktesProdukt produkt = fabrik.erzeugeProdukt();
		
	}

}
