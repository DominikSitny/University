package de.DominikSitny.SingletonUebung;

public class ShipOwner {

	private String Name;
	private double bankAcc;
	
	
	
	public ShipOwner(String name, double bankAcc) {
		Name = name;
		this.bankAcc = bankAcc;
	}
	
	public String getName() {
		return Name;
	}
	
	public void ueberweisungSenden(double betrag) {
		this.bankAcc =- betrag;
	}
	
	public void ueberweisungEmpfangen(double betrag) {
		this.bankAcc =+ betrag;
}
}
