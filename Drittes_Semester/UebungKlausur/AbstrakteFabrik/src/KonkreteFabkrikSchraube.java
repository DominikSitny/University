
public class KonkreteFabkrikSchraube implements AbstrakteFabrik {

	@Override
	public AbstraktesProdukt erzeugeProdukt() {
		// TODO Auto-generated method stub
		return new KonkretesProduktSchraube("Schraube");
	}

}
