import java.util.ArrayList;
import java.util.Iterator;

public class StudentIterator implements Iterator{

	ArrayList element; 
	int position=0;
	
	
	public StudentIterator(ArrayList element) {
		super();
		this.element = element;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(element.size()<=position) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object o = element.get(position);
		position++;
		return o;
	}

	
}
