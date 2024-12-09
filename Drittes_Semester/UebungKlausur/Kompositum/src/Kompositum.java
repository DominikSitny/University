
public class Kompositum extends Komponente{

	public Kompositum(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Komponente k) {
		// TODO Auto-generated method stub
		this.list.add(k);
	}

	@Override
	public void remove(Komponente k) {
		this.list.add(k);
	}

	
	
	
}
