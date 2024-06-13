import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import javax.swing.JScrollPane;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		StudentTableView view = new StudentTableView();
		view.openView((List<Student>)list);
	}

}
