package Ue2_PizzeriaBeispiel.src;

public class Pizzeria {
	
	public Pizzeria()
	{
		
	}
	
	public Pizza erstellePizza(String art, String typ)
	{
		Pizza pizza = null;
		
		if (art.equals("Berlin")) {
			if (typ.equals("Salami"))
			{
				pizza = new BerlinerSalamiPizza();
			}
			else if (typ.equals("Schinken"))
			{
				pizza = new BerlinerSchinkenPizza();
			}
			else if (typ.equals("Thunfisch"))
			{
				pizza = new BerlinerThunfischPizza();
			}
		} else if (art.equals("M�nchen"))
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
	/*	else if(art.equals("Koeln")){
				pizza = new KoelnerHawaiiPizza();
		}*/
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
