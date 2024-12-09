import java.util.ArrayList;
import java.util.List;

public class Stringliste {

	private List<String> list;
	private int index = 0;
	
	public Stringliste() {
		this.list = new ArrayList();
	}
	
	public void addString(String s) {
		this.list.add(s);
	}
	
	public boolean hasNext() {
		if(this.list.get(index) == null) {
			return false;
		}else {
			this.index++;
			return true;
		}
	}
	
	public Object next() {
		return this.list.get(index);
	}
	
}
