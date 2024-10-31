package Ue2_PizzeriaBeispiel.src;

public class MuenchenPizzeria extends Pizzeria{

	@Override
	public Pizza erstellePizza(String art, String typ) 
		{
			Pizza pizza = null;
			
			if (art.equals("München"))
			{
				if (typ.equals("Salami"))
				{
					pizza = new MuenchenerSalamiPizza();
				}
				else if (typ.equals("Schinken"))
				{
					pizza = new MuenchenerSchinkenPizza();
				}
				else if (typ.equals("Thunfisch")){
						pizza = new MuenchenerThunfischPizza();
				}
			}
			else {
				System.out.println("Fehler: Ung�ltiger Pizzatyp");
				return null;
			}
			pizza.vorbereiten();
			pizza.backen();
			pizza.schneiden();
			pizza.verpacken();
			return pizza;
		}

}
