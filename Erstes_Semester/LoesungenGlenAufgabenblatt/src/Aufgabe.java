import edu.princeton.cs.introcs.StdIn;

public class Aufgabe {

public void taschenrechner() {
		
		String input = "";	
		do{				
			input += StdIn.readChar();			
		}while(!(input.contains("=")));
		
		System.out.println(input);
	}
	
}
