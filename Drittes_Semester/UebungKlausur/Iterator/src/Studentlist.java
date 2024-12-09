import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Studentlist {
	
	ArrayList list = new ArrayList<>();
	
	public Iterator createIterator() {
		return new StudentIterator(list);
	}
	
	public void addStudent(Student s) {
		this.list.add(s);
	}
	
	public List<Student> getStudent(){
		return Collections.unmodifiableList(this.list);
	}
}
