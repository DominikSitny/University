package Ue2_PizzeriaBeispiel.src;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pizzeria meinePizzeria = new BerlinPizzeria();
		Pizza neuePizza =  meinePizzeria.erstellePizza("Berlin", "Salami");
		System.out.println(neuePizza.getClass());
	}

}
