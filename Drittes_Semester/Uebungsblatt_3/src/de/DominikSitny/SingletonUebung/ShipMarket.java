package de.DominikSitny.SingletonUebung;

import java.util.ArrayList;
import java.util.List;

public class ShipMarket {

	private static ShipMarket instance;
	public static List<Ship> shipsRegister;
	
	private ShipMarket() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShipMarket getInstance() {	
			if(instance == null) {
				instance = new ShipMarket();
				shipsRegister = new ArrayList<Ship>();
				shipsRegister.add(new Ship("Poseidon", 10000));
				shipsRegister.add(new Ship("Neptun", 5000));
				shipsRegister.add(new Ship("Arielle", 20000));
			}	
		return instance;
	}
	
	public void buyShip(ShipOwner owner, int id) {
		Ship ship = shipsRegister.get(id);
		if(ship.getOwner() == null) {
			owner.ueberweisungSenden(ship.getPreis());
			ship.setOwner(owner);
			System.out.println("Glückwunsch! Sie haben das Schiff gekauft.");
			System.out.println(ship.toString());
		}else {
			System.out.println("Das Schiff steht nicht zum Verkauf.");
		}
	}
	
	public void sellShip(ShipOwner owner, int id) {
		Ship ship = shipsRegister.get(id);
		if(ship.getOwner() == null) {
			System.out.println("Das Schiff kann nicht verkauft werden. Es gehört keinem.");
		}else {
			ship.setOwner(null);
			owner.ueberweisungEmpfangen(ship.getPreis());
			System.out.println("Glückwunsch! Das Schiff wurde verkauft.");
		}
	}
	
	public void getShipsRegister() {
		for(Ship ship : shipsRegister) {
			System.out.println(ship.toString());
		}
	}
	
}
