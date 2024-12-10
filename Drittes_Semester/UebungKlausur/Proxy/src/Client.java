
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Unterschied Adapter & Proxy
		 * - Proxy: Beide Klassen implementieren das gleiche Interface --> Proxy kann Funktionen hinzufügen
		 * - Adapter: Nur Adapter-Klasse implementiert Interface und benutzt adaptiert Schnittstellen, um diese kompatibel zu machen
		 */
		
		IDateizugriff zugriff = new ProxyDateizugriff("name");
		
	}

}
