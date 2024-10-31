package de.DominikSitny.AbstractFactory.UebungVorlesung;

public class Maschine {

	IFactory fac;
	
	public Maschine(IFactory fac) {
		this.fac = fac;
	}
	
	public IProduct produceSchraube() {
		return fac.createSchraube();
	}
	public IProduct produceMutter() {
		return fac.createMutter();
	}
	
	public void einpacken() {
		IProduct[] schachtelMutter = new MutterM10[10];
		IProduct[] schachtelSchrauben = new SchraubeM10[10];
		
		for(int i=0;i<schachtelMutter.length;i++) {
			schachtelMutter[i] = fac.createMutter();
		}
		
		for(int i=0;i<schachtelSchrauben.length;i++) {
			schachtelSchrauben[i] = fac.createSchraube();
		}
	}
}
