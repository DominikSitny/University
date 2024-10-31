package de.DominikSitny.KompositumSpeisekarteMitInterface;

public interface Speisekartenkomponente {
	
	public String getName() ;
	public String getBeschreibung();
	public double getPreis();
	public boolean isVegetarisch();	
	public void ausgeben();
	public void hinzufuegen(Speisekartenkomponente sk);
	public void eintfernen(Speisekartenkomponente sk);
	public void getKind();
	
}
