import java.util.ArrayList;
import java.util.List;

public abstract class Komponente {

	protected String name;
	protected float preis;
	
	protected List<Komponente>list = new ArrayList<Komponente>();
	
	public Komponente(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public float getPreis() {
		// TODO Auto-generated method stub
		System.out.println("Diese Funktion wird nicht unterstützt");
		return 0;
	}
	
	public void add(Komponente k) {
		// TODO Auto-generated method stub
		System.out.println("Diese Funktion wird nicht unterstützt");
	}

	public void remove(Komponente k) {
		// TODO Auto-generated method stub
		System.out.println("Diese Funktion wird nicht unterstützt");
	}

	@Override
	public String toString() {
		String listData  = "";
		for(Komponente k : list) {
			listData += "\n " +k.toString();
		}
		return "Komponente:  [name=" + name + ", preis=" + preis + ", list=" + listData + "]";
	}
	
	

	
	
	
	
	
}
