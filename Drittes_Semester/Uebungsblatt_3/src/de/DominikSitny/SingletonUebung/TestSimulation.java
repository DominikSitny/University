package de.DominikSitny.SingletonUebung;

public class TestSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShipMarket market = ShipMarket.getInstance();
		
		ShipOwner person1 = new ShipOwner("Dominik", 80000);
		ShipOwner person2 = new ShipOwner("Luke", 1000000);
		
		market.getShipsRegister();
		
		market.buyShip(person1, 1);
		market.buyShip(person2, 1); //Person2 darf nicht Schiff id 1 kaufen
		
		market.sellShip(person1, 1);
		market.buyShip(person2, 1); //Person2 darf Schiff id 1 kaufen
	}

}
