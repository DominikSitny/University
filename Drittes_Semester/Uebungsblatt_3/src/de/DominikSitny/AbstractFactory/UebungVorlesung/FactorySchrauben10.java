package de.DominikSitny.AbstractFactory.UebungVorlesung;

public class FactorySchrauben10 implements IFactory{

	@Override
	public IProduct createSchraube() {
		// TODO Auto-generated method stub
		return new SchraubeM10();
	}

	@Override
	public IProduct createMutter() {
		// TODO Auto-generated method stub
		return new MutterM10();
	}

	

	
	
}
